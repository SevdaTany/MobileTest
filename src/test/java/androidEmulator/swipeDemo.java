package androidEmulator;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class swipeDemo extends base {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        AndroidDriver<AndroidElement> driver = Capabilities();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Views\"]").click();

        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Date Widgets\"]").click();

        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"2. Inline\"]").click();

        driver.findElementByXPath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"9\"]").click();

        //driver.findElementByXPath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"5\"]").click();

        WebElement five = driver.findElementByXPath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"5\"]");

        WebElement fifteen = driver.findElementByXPath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]");
        WebElement forty_five = driver.findElementByXPath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"45\"]");



        TouchAction t = new TouchAction(driver);
       // t.tap(TapOptions.tapOptions().withElement(ElementOption.element(five))).perform();


        t.longPress(longPressOptions().withElement(element(fifteen))
                                        .withDuration(ofSeconds(2)))
                                        .moveTo(element(forty_five))
                                        .release().perform();


    }
}