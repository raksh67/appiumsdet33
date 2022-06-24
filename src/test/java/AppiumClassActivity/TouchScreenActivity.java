package AppiumClassActivity;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TouchScreenActivity {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		//common dc (android or IOS)
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");

		//dc for android
		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");

		//Appium server URL
				URL url=new URL("http://localhost:4723/wd/hub");
				
				AndroidDriver driver=new AndroidDriver(url,dc);

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//horizontal swipe
				driver.swipe(31, 1080, 997, 1111, 500);

				//vertical swipe
driver.swipe(490, 190, 497, 1953, 500);

Dimension size =driver.manage().window().getSize();
int height = size.getHeight();
int width = size.getWidth();
System.out.println(height);
System.out.println(width);


		}
}