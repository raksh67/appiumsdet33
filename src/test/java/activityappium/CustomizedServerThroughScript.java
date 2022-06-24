package activityappium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class CustomizedServerThroughScript {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AppiumDriverLocalService server= AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				.usingPort(4723)
				.withLogFile(new File("../Appiumsdet33/Logs.txt")));
	server.start();
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
			
			//Appium url port number
			URL url =new URL("http://localhost:4723/wd/hub");
			
			AndroidDriver driver=new AndroidDriver(url,dc);
Thread.sleep(2000);

driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


}
}//inaccessibleobjectexception