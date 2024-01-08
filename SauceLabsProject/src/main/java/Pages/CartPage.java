package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    WebDriver driver;

    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    By cartItemName = By.xpath("//android.widget.TextView[@text=\"Sauce Labs Backpack\"]");
    By cartItemPrice = By.xpath("//android.widget.TextView[@text=\"$29.99\"]");
    By removeButton = By.xpath("//android.view.ViewGroup[@content-desc=\"test-REMOVE\"]");
    By continueButton = By.xpath("//android.widget.TextView[@text=\"CONTINUE SHOPPING\"]");
    By checkOut = By.xpath("//android.widget.TextView[@text=\"CHECKOUT\"]");

    public CartPage clickRemoveButton(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(d -> driver.findElement(removeButton));
        driver.findElement(removeButton).click();
        return new CartPage(driver);
    }

    public void continueShoppingButton(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(continueButton).click();

    }
    public CheckOutPage checkOut(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(checkOut).click();
        return new CheckOutPage(driver);
    }

    public WebElement itemName(){
        return driver.findElement(cartItemName);
    }

    public WebElement itemPrice(){
        return driver.findElement(cartItemPrice);
    }
}
