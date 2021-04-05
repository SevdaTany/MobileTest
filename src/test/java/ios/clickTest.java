package ios;

import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;

public class clickTest extends base {

    public static void main(String[] args) throws MalformedURLException {


        IOSDriver driver = DesiredCapibilities();

        driver.findElementByAccessibilityId("Alert Views").click();
        driver.findElementByXPath("//XCUIElementTypeStaticText[@name='Text entry']").click();
        driver.findElementByXPath("//XCUIElementTypeCell").sendKeys("Hello");
        driver.findElementByAccessibilityId("OK").click();
        driver.findElementByAccessibilityId("Confirm / Cancel").click();
        System.out.println(driver.findElementByXPath("//*[contains(@name,'message')]").getText());
        driver.findElementByAccessibilityId("Confirm").click();

    }
}
