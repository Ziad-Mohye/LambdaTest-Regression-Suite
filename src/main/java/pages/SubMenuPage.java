package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SubMenuPage {
    WebDriver driver;
    public SubMenuPage(WebDriver driver) {
        this.driver = driver;
     }

    // locators
    private By macBookProduct = By.xpath("//a[contains(text(),'MacBook')]");
    private By addToCartBtn = By.id("button-cart");
    private By successMsg = By.cssSelector(".alert-success");

    // Actions
    public void clickOnProduct(String productName) {
        By productLocator = By.xpath("//a[contains(text(),'" + productName + "')]");
        driver.findElement(productLocator).click();
    }


    public void clickAddToCart() {
    }

    public String getSuccessMessage() {
        return null;
    }
}
