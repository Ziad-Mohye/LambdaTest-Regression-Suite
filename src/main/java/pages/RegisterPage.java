package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    private By firstNameField = By.id("input-firstname");
    private By lastNameField = By.id("input-lastname");
    private By emailField = By.id("input-email");
    private By telephoneField = By.id("input-telephone");
    private By passwordField = By.id("input-password");
    private By confirmPasswordField = By.id("input-confirm");
    private By newsletterYesOption = By.cssSelector("[for='input-newsletter-yes']");
    private By newsletterNoOption = By.cssSelector("[for='input-newsletter-no']");
    private By agreeTermsOption = By.cssSelector("[for='input-agree']");
    private By continueButton = By.xpath("//input[@value='Continue']");


    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }
    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }
    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }
    public void enterTelephone(String telephone) {
        driver.findElement(telephoneField).sendKeys(telephone);
    }
    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }
    public void enterConfirmPassword(String confirmPassword) {
        driver.findElement(confirmPasswordField).sendKeys(confirmPassword);
    }
    public void selectNewsletterYesOption() {
        driver.findElement(newsletterYesOption).click();
    }
    public void selectNewsletterNoOption() {
        driver.findElement(newsletterNoOption).click();
    }
    public void agreeToTerms() {
        driver.findElement(agreeTermsOption).click();
    }
    public SuccessRegisterPage clickContinue() {
        driver.findElement(continueButton).click();
        return new SuccessRegisterPage(driver);
    }

    public boolean isContinueButtonVisible(){
        return driver.findElement(continueButton).isDisplayed();
    }
}
