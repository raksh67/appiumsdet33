package practice;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Mfinelaunch {

	public AndroidDriver driver;
	@AndroidFindBy(xpath  = "//android.view.ViewGroup[@content-desc=\"phone number\"]/android.widget.EditText")
	private MobileElement mblTextField;
	
	
	public MobileElement getMblTextField() {
		return mblTextField;
	}
	
	public GeneralLoginPage(AndroidDriver driver)
	{
		//this.driver=drievr;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	

}
