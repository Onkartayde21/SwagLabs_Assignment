package Pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    By usernameInput = AppiumBy.accessibilityId("test-Username");
    By passwordInput = AppiumBy.accessibilityId("test-Password");
    By loginbutton = AppiumBy.accessibilityId("test-LOGIN");


    public HomePage performlogin(String username, String password){
        driver.findElement(usernameInput).sendKeys(username);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginbutton).click();
        return new HomePage(driver);
    }

    public WebElement productTag(){
        return driver.findElement(By.xpath("//android.widget.TextView[@text=\"PRODUCTS\"]"));
    }

    public static By getErrorMessage(){
        By errorMessage = AppiumBy.accessibilityId("test-Error message");
        return errorMessage;
    }

}
