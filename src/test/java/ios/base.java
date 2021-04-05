package ios;



import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class base {

    public static IOSDriver DesiredCapibilities() throws MalformedURLException {

       // IOSDriver<IOSElement> driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"14.4");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"iPhone XSMAX");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST);
        capabilities.setCapability(IOSMobileCapabilityType.LAUNCH_TIMEOUT,50000);

        capabilities.setCapability(MobileCapabilityType.APP,"users/emrahtan/Desktop/UIKitCatalog.app");

        IOSDriver driver = new IOSDriver<>(new URL("http://localhost:4723/wd/hub"),capabilities);

        return driver;







    }


}
