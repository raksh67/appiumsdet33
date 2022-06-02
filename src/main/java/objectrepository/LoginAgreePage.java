package objectrepository;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginAgreePage {
	public AndroidDriver driver;

	@AndroidFindBy(xpath = "//*[@text='NEXT']")
	private MobileElement nextBtn;
	
	@AndroidFindBy(xpath = "com.android.packageinstaller:id/permission_allow_button")
	private MobileElement agree;
	
	@AndroidFindBy(xpath = "//*[@text='CONTINUE IN ENGLISH']")
	private MobileElement continueng;
	
	
	public MobileElement getNextBtn() {
		return nextBtn;
	}
	
	public MobileElement getAgree() {
		return agree;
	}
	
	public MobileElement getContinueng() {
		return continueng;
	}
	public LoginAgreePage(AndroidDriver driver)
	{
		//this.driver=drievr;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void nextBtnclick(String phno)
	{
		nextBtn.click();;
	}
	
	public void agreeclick(String phno)
	{
		agree.click();;
	}
	
	public void continuengclick(String phno)
	{
		continueng.click();;
	}
}
