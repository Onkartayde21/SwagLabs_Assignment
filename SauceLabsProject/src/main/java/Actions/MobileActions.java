package Actions;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.WebDriver;

public class MobileActions {
    private static WebDriver driver;

    public MobileActions(WebDriver driver) {
        MobileActions.driver = driver;
    }

    /**
     * This method is to scroll down to specific text/Element by passing only the text appeared on the screen
     *
     * @param text the text or element you want to scroll to
     */
    public void scrollDownToSpecificText(String text) {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)" + ".instance(0)).scrollIntoView(new UiSelector().textMatches(\"" + text + "\").instance(0))"));
    }

    /**
     * This method is to scroll down to a text or Element that containing a text that happened by passing only the text appeared on the screen
     *
     * @param text the text or element you want to scroll to
     */
    public void scrollDownToSpecificTextContained(String text) {
        driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)" + ".instance(0)).scrollIntoView(new UiSelector().textContains(\"" + text + "\").instance(0))"));
    }

    /**
     * This a private method the purpose of that is to swipe right
     *
     * @param element the webElement that you want to get its location
     * @param driver  an instance of your driver
     */
}
