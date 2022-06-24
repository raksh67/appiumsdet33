package practice;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class GeneralLoginPage {

	public AndroidDriver driver;
	@AndroidFindBy(id = "com.android.generalstore:id/spinnerCountry")
	private MobileElement countryDD;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
	private MobileElement nametxtfield;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/radioFemale")
	private MobileElement femaletadbtn;
	
	@AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement loginbtn;
	
	
	public MobileElement getCountryDD() {
		return countryDD;
	}
	public MobileElement getNametxtfield() {
		return nametxtfield;
		
		
	}
	public MobileElement getFemaletadbtn() {
		return femaletadbtn;
	}
	public MobileElement getLoginbtn() {
		return loginbtn;
	}
	
	public GeneralLoginPage(AndroidDriver driver)
	{
		//this.driver=drievr;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void loginBtnclick(String name)
	{
		countryDD.click();
		scrollToElement(driver,"text","India");
		nametxtfield.sendKeys(name);
		femaletadbtn.click();
		loginbtn.click();
	}
	
	public static void scrollToElement(AndroidDriver driver,String an,String av)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollIntoView("+an+"(\""+av+"\"))").click();
	}



}
