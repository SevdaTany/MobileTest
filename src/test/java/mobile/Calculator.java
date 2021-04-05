package mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {

    public static void main(String[] args) {

    }

    public static void openCalculator(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName","Pixel_2");
        desiredCapabilities.setCapability("`udid`","emulator-5554");
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","7.0");


        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.android.calculator2");
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.android.calculator2.Calculator");


//        URL url = null;
//        try {
//            url = new URL("http://localhost:4723/wd/hub");
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        }
           // driver = new AndroidDriver<>(url,desiredCapabilities);

    }

//    @Test
//    public void calculatorTest(){
//        //test settings and device info
//
//        AndroidElement btn2 = driver.find


    }




//}
