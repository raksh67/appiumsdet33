package appium_generic_utility;

import io.appium.java_client.android.AndroidDriver;

public class AndroidUtility {

	
		public static void scrollToElement(AndroidDriver driver,String an,String av) {
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))");
			}
	}


