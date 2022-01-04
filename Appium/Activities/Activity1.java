package AppiumActivities;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Activity1 {
	AndroidDriver<MobileElement> driver =null;
	
	@BeforeClass 
	public void setUp() throws MalformedURLException {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", "MyTestEmulator");
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("appPackage", "com.android.calculator2");
        caps.setCapability("appActivity", ".Calculator");
        caps.setCapability("noReset", true);
        
        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<MobileElement>(appServer,caps);
        
	}
	
	@Test
	public void add() {
		
		driver.findElementById("digit_8").click();
		driver.findElementByXPath("//android.widget.Button[@content-desc='plus']").click();
		driver.findElementById("digit_8").click();
		driver.findElementById("eq").click();
		
		 String result = driver.findElementById("result").getText();
	        System.out.println(result);
	        AssertJUnit.assertEquals(result, "16");
	}

	@AfterClass
	
	public void tearDown() {
		driver.quit();
	}

}
