package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MyAccountPage {
    WebDriver driver;
    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    private By continueForRegisterButton = By.xpath("//a[text()='Continue']");
    private By emailField = By.id("input-email");
    private By passwordField = By.id("input-password");
    private By loginButton = By.xpath("//input[@type='submit']");

    public RegisterPage clickOnContinueForRegisterOption() {
        driver.findElement(continueForRegisterButton).click();
        return new RegisterPage(driver);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecureAreaPage clickLoginButton() {
        driver.findElement(loginButton).click();
        return new SecureAreaPage(driver);
    }
    public boolean isLoginButtonVisible() {
        return driver.findElement(loginButton).isDisplayed();
    }
}
