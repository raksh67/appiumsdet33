package appium_generic_utility;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class MobileDriverUtility extends BaseClass {
	public AndroidDriver driver;
	public FileUtility fd=new FileUtility();


	public  void zoom(AndroidDriver driver,WebElement element) {
		driver.zoom(element);

	}
	
	public  void pinch(AndroidDriver driver,WebElement element) {
		driver.pinch(element);
	}

	public  void tapElementAction(AndroidDriver driver,int fingers,WebElement element,int duration) {
		driver.tap(fingers, element, duration);
	}
	
	public  void tapAction(AndroidDriver driver,int fingers,int x,int y,int duration) {
		driver.tap(fingers, x, y, duration);
	}
	
	public  void dragAndDrop(AndroidDriver driver,WebElement src,WebElement dest) {
		TouchAction to =new TouchAction(driver);
		to.longPress(src).waitAction().moveTo(dest).perform().release();
	}
	
	
	public  void uninstallApp(AndroidDriver driver) {
		driver.removeApp("com.phonegap.rxpal");
	}	
	
	public  void launchApp(AndroidDriver driver) {
		driver.launchApp();
	}
	
	public  void switchApp(AndroidDriver driver) {
		driver.startActivity("com.phonegap.rxpal", "com.pharmeasy.ui.activities.SplashActivity");
	}
	
	public  void appRunInBackground(AndroidDriver driver,int seconds) {
		driver.runAppInBackground(seconds);
	}
	
	public  void notificationOpen(AndroidDriver driver) {
		driver.openNotifications();
	}
}
