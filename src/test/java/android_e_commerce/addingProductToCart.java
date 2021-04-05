package android_e_commerce;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class addingProductToCart extends base{

    public static void main(String[] args) throws MalformedURLException {


        AndroidDriver<AndroidElement> driver = Capabilities();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Angela");
        driver.hideKeyboard();
        driver.findElement(By.xpath("//*[@text='Female']")).click();

        driver.findElement(By.id("android:id/text1")).click();
        driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Australia\"));");
        driver.findElement(By.xpath("//*[@text='Australia']")).click();

        driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();


        driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()" +
                ".resourceId(\"com.androidsample.generalstore:id/rvProductList\"))" +
                ".scrollIntoView(new UiSelector().textMatches(\"Converse All Star\").instance(0))"));

        int count = driver.findElements(By.id("com.androidsample.generalstore:id/productName")).size();

        for(int i=0;i<count;i++)

        {

            String text=driver.findElements(By.id("com.androidsample.generalstore:id/productName")).get(i).getText();


            if(text.equalsIgnoreCase("Converse All Star"))

            {

                driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();

                break;

            }

        }

        driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

        String lastpageText=    driver.findElement(By.id("com.androidsample.generalstore:id/productName")).getText();

        Assert.assertEquals("Converse All Star", lastpageText);



    }
}
