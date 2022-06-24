package activityappium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class ApiDemosActivity {

	public static void main(String[] args) throws MalformedURLException, Throwable {
		DesiredCapabilities dc=new DesiredCapabilities();
		//common dc (android or IOS)
		dc.setCapability("deviceName", "Redmi");
		dc.setCapability("automationName", "appium");
		dc.setCapability("platformName", "Android");
		dc.setCapability("platformVersion", "9");
		dc.setCapability("UDID", "d3d9cc1b");
		
		//capability of app
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
		
		//Appium server URL
		URL url=new URL("http://localhost:4723/wd/hub");
		Thread.sleep(2000);
		AndroidDriver driver=new AndroidDriver(url,dc);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Controls\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Light Theme\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("raksha");
		driver.hideKeyboard();
		 WebElement checkbox1 = driver.findElement(By.id("io.appium.android.apis:id/check1"));
		 checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.id("io.appium.android.apis:id/check2"));
		checkbox2.click();
		WebElement radiobtn2 = driver.findElement(By.id("io.appium.android.apis:id/radio2"));
		radiobtn2.click();
		WebElement star = driver.findElement(By.id("io.appium.android.apis:id/star"));
		star.click();
		
		WebElement onoff1 = driver.findElement(By.id("io.appium.android.apis:id/toggle1"));
		onoff1.click();
		WebElement onoff2 = driver.findElement(By.id("io.appium.android.apis:id/toggle2"));
		onoff2.click();
		
		WebElement dropdown = driver.findElement(By.id("io.appium.android.apis:id/spinner1"));
		
		driver.tap(1, dropdown, 500);
		
		
		/*List<WebElement> alloptions = driver.findElements(null)
				System.out.println("number of options available in dropdown:"+alloptions.size());
		for (WebElement e: alloptions) {
			String text = e.getText();
			System.out.println(text);
			if(values.equalsIGNORECASE("Jupiter"))
			{
				e.click();
				break;
			}
		}
			}
		}*/
		 
	}

}//incomplete
