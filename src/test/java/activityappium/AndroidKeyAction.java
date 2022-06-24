package activityappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class AndroidKeyAction {

	//static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AppiumDriverLocalService server=AppiumDriverLocalService.buildDefaultService();
		server.start();
		DesiredCapabilities dc=new DesiredCapabilities();
		//common dc (android or IOS)
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");
		dc.setCapability("noRest", true);
		
		//capability of app
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
				
		//Appium server URL
		URL url=new URL("http://localhost:4723/wd/hub");
				
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_UP);
		
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_MUTE);
		
		System.out.println(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		
		System.out.println(AndroidKeyCode.KEYCODE_BACK);
		
		
		System.out.println(AndroidKeyCode.KEYCODE_ENTER);
		
		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		
		
		System.out.println(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		
		System.out.println(AndroidKeyCode.KEYCODE_CAMERA);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		
		//send a key event to the device
		Thread.sleep(2000);
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_UP);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_VOLUME_DOWN);
		
		driver.pressKeyCode(AndroidKeyCode.BACK);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_UP);
		
		driver.pressKeyCode(AndroidKeyCode.KEYCODE_BRIGHTNESS_DOWN);
		
		Thread.sleep(2000);
		
		server.stop();

	}//inaccessible object exception... ide version is not updated so

}
