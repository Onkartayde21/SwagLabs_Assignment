import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_EmptyCart extends BaseTest {

    @Test
    public void removeItem() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new LoginPage(driver).performlogin("standard_user","secret_sauce")
                .clickAddToCartButton()
                .viewCart()
                .clickRemoveButton();
        Assert.assertNotEquals("//android.view.ViewGroup[@content-desc=\"test-Item\"]","empty");
    }
}
