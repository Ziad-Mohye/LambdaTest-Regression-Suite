package userAccount;

import baseTest.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyAccountPage;
import pages.RegisterPage;

public class Register extends BaseTest {
    @Test
    public void validRegister() {
        myAccountPage = homePage.clickMyAccount();
        RegisterPage registerPage = myAccountPage.clickOnContinueForRegisterOption();
        registerPage.enterFirstName("Ziad");
        registerPage.enterLastName("Hammoud");
        registerPage.enterEmail("ziadtest" + System.currentTimeMillis() + "@gmail.com");
        registerPage.enterTelephone("123456789");
        registerPage.enterPassword("12345678");
        registerPage.enterConfirmPassword("12345678");
        registerPage.selectNewsletterYesOption();
        registerPage.agreeToTerms();
        successRegisterPage = registerPage.clickContinue();

        String actualResult = successRegisterPage.getSuccessMessage();
        String expectedResult = "Congratulations! Your new account has been successfully created!";
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
    
    @Test
    public void invalidRegister() {
        MyAccountPage myAccountPage = homePage.clickMyAccount();
        registerPage = myAccountPage.clickOnContinueForRegisterOption();
        registerPage.enterFirstName("");
        registerPage.enterLastName("Hammoud");
        registerPage.enterEmail("test@gmail.com");
        registerPage.enterTelephone("123");
        registerPage.enterPassword("123");
        registerPage.enterConfirmPassword("123");
        registerPage.selectNewsletterYesOption();
        registerPage.agreeToTerms();
        registerPage.clickContinue();

        Assert.assertTrue(registerPage.isContinueButtonVisible());
    }
}
