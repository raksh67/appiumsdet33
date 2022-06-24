package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import appium_generic_utility.BaseClass;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class verifyTimeCountersTest extends BaseClass{

	@Test
	public static void dream() throws MalformedURLException {
DesiredCapabilities cap = new DesiredCapabilities();
		
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Redmi");
		cap.setCapability(MobileCapabilityType.UDID, "d3d9cc1b");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		
	
		cap.setCapability("appPackage", "com.app.dream11Pro");
		cap.setCapability("appActivity", "com.app.dream11.dream11.SplashActivity");
		
		
		URL url=new URL("http://localhost:4723/wd/hub");
		
		AndroidDriver driver=new AndroidDriver(url,cap);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//select app language
		//driver.findElement(By.xpath("//*[@text='English']/parent::android.widget.LinearLayout")).click();
		//continue
		//driver.findElement(By.xpath("//*[@text='CONTINUE']")).click();
		//login
		driver.findElement(By.xpath("//*[@text='Log In']")).click();
		//phno textfield
		driver.findElement(By.xpath("//*[@text='Email or mobile no']")).sendKeys("9740798601");
		//next button
		driver.findElement(By.xpath("//*[@text='NEXT']")).click();
		//agree
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		//continue in english
		driver.findElement(By.xpath("//*[@text='CONTINUE IN ENGLISH']")).click();
		//time counters
		WebElement time = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Match_Card_1\"]/android.widget.TextView[5]"));
		String t1 = time.getText();
		System.out.println(t1);
		
	}

}
