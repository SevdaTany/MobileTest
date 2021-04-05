package androidRealDevice;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

import java.net.MalformedURLException;

public class browse extends baseChrome{

    public static void main(String[] args) throws MalformedURLException {

        // TODO Auto-generated method stub
        AndroidDriver<AndroidElement> driver = cap();
       // driver.get("http://google.com");

        driver.get("http://facebook.com");
        driver.findElementByXPath("//*[@id='u_0_1']/div[1]/div/input").sendKeys("sssssss");
        driver.findElementByName("pass").sendKeys("12345678");
        driver.findElementByXPath("//button[@value='Log In']").click();

    }
}
