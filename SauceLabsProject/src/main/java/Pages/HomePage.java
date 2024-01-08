package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    By productName = By.xpath("//android.widget.TextView[@content-desc=\"test-Item title\" and @text=\"Sauce Labs Backpack\"]");
    By productPrice = By.xpath("//android.widget.TextView[@content-desc=\"test-Price\" and @text=\"$29.99\"]");
    By addToCart = By.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]");

    By cartIcon = By.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView");

    By removeButton = By.xpath("//android.widget.TextView[@text=\"REMOVE\"]");

    public HomePage clickAddToCartButton(){
        driver.findElement(addToCart).click();
        return new HomePage(driver);
    }

    public CartPage viewCart(){
        driver.findElement(cartIcon).click();
        return new CartPage(driver);
    }




    public String productInfo(){
        return driver.findElement(productName).getText();
    }

    public String productrate(){
        return driver.findElement(productPrice).getText();
    }

//    public WebElement cartTag(){
//        return driver.findElement(By.xpath("//android.widget.TextView[@text=\"YOUR CART\"]"));
//    }
}
