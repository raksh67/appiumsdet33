package AppiumClassActivity;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class UninstallApiDemosAppActivity {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		//common dc (android or IOS)
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");

		//dc for android
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");

		//Appium server URL
				URL url=new URL("http://localhost:4723/wd/hub");
				Thread.sleep(3000);
				AndroidDriver driver=new AndroidDriver(url,dc);

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				System.out.println("App status"+driver.isAppInstalled("io.appium.android.apis"));
				driver.removeApp("io.appium.android.apis");
				System.out.println("App status"+driver.isAppInstalled("io.appium.android.apis"));
				Thread.sleep(3000);

	}
		}