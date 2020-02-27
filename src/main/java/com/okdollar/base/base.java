package com.okdollar.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.okdollar.util.AppiumListener;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.events.EventFiringWebDriverFactory;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {
	public static AndroidDriver<AndroidElement> driver;
	public static Properties prop;
	public  static AndroidDriver<AndroidElement> e_driver;
	public static AppiumListener eventListener;
	
	public base()
	{

		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("D:\\Users\\User\\eclipse-workspace\\manikandan\\src\\main\\java\\com\\okdollar\\config\\config.properties");
			prop.load(ip);
			//System.out.println(prop.getProperty("devid"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}

		
	}
	public static void initialization() throws MalformedURLException{
		String devid= prop.getProperty("devid");

		 DesiredCapabilities dc = new DesiredCapabilities();
	      
	        dc.setCapability(MobileCapabilityType.UDID, devid);
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.jas.digitalkyats");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".ui.SplashActivity");
	        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
	    	
	        driver = EventFiringWebDriverFactory.getEventFiringWebDriver(driver, 
	        	    new AppiumListener());
	       
	
	}
	 public static void sethome()
		{
			for (int i = 0; i < 50; i++){
				try {
					driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and @width>0 and ./*[@text='Home'] and ./*[@id='tab_image']]")).isDisplayed();
					break;
				}
			catch(NoSuchElementException e)
			{
				driver.navigate().back();
			}
			}
		}
	 public static void loginpwd(AndroidDriver<AndroidElement> driver) throws InterruptedException {
			driver.findElement(By.xpath("//*[@resource-id='com.jas.digitalkyats:id/otp_edit_text_password']")).sendKeys("123456");
			driver.findElement(By.xpath("//*[@text='Login']")).click();
			Thread.sleep(3000);

	}
	 
	 public static void waitandclick(AndroidElement ele) throws InterruptedException {
		
		 WebDriverWait wait = new WebDriverWait(driver,20);
		 wait.until(ExpectedConditions.elementToBeClickable(ele));
		 ele.click();

	}
	 
}


