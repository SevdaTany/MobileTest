package androidEmulator;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class gestures extends base{

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

       driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();

       TouchAction ta = new TouchAction(driver);
       WebElement animation = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Animation\"]");
       ta.tap(tapOptions().withElement(element(animation))).perform();

       driver.findElementByXPath("android.widget.TextView[@text=['3D Transition']").click();
       WebElement lyon = driver.findElementByXPath("android.widget.TextView[@text=['Lyon']");
       ta.longPress(longPressOptions().withElement(element(lyon))
                                       .withDuration(ofSeconds(2)))
                                        .release().perform();

        System.out.println(driver.findElementById("io.appium.android.apis:id/picture").isDisplayed());




        // Tap
//        TouchAction t = new TouchAction(driver);
//        WebElement expandList = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]");
//        t.tap(tapOptions().withElement(element(expandList))).perform();
//
//        driver.findElementByXPath("//android.widget.TextView[@text='Custom Adapter']").click();
//       WebElement pn =  driver.findElementByXPath("//android.widget.TextView[@text='People Name']");
//       t.longPress(LongPressOptions.longPressOptions().withElement(element(pn)).withDuration(Duration.ofSeconds(2))).release().perform();
//
//        System.out.println(driver.findElementById("android:id/title").isDisplayed());
//



//        WebElement customAdapter = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]");
//       t.tap(tapOptions().withElement(element(customAdapter))).perform();
//
//       WebElement peopleNames = driver.findElementByXPath("android.widget.TextView[@text='People Names']");
//       t.longPress(element(peopleNames));



    }




}
