package AppiumClassActivity;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class LaunchCalculatorApp {
	
	@Test

	public static void calculator() throws MalformedURLException {
DesiredCapabilities dc=new DesiredCapabilities();
//common dc (android or IOS)
dc.setCapability("deviceName", "Redmi");
dc.setCapability("automationName", "appium");
dc.setCapability("platformName", "Android");
dc.setCapability("platformVersion", "9");
dc.setCapability("UDID", "d3d9cc1b");

//dc for android
dc.setCapability("appPackage", "com.miui.calculator");
dc.setCapability("appActivity", ".cal.CalculatorActivity");

//Appium server URL
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.findElement(By.id("android:id/button1")).click();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	}

}
//success