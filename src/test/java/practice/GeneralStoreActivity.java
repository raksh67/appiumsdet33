package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;

public class GeneralStoreActivity {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");

		dc.setCapability("appPackage", "com.androidsample.generalstoreio.appium.android.apis");
		dc.setCapability("appActivity", ".SplashActivity");

		URL url =new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver =new AndroidDriver(url,dc);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//your name textfield
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Raksha");
		//gender
		driver.findElement(By.id("com.androidsample.generalstore:id/radioFemale")).click();
		//country dropdown
		WebElement dropdown = driver.findElement(By.id("com.androidsample.generalstore:id/spinnerCountry"));
		
		Select select=new Select(dropdown);
		select.deselectByVisibleText("India");

	}

}
