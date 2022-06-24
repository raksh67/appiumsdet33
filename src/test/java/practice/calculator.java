package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class calculator {

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
driver.findElement(By.id("android:id/button1")).click();
//click two
driver.findElement(By.id("com.miui.calculator:id/btn_2_s")).click();
//plus
driver.findElementByAccessibilityId("plus").click();
//five
driver.findElement(By.id("com.miui.calculator:id/btn_5_s")).click();
//equals
driver.findElementByAccessibilityId("equals").click();
String answer = driver.findElement(By.id("com.miui.calculator:id/result")).getText();
System.out.println(answer);



	}

}
