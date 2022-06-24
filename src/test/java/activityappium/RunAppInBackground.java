package activityappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class RunAppInBackground {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("deviceId", "d3d9cc1b");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");
		
		URL url =new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.runAppInBackground(10);
		driver.findElementByAccessibilityId("Views").click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
		//1st
		driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1")).click();
		//2nd
		driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2")).click();
		
		
	}

}//??
