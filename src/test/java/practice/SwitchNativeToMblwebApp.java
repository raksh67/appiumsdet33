package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class SwitchNativeToMblwebApp {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dc= new DesiredCapabilities();
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");
		
		dc.setCapability("browserName", "chrome");

		URL url =new URL("http://localhost:4723/wd/hub");

		AndroidDriver driver =new AndroidDriver(url,dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        //click on create new account
driver.findElement(By.xpath("//a[@id='signup-button']")).click();
        //name textfield
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("raksha");
        //surname textfield
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("rn");
        
	}

}
