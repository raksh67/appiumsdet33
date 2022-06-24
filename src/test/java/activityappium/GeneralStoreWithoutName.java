package activityappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreWithoutName {

	public static void main(String[] args) throws MalformedURLException {
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
				AndroidDriver driver=new AndroidDriver(url,dc);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				//driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Raksha");
				
				driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
				
				//dropdown
				
				driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
				
				scrollToElement(driver, "text","India");
				
				
				//click on lets shop
				driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
				
			//click on toast msg
				String toastmsg = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");  //universal xpath by developers
				System.out.println(toastmsg);
				
	}

	public static void scrollToElement(AndroidDriver driver,String an,String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();
		
}

	}//scroll??


