package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class BaseClass {
	public AndroidDriver driver;
	public static AndroidDriver staticDriver;
	//public AppiumDriverLocalService server;
	public FileUtility fd=new FileUtility();
	public MobileDriverUtility mbl=new MobileDriverUtility();

	@BeforeClass
	public void openserver() throws Throwable {
		fd.getPropertyFile();
		System.out.println("server opened");
	}

	@BeforeMethod
	public void launchapp() throws MalformedURLException, InterruptedException {
		/*server=AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
			.withArgument(GeneralServerFlag.SESSION_OVERRIDE)
				.usingPort(4723)
				.withLogFile(new File("../Appiumsdet33/Logs.txt\"")));
		server.start();*/


		String Device_name = fd.fetchDataPropertyFile("deviceName");
		String Device_id = fd.fetchDataPropertyFile("UDID");
		String Platform_version = fd.fetchDataPropertyFile("platformVersion");
		String App_package = fd.fetchDataPropertyFile("appPackage");
		String App_activity = fd.fetchDataPropertyFile("appActivity");
		String Automation_name = fd.fetchDataPropertyFile("automationName");
		String Appium_version = fd.fetchDataPropertyFile("appiumVersion");
		String Platform_name=fd.fetchDataPropertyFile("platformName");
		DesiredCapabilities capability=new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.AUTOMATION_NAME, Automation_name);
		capability.setCapability(MobileCapabilityType.APPIUM_VERSION, Appium_version);
		capability.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform_name);
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, Device_name);
		capability.setCapability(MobileCapabilityType.UDID, Device_id);
		capability.setCapability(MobileCapabilityType.PLATFORM_VERSION, Platform_version);
		capability.setCapability(MobileCapabilityType.NO_RESET, true);


		capability.setCapability("appPackage", App_package);
		capability.setCapability("appActivity", App_activity);
		//driver.launchApp();
		URL url=new URL("http://localhost:4723/wd/hub");
		driver = new AndroidDriver(url,capability);

		staticDriver=driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		//WebElement applang = driver.findElement(By.xpath("//*[@text='English']/parent::android.widget.LinearLayout"));
		//mbl.tapElementAction(driver, 1, applang,500);
		// WebElement continueclick = driver.findElement(By.xpath("//*[@text='CONTINUE']"));
		 //mbl.tapElementAction(driver, 1, continueclick, 500);
		 
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

	}

	@AfterMethod
	public void closeapp() {
		//server.stop();
	}

	@AfterClass
	public void close() {
		System.out.println("closed");
	}
}