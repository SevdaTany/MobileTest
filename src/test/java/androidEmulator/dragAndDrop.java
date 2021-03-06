package androidEmulator;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class dragAndDrop extends base {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();

        driver.findElementByXPath("//android.widget.TextView[@text=\"Drag and Drop\"]").click();

        WebElement source = driver.findElementsByClassName("android.view.View").get(0);
        WebElement destination = driver.findElementsByClassName("android.view.View").get(1);

        TouchAction t = new TouchAction(driver);
        t.longPress(LongPressOptions.longPressOptions()
                         .withElement(element(source))
                         .withDuration(ofSeconds(2)))
                         .moveTo(element(destination)).release().perform();


//        t.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(source)))
//                .moveTo((PointOption) destination).release().perform();


        //      t.longPress(ElementOption.element(source)).moveTo(ElementOption.element(destination)).release().perform();


    }
}