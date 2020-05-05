package okdollar;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.okdollar.base.base;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class rough extends base {
	protected static MobileDriver driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();

    
	
	
	
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{

			 DesiredCapabilities dc = new DesiredCapabilities();
		      
		        dc.setCapability(MobileCapabilityType.UDID, "RF8M74PYR7R");
		        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.jas.digitalkyats");
		        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".ui.SplashActivity");
		        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
		        
	}
	
	

    @Test(priority=10)
	public void rough() throws InterruptedException
	{
		
			
		
	}
}
	 
	
	
	



