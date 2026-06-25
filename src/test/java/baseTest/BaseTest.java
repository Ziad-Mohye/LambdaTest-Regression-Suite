package baseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.*;

public class BaseTest {
    public WebDriver driver;
    public HomePage homePage;
    public SuccessRegisterPage successRegisterPage;
    public MyAccountPage myAccountPage;
    public SecureAreaPage secureAreaPage;
    public RegisterPage registerPage;
    public SubMenuPage subMenuPage;


    @BeforeClass
    public void setup(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public void goHome(){
        driver.get("https://ecommerce-playground.lambdatest.io/index.php?route=common/home");
    }

    @AfterClass
    public void close(){
        driver.quit();
    }
}
