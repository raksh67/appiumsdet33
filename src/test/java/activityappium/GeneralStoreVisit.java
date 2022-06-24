package activityappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreVisit {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
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
				AndroidDriver driver =new AndroidDriver(url,dc);
				
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
				driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Raksha");
				
				driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
				
				//dropdown
				
				driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry")).click();
				
				scrollToElement(driver, "text","India");
				
				//click on india
				//click on lets shop
				driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
				
				//click on pg3 shoe
				driver.tap(1, 901, 1691, 500);
				//click on cart image
				driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
				
				driver.findElement(By.xpath("//android.widget.CheckBox[@text()='Send me e-mails on discounts related to selected products in future']")).click();
				
				driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
				
				Set<String>windows = driver.getContextHandles();
				for (String win : windows) {
					System.out.println("Active Application"+win);
					System.out.println("Active Application"+win);
					Thread.sleep(2000);
					driver.context("WEBVIEW_com.androidsample.generalstore");
					driver.findElement(By.xpath(""))
				}
	}

	public static void scrollToElement(AndroidDriver driver,String an,String av) {
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();
		
}

}//?

