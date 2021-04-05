package ios;

import io.appium.java_client.ios.IOSDriver;

import java.net.MalformedURLException;
import java.util.HashMap;

public class scroll_picker extends base {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        IOSDriver driver = DesiredCapibilities();

        //For scroll/swipe, we have to use hashmap to show the direction
        HashMap<String,Object>scrollObject = new HashMap<>();
        scrollObject.put("direction","down");
        scrollObject.put("name","Web View");

        driver.executeScript("mobile:scroll",scrollObject);
        driver.findElementByAccessibilityId("Web View").click();

        // How to handle Picker
        Thread.sleep(2000);
        driver.findElementByXPath("//XCUIElementTypeButton[@name='UIKitCatalog']").click();
        driver.findElementByAccessibilityId("Picker View").click();
        driver.findElementByAccessibilityId("Red color component value").sendKeys("80");
        driver.findElementByAccessibilityId("Green color component value").sendKeys("220");
        driver.findElementByAccessibilityId("Blue color component value").sendKeys("105");

        System.out.println(driver.findElementByAccessibilityId("Blue color component value").getText());

    }

}
