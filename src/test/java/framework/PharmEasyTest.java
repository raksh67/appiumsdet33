package framework;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import appium_generic_utility.AndroidUtility;
import appium_generic_utility.BaseClass;


public class PharmEasyTest extends BaseClass {

	@Test
	public void launchPharmEasyTest() {
		
		//healthcare
		//driver.tap(1, 628, 600, 500);
		driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Healthcare\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
	
		//oralcare
		driver.tap(1, 876, 1156, 500);
		//AndroidUtility.scrollToElement(driver, "text", "Oral Care");
		
		//vantej
		driver.tap(1, 235, 1397, 500);
		//add to cart
		driver.tap(1, 863, 1380, 500);
		
		//2
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]")).click();
		//view cart
		driver.tap(1, 700, 1946, 500);
		//address
		driver.findElement(By.id("com.phonegap.rxpal:id/tv_view_cart")).click();
		
		//my no
		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"097407 98601\"]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView")).click();

		//name
		driver.findElement(By.id("com.phonegap.rxpal:id/tv_name")).sendKeys("raksha");
		//building number
		driver.findElement(By.id("com.phonegap.rxpal:id/tv_flat_number")).sendKeys("487");
		//street name
		driver.findElement(By.id("com.phonegap.rxpal:id/tv_street_name")).sendKeys("Bangalore");
		//save n continue
		driver.findElement(By.id("com.phonegap.rxpal:id/tv_view_cart")).click();
		
		
		
	}

}
