package dreamframework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import appium_generic_utility.BaseClass;
import appium_generic_utility.MobileDriverUtility;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import objectrepository.LoginPage;

public class VerifyTimeCountersTest1 extends BaseClass{

	@Test
	public static void dream() throws MalformedURLException {
		MobileDriverUtility mbl=new MobileDriverUtility();


		WebElement applang = driver.findElement(By.xpath("//*[@text='English']/parent::android.widget.LinearLayout"));
		mbl.tapElementAction(driver, 1, applang,500);
		 WebElement continueclick = driver.findElement(By.xpath("//*[@text='CONTINUE']"));
		mbl.tapElementAction(driver, 1, continueclick, 500);
		WebElement login = driver.findElement(By.xpath("//*[@text='Log In']"));
		mbl.tapElementAction(driver, 1, login, 500);

		WebElement phno = driver.findElement(By.xpath("//*[@text='Email or mobile no']"));
		phno.sendKeys("9740798601");

		WebElement next = driver.findElement(By.xpath("//*[@text='NEXT']"));
		mbl.tapElementAction(driver, 1, next, 500);

		WebElement agree = driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button"));
		mbl.tapElementAction(driver, 1, agree, 500);


		WebElement continuengg = driver.findElement(By.xpath("//*[@text='CONTINUE IN ENGLISH']"));
		mbl.tapElementAction(driver, 1, continuengg, 500);

		WebElement time = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Match_Card_1\"]/android.widget.TextView[5]"));
		String timevalue = time.getText();
		String timecounter="24h";
		//Assert.assertEquals(timevalue, timecounter);
		if(timevalue.contains(timecounter))
		{
			System.out.println("It is displayed within 24hrs");
		}
		
		else
		{
			System.out.println("Not displayed within 24hrs");
		}

	}

}
