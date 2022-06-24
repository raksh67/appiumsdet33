package AppiumClassActivity;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class CalculatorActivityWithTap {
	public static AndroidDriver driver;
	public static void main (String[]args) throws MalformedURLException {
DesiredCapabilities cap = new DesiredCapabilities();
		
		//common capabilities for android
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.UDID, "d3d9cc1b");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		
		//capability of app
		cap.setCapability("appPackage", "com.miui.calculator");
		cap.setCapability("appActivity", ".cal.CalculatorActivity");
		
		//Appium server URL
		URL url=new URL("http://localhost:4723/wd/hub");
		
	    driver=new AndroidDriver(url,cap);
		
		driver.findElement(By.id("android:id/button1")).click();
		
		WebElement five = driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
		//five.click();
		driver.tap(1, five, 500);
		WebElement plus = driver.findElement(By.id("com.miui.calculator:id/btn_plus_s"));
		//plus.click();
		driver.tap(1, plus, 500);
		WebElement two = driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
		//two.click();
		driver.tap(1, two, 500);
		WebElement equals = driver.findElement(By.id("com.miui.calculator:id/btn_equal_s"));
		//equals.click();
		driver.tap(1, equals, 500);
		String text = driver.findElement(By.id("com.miui.calculator:id/result")).getText();
		System.out.println(text);

	}

}//success
