package Pages;

import Actions.MobileActions;
import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
    WebDriver driver;
    public CheckoutOverviewPage(WebDriver driver) {
        this.driver=driver;
    }
    By overviewProductName = By.xpath("//android.widget.TextView[@text=\"Sauce Labs Backpack\"]");
    By overviewProductPrice = By.xpath("//android.widget.TextView[@text=\"$29.99\"]");
    By finishButton= AppiumBy.accessibilityId("test-FINISH");

    public void clickFinishButton(){
        MobileActions mb = new MobileActions(driver);
        mb.scrollDownToSpecificText("FINISH");
        driver.findElement(finishButton).click();
    }

    public String newItemName(){
        return driver.findElement(overviewProductName).getText();
    }

    public String newItemPrice(){
        return driver.findElement(overviewProductPrice).getText();
    }
}
