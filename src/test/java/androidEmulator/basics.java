package androidEmulator;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class basics extends base {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
        driver.findElementByAccessibilityId("3. Preference dependencies").click();
        driver.findElementById("android:id/checkbox").click();
        driver.findElementByXPath("(//android.widget.RelativeLayout)[2]").click();
        Thread.sleep(2);
        driver.findElementByClassName("android.widget.EditText").sendKeys("Hello");
        Thread.sleep(10);
        driver.findElementById("android:id/button1").click();






    }



}
