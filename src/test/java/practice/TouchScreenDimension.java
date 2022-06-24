package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class TouchScreenDimension {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");

		dc.setCapability("appPackage", "jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity", ".TouchScreenTestActivity");

		URL url =new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver =new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//horizontal swipe
		//driver.swipe(235, 935, 742, 932, 500);

		//vertical swipe
		//driver.swipe(466, 514, 452, 1225, 500);
		
		Dimension dim = driver.manage().window().getSize();
		int width = dim.getWidth();
		int height = dim.getHeight();
		System.out.println(width);
		System.out.println(height);
	}

}
