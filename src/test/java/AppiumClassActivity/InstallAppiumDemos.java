package AppiumClassActivity;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class InstallAppiumDemos {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		//common dc (android or IOS)
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");

		dc.setCapability("app", "C:\\APKFILES\\ApiDemos-debug.apk");

		//Appium server URL
				URL url=new URL("http://localhost:4723/wd/hub");
				
				AndroidDriver driver=new AndroidDriver(url,dc);

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			}

		}//success