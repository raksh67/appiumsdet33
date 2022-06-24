import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class practice2 {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		//common dc (android or IOS)
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");

		//capability of app
				dc.setCapability("appPackage", "com.application.zomato");
				dc.setCapability("appActivity", ".routers.DeepLinkRouter"); 
						
				//Appium server URL
				URL url=new URL("http://localhost:4723/wd/hub");
						
				AndroidDriver driver=new AndroidDriver(url,dc);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
				driver.findElement(By.id("com.application.zomato:id/fw_mobile_edit_text")).sendKeys("9740798601");
				
				driver.findElement(By.id("com.application.zomato:id/send_otp_button")).click();
				
				//search bar
				driver.findElement(By.id("com.application.zomato:id/edittext")).sendKeys("chicken");
				
				driver.findElement(By.xpath("//*[@text='See all restaurants']")).click();
				

	}

}
