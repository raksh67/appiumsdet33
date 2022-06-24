package activityappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class NotificationPopup {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		//common dc (android or IOS)
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");
		
		//capability of app
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		//Appium server URL
		URL url=new URL("http://localhost:4723/wd/hub");
				
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElementByAccessibilityId("App").click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Notification\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"IncomingMessage\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/notify_app")).click();
		driver.openNotifications();
		scrollToElement(driver,"text","Joe");
		
	
		driver.tap(1, 176, 1428, 500);
		
		
	}

	private static void scrollToElement(AndroidDriver driver, String string, String string2) {
		// TODO Auto-generated method stub
		
	}

}//?
