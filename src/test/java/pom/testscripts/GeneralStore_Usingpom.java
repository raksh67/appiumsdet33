package pom.testscripts;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import objectrepository.LoginPage;

public class GeneralStore_Usingpom {
	public AndroidDriver driver;

	@Test
		public void generalStoreTest() throws MalformedURLException, Exception {
			DesiredCapabilities dc=new DesiredCapabilities();
			//common dc (android or IOS)
			dc.setCapability("deviceName", "Redmi");
			dc.setCapability("automationName", "appium");
			dc.setCapability("platformName", "Android");
			dc.setCapability("platformVersion", "9");
			dc.setCapability("UDID", "d3d9cc1b");

			//dc for android
			dc.setCapability("appPackage", "com.androidsamplegeneralstore");
			dc.setCapability("appActivity", ".SplashActivity");

			//Appium server URL
					URL url=new URL("http://localhost:4723/wd/hub");
					Thread.sleep(2000);
					 driver=new AndroidDriver(url,dc);
					 
					driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
					 LoginPage glp=new LoginPage(driver);
					 glp.loginBtnclick("raksha");
					
}
}
