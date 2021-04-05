package androidRealDevice;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class baseChrome {

    // For real devices

    public static AndroidDriver<AndroidElement> cap() throws MalformedURLException {
        AndroidDriver<AndroidElement> driver;

        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

        driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);

        return driver;




    }

}
