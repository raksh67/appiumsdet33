package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class UninstallApiDemos {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
DesiredCapabilities dc =new DesiredCapabilities();
dc.setCapability("deviceName", "Redmi");
dc.setCapability("platformName", "android");
dc.setCapability("platformVersion", "9");
dc.setCapability("UDID", "d3d9cc1b");

dc.setCapability("appPackage", "io.appium.android.apis");
dc.setCapability("appActivity", ".ApiDemos");

URL url=new URL("http://localhost:4723/wd/hub");

AndroidDriver driver =new AndroidDriver(url,dc);
//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//Thread.sleep(3000);

boolean status = driver.isAppInstalled("io.appium.android.apis");
System.out.println(status);
driver.removeApp("io.appium.android.apis");
boolean afterstatus = driver.isAppInstalled("io.appium.android.apis");
System.out.println("after status " + afterstatus);
//Thread.sleep(3000);


	}

}
