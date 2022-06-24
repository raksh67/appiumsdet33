package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwitchFromOneAppToAnother {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");

		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");

		URL url =new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver =new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.startActivity("com.androidsample.generalstore", ".SplashActivity");
        //switch back to api
        driver.startActivity("io.appium.android.apis", ".ApiDemos");
        driver.launchApp();
       
	}

}
