package androidEmulator;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class uiAutomator extends base {

    public static void main(String[] args) throws MalformedURLException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       // driver.findElementByAndroidUIAutomator("attribute(\"value\")");

        driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
        driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();

        // Validate clickable feature for all options
        // new UiSelector() is used for properties like clickable, checked, enabled, display,scrollable, checkable etc.
        //  driver.findElementsByAndroidUIAutomator("new UiSelector().property(value)");
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size());
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().checked(true)").size());
        System.out.println(driver.findElementsByAndroidUIAutomator("new UiSelector().checkable(false)").size());






    }
}
