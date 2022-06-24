package activityappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class ParallelTesting {
	
@Parameters({"deviceName", "platformVersion","UDID","port"})
	@Test
	public static void parallelExecutionTest(String deviceName,String platformVersion,String UDID ,String port) throws MalformedURLException, InterruptedException{
		DesiredCapabilities dc=new DesiredCapabilities();
		//common dc (android or IOS)
		dc.setCapability("deviceName", deviceName);
	//	dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", platformVersion);
		dc.setCapability("UDID", UDID);
		
		//capability of app
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		//Appium server URL
		URL url=new URL("http://localhost:"+port+"/wd/hub");
		//Thread.sleep(2000);
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

}//succcess
