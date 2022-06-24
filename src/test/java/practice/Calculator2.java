package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Calculator2 {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "android");
		dc.setCapability(MobileCapabilityType.UDID, "d3d9cc1b");

		dc.setCapability("appPackage", "com.miui.calculator");
		dc.setCapability("appActivity", ".cal.CalculatorActivity");

		URL url =new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver =new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//agree
		WebElement agree = driver.findElement(By.id("android:id/button1"));
		driver.tap(1, agree, 500);
		//click two
		WebElement two = driver.findElement(By.id("com.miui.calculator:id/btn_2_s"));
		driver.tap(1, two, 500);
		//plus
		WebElement plus = driver.findElementByAccessibilityId("plus");
		driver.tap(1, plus, 500);
		//five
		WebElement five = driver.findElement(By.id("com.miui.calculator:id/btn_5_s"));
		driver.tap(1, five, 500);
		//equals
		WebElement equals = driver.findElementByAccessibilityId("equals");
		driver.tap(1, equals, 500);
		
		String answer = driver.findElement(By.id("com.miui.calculator:id/result")).getText();
		System.out.println(answer);


	}

}
