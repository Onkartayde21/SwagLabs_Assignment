import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Test_Login extends BaseTest {

    @Test
    public void testValidLogin(){
        Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        new LoginPage(driver).performlogin("standard_user","secret_sauce");
        Assert.assertTrue(new LoginPage(driver).productTag().isDisplayed());

    }

    @Test
    public void testInvalidLogin(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        new LoginPage(driver).performlogin("locked_out_user","secret_sauce");
        Assert.assertTrue(driver.findElement(LoginPage.getErrorMessage()).isDisplayed());

    }

}
