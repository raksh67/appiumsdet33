package activityappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ZoomAction {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		//common dc (android or IOS)
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");

		//dc for android
		dc.setCapability("appPackage", "com.davemorrissey.labs.subscalebview.sample");
		dc.setCapability("appActivity", ".MainActivity");

		//Appium server URL
				URL url=new URL("http://localhost:4723/wd/hub");
				Thread.sleep(2000);
				AndroidDriver driver=new AndroidDriver(url,dc);

				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.tap(1, 937, 2315, 500);
				driver.findElement(By.id("android:id/button1")).click();
				driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
				WebElement img = driver.findElement(By.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
				driver.zoom(img);
				driver.pinch(img);
				

}
}
