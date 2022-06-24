package practice;

import org.openqa.selenium.remote.DesiredCapabilities;

public class ZoomActionSubscaleview {

	public static void main(String[] args) {
DesiredCapabilities dc=new DesiredCapabilities();
dc.setCapability("deviceName", "Redmi");
dc.setCapability("platformName", "android");
dc.setCapability("platformVersion", "9");
dc.setCapability("UDID", "d3d9cc1b");

dc.setCapability("appPackage", "com.davemorrissey.labs.subscalebview.sample");
dc.setCapability("appActivity", ".MainActivity");



	}

}
