package userAccount;

import baseTest.BaseTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class Login extends BaseTest {
    @Test
    public void validLogin() {
        myAccountPage = homePage.clickMyAccount();
        myAccountPage.enterEmail("ziadmohey@gmail.com");
        myAccountPage.enterPassword("1234");
        secureAreaPage = myAccountPage.clickLoginButton();
        
        String actualResult = secureAreaPage.getMyAccountHeaderText();
        String expectedResult = "My Account";
        assert actualResult.contains(expectedResult);
    }
    
    @Test
    public void invalidLogin() {
        myAccountPage = homePage.clickMyAccount();
        myAccountPage.enterEmail("invalid@email.com");
        myAccountPage.enterPassword("wrongpassword");
        myAccountPage.clickLoginButton();
        
        Assert.assertTrue(myAccountPage.isLoginButtonVisible());
    }
}
