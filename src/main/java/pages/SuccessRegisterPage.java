package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SuccessRegisterPage {
    WebDriver driver;
    public SuccessRegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    private By successMessage = By.xpath("//*[contains(text(),'Congratulations')]");

    public String getSuccessMessage() {
        return driver.findElement(successMessage).getText();
    }
}
