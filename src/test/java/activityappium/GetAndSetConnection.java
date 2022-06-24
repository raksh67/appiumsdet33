package activityappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;


public class GetAndSetConnection {

	public static void main(String[] args) throws MalformedURLException, Throwable {
		DesiredCapabilities dc=new DesiredCapabilities();
		//common dc (android or IOS)
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");

		//dc for android
		dc.setCapability("appPackage", "com.androidsample.generalstore");
		dc.setCapability("appActivity", ".SplashActivity");

		//Appium server URL
				URL url=new URL("http://localhost:4723/wd/hub");
				Thread.sleep(2000);
				
				AndroidDriver driver=new AndroidDriver(url,dc);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				Connection currentstate=driver.getConnection();
				System.out.println(currentstate);
				//driver.setConnection(Connection.WIFI);
				//System.out.println(driver.getConnection());
				driver.setConnection(Connection.DATA);
				System.out.println(driver.getConnection());
				//driver.setConnection(Connection.AIRPLANE);
				//System.out.println(driver.getConnection());
				
				
	}//data not printing

}
