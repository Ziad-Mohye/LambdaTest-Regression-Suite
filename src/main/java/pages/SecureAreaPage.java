package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    WebDriver driver;
    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    private By myAccountHeader = By.xpath("//h2[contains(text(),'My Account')]");

    public String getMyAccountHeaderText() {
        return driver.findElement(myAccountHeader).getText();
    }
}
