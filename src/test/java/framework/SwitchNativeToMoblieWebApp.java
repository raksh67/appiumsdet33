package framework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwitchNativeToMoblieWebApp {
	public static void main (String[]args) throws MalformedURLException, InterruptedException {
	DesiredCapabilities cap = new DesiredCapabilities();
	
	//common capabilities for android
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
	cap.setCapability(MobileCapabilityType.UDID, "d3d9cc1b");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"appium");
	cap.setCapability(MobileCapabilityType.NO_RESET, true);
	
	
	//launch browser 
	cap.setCapability("browserName", "Chrome");
	
	//Appium server URL
	URL url=new URL("http://localhost:4723/wd/hub");
	
	Thread.sleep(2000);
    AndroidDriver driver=new AndroidDriver(url,cap);
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    
    driver.get("http://www.facebook.com");
    driver.findElement(By.xpath("//a[@id='signup-button']")).click();
	}
}
	