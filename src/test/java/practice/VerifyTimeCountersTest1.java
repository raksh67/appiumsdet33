package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import appium_generic_utility.BaseClass;
import appium_generic_utility.MobileDriverUtility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import objectrepository.LoginPage;

public class VerifyTimeCountersTest1 extends BaseClass{

	@Test
	public static void dream() throws MalformedURLException {
		public MobileDriverUtility mbl=new MobileDriverUtility();

		public AndroidDriver driver;

		//select app language
		WebElement applang = driver.findElement(By.xpath("//*[@text='English']/parent::android.widget.LinearLayout"));
		//continue
		 WebElement continueclick = driver.findElement(By.xpath("//*[@text='CONTINUE']"));
		// continueclick.click();
		//login
		//WebElement login = driver.findElement(By.xpath("//*[@text='Log In']"));
		//login.click();
		//phno textfield
		//WebElement phno = driver.findElement(By.xpath("//*[@text='Email or mobile no']"));
		//phno.sendKeys("9740798601");
		//next button
		//WebElement next = driver.findElement(By.xpath("//*[@text='NEXT']"));
		//next.click();
		//agree
		//WebElement agree = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
		//agree.click();
		// in english
		//WebElement continuengg = driver.findElement(By.xpath("//*[@text='CONTINUE IN ENGLISH']"));
		//continuengg.click();
		//time counters
		//WebElement time = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Match_Card_1\"]/android.widget.TextView[5]"));
		//String t1 = time.getText();
		//System.out.println(t1);
		
	}

}
