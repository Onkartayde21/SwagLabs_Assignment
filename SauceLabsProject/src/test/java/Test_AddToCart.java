import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_AddToCart extends BaseTest {
    @Test
    public void addToCartTest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        new LoginPage(driver).performlogin("standard_user","secret_sauce")
                .clickAddToCartButton();

        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text=\"REMOVE\"]")).isDisplayed());
        //This assertion checks if the item is successfully added in to the cart by check if remove button is displayed.

        Assert.assertEquals(new HomePage(driver).productInfo(), new CartPage(driver).itemName());
        //This assertion checks whether the name of item in home page is equal to the new of item in cart page.

        Assert.assertEquals(new HomePage(driver).productrate(),new CartPage(driver).itemPrice());
        //This assertion checks if the price of item in home page and price of item in cart page are equal.
    }

    @Test
    public void CartTest(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new LoginPage(driver).performlogin("standard_user","secret_sauce")
                .clickAddToCartButton().viewCart();

        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text=\"YOUR CART\"]")).isDisplayed());
        //This assertion checks if the Cart is accessible by verifying that unique field Your Tag is displayed.

    }
}
