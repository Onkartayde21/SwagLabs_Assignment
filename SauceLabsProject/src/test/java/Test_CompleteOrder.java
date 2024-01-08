import Pages.CheckoutOverviewPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_CompleteOrder extends BaseTest {

    @Test
    public void completeOrder(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new LoginPage(driver).performlogin("standard_user","secret_sauce")
                .clickAddToCartButton()
                .viewCart()
                .checkOut()
                .checkoutInformation("Onkar","Tayade","231546")
                .clickFinishButton();

        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text=\"BACK HOME\"]")).isDisplayed());

    }

    @Test
    public void clickFinishBtnTest() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new LoginPage(driver).performlogin("standard_user","secret_sauce")
                .clickAddToCartButton();

        String homeProductName = String.valueOf(new HomePage(driver).productInfo());
        String homeProductPrice = String.valueOf(new HomePage(driver).productrate());

        new HomePage(driver).viewCart().checkOut()
                .checkoutInformation("Onkar","Tayade","213546");

        String overviewItemName= new CheckoutOverviewPage(driver).newItemName();
        String overviewItemPrice= new CheckoutOverviewPage(driver).newItemPrice();

        Assert.assertEquals(homeProductName,overviewItemName);
        Assert.assertEquals(homeProductPrice,overviewItemPrice);

        new CheckoutOverviewPage(driver).clickFinishButton();
        Assert.assertTrue(driver.findElement(By.xpath("//android.widget.TextView[@text=\"BACK HOME\"]")).isDisplayed());
    }

}
