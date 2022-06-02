package objectrepository;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	public AndroidDriver driver;

	@AndroidFindBy(xpath = "//*[@text='Log In']")
	private MobileElement loginBtn;
	
	@AndroidFindBy(xpath = "//*[@text='Email or mobile no']")
	private MobileElement phnoTxtfld;
	

	public MobileElement getLoginBtn() {
		return loginBtn;
	}

	public MobileElement getPhnoTxtfld() {
		return phnoTxtfld;
	}
	
	public LoginPage(AndroidDriver driver)
	{
		//this.driver=drievr;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	public void loginclick()
	{
		loginBtn.click();
	}
	
	public void phnoEntry(String phno)
	{
		phnoTxtfld.sendKeys(phno);
	}
}
