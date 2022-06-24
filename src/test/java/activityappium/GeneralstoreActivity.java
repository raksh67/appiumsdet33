package activityappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileBy.ByAndroidUIAutomator;
import io.appium.java_client.android.AndroidDriver;

public class GeneralstoreActivity {

	public static void main(String[] args) throws MalformedURLException {
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
		AndroidDriver driver=new AndroidDriver(url,dc);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Raksha");

		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();

		//dropdown

		driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();

		scrollToElement(driver, "text","India");

		//click on india
		//click on lets shop
		driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		//add to cart
		driver.tap(1, 887, 983, 500);
		//click on cart image
		driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();

		//verify price
		String actualprice = driver.findElement(By.id("com.androidsample.generalstore:id/productPrice")).getText();
		String expectedprice = "$160.97";
		
		if(actualprice.contains(expectedprice))
		{
			System.out.println("The expected price is correct");
		}

		else
		{
			System.out.println("The expected price is not correct");
		}
	}

public static void scrollToElement(AndroidDriver driver,String an,String av) {
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");

}
}//in
