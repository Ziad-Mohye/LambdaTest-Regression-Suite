package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // locators
    private By myAccountMnu = By.xpath("(//a[@class='icon-left both nav-link dropdown-toggle'])[3]");
    private By megaMnu = By.xpath("(//a[@class='icon-left both nav-link dropdown-toggle'])[1]");

    // Actions
    public MyAccountPage clickMyAccount() {
        driver.findElement(myAccountMnu).click();
        return new MyAccountPage(driver);
     }
     
     public void hoverMegaMenu() {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(megaMnu)).perform();
     }

     public SubMenuPage clickOnSubMenu(String subMenu) {
        By subMenuLocator = By.xpath("//a[contains(text(),'" + subMenu + "')]");
        driver.findElement(subMenuLocator).click();
        return new SubMenuPage(driver);
     }



}