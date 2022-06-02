package objectrepository;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Englishpage {

	public AndroidDriver driver;
	@AndroidFindBy(xpath = "//*[@text='English']/parent::android.widget.LinearLayout")
	private MobileElement appLang;
	
	@AndroidFindBy(xpath = "//*[@text='CONTINUE']")
	private MobileElement continueTxtFld;
	
	
	public MobileElement getContinueTxtFld() {
		return continueTxtFld;
	}
	
	public MobileElement getAppLang() {
		return appLang;
	}
	
	public Englishpage(AndroidDriver driver)
	{
		//this.driver=drievr;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void engclick()
	{
		appLang.click();
	}
	
	public void continueclick()
	{
		continueTxtFld.click();
	}
}
