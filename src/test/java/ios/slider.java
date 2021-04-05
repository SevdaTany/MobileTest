package ios;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Assert;

import java.net.MalformedURLException;
import java.util.HashMap;

public class slider extends base {

    public static void main(String[] args) throws MalformedURLException {


        IOSDriver driver = DesiredCapibilities();

        driver.findElementByAccessibilityId("Sliders").click();

        //For slider, we cast it with IOSElement
        IOSElement slider = (IOSElement)driver.findElementByXPath("//XCUIElementTypeSlider");
        slider.setValue("0%");
        slider.setValue("0.66%");
        slider.setValue("1%");
        Assert.assertEquals("100%",slider.getAttribute("value"));

    }
}
