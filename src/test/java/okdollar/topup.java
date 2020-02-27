package okdollar;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class topup  {
	

	protected static AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    static Map<String, String> invno	= new HashMap<String, String>();
    
	
    SoftAssert softAssert= new SoftAssert();
    
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{

		 DesiredCapabilities dc = new DesiredCapabilities();
	      
	        dc.setCapability(MobileCapabilityType.UDID, "RF8M74PYR7R");
	        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.jas.digitalkyats");
	        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".ui.SplashActivity");
	        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
		        
	}
	@DataProvider(name ="mobilenumbers")
	public  Object[][] testdata()
	{
		Object[][] mobnumdet = new Object[12][5];

		//select topup datas starts here -----------------------------------------
		mobnumdet[0][0]="ooredoo";
		mobnumdet[0][1]="09971554804";
		mobnumdet[0][2]="1,000";
		mobnumdet[0][3]="Ooredooselecttopup";
		mobnumdet[0][4]="selecttopup";
		
		mobnumdet[1][0]="mpt";
		mobnumdet[1][1]="09897241420";
		mobnumdet[1][2]="1,000";
		mobnumdet[1][3]="mptselecttopup";
		mobnumdet[1][4]="selecttopup";
		
		mobnumdet[2][0]="telenor";
		mobnumdet[2][1]="09774819667";
		mobnumdet[2][2]="1,000";
		mobnumdet[2][3]="telenorselecttopup";
		mobnumdet[2][4]="selecttopup";
		
		mobnumdet[3][0]="mytel";
		mobnumdet[3][1]="09692874819";
		mobnumdet[3][2]="1,000";
		mobnumdet[3][3]="mytelselecttopup";
		mobnumdet[3][4]="selecttopup";
		
		mobnumdet[4][0]="mectel";
		mobnumdet[4][1]="0930965918";
		mobnumdet[4][2]="1,000";
		mobnumdet[4][3]="mectelselecttopup";
		mobnumdet[4][4]="selecttopup";
	
		//dataplan datas starts here	------------------------------
		
		mobnumdet[5][0]="ooredoo";
		mobnumdet[5][1]="09971554804";
		mobnumdet[5][2]="999";
		mobnumdet[5][3]="Ooredoodataplan";
		mobnumdet[5][4]="dataplan";
		
		mobnumdet[6][0]="mpt";
		mobnumdet[6][1]="09897241420";
		mobnumdet[6][2]="699";
		mobnumdet[6][3]="mptdataplan";
		mobnumdet[6][4]="dataplan";
		
		mobnumdet[7][0]="telenor";
		mobnumdet[7][1]="09774819667";
		mobnumdet[7][2]="799";
		mobnumdet[7][3]="telenordataplan";
		mobnumdet[7][4]="dataplan";
		
		mobnumdet[8][0]="mytel";
		mobnumdet[8][1]="09692874819";
		mobnumdet[8][2]="2,400";
		mobnumdet[8][3]="myteldataplan";
		mobnumdet[8][4]="dataplan";
		
		//enter topup amount  datas starts here	------------------------------
		mobnumdet[9][0]="ooredoo";
		mobnumdet[9][1]="09971554804";
		mobnumdet[9][2]="1010";
		mobnumdet[9][3]="Ooredoodataplan";
		mobnumdet[9][4]="entertopup";
		
		
		mobnumdet[10][0]="telenor";
		mobnumdet[10][1]="09774819667";
		mobnumdet[10][2]="1000";
		mobnumdet[10][3]="telenorentertopup";
		mobnumdet[10][4]="entertopup";
		
		mobnumdet[11][0]="mytel";
		mobnumdet[11][1]="09692874819";
		mobnumdet[11][2]="1000";
		mobnumdet[11][3]="mytelentertopup";
		mobnumdet[11][4]="entertopup";
		
		
		


		return mobnumdet;
		
		
	}
	
	
	
	@Test(dataProvider = "mobilenumbers",priority =1)
	public void topupp(String oper, String mobnum, String amt, String val,String type) throws InterruptedException
	{

		driver.findElement(By.xpath("//*[@text='Other Number']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys(mobnum);
		driver.findElement(By.xpath("//*[@class='android.widget.EditText' and (./preceding-sibling::* | ./following-sibling::*)[@class='android.view.View']]")).sendKeys(mobnum);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(text(),'Select Amount')]")).click();
		if(type == "dataplan")
		{
			driver.findElement(By.xpath("//*[@text='  DATA PLAN  ']")).click();
			driver.findElement(By.xpath("//*[@text='"+amt+"']")).click();
			System.out.println(type+"-----"+val+"---"+amt);
		}
		if(type == "entertopup")
		{
			driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys(amt);
			driver.findElement(By.xpath("//*[@text='NEXT']")).click();
			System.out.println(type+"-----"+val+"---"+amt);
				
		}
		if(type == "selecttopup")
		{
			driver.findElement(By.xpath("//*[@text='"+amt+"']")).click();
			System.out.println(type+"-----"+val+"---"+amt);
				
		}
		 try{
	            driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
	            payto.loginpwd(driver);
	        }
	        catch(NoSuchElementException e){
	           
	        }
		
		softAssert.assertTrue(driver.findElement(By.xpath("//*[@text='CashBack']")).isDisplayed());   
		driver.findElement(By.xpath("//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.TextView' and (./preceding-sibling::* | ./following-sibling::*)[@text] and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]")).isDisplayed();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Pay']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Receipt']")).isDisplayed();
		String txnid =driver.findElement(By.xpath("((//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.ScrollView']]/*[@class='android.widget.LinearLayout'])[4]/*[@text and @id='com.jas.digitalkyats:id/'])[2]")).getText();
		invno.put(val,txnid);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@text='Home']")).click();
		softAssert.assertAll();
		
		for (String key: invno.keySet()) {
			System.out.println(key+"-----Transaction Id ="+invno.get(key));
		}
		
	
	}


	@Test(priority = 2)
	public void verifytopupsuccess() throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "D:\\Mani\\selenium lib\\chromedriver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		

		driver.get("http://3.1.90.118/manage/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"Username\"]")).sendKeys("topupteam");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("topup123");
		driver.findElement(By.xpath("/html/body/div/div/div/div[2]/form/button")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[6]/a")).click();
		Thread.sleep(3000);
		//loop values from map
		for (String key: invno.keySet()) {
			//System.out.println(invno.get(key));
			driver.findElement(By.xpath("//*[@id=\"OkTransactionId\"]")).sendKeys(invno.get(key));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
			Thread.sleep(3000);
			if(driver.findElements(By.xpath("//*[@id=\"topup-table-body\"]/tr/td[8]")).size()!=0)
				
			{
				String status =driver.findElement(By.xpath("//*[@id=\"topup-table-body\"]/tr/td[8]")).getText();
				//System.out.println(status);
				softAssert.assertTrue(status.contains("Success"));
			//	Assert.assertTrue(status.contains("Success"));
				System.out.println("The status of "+key+"is"+status);
				driver.findElement(By.xpath("//*[@id=\"OkTransactionId\"]")).clear();
				softAssert.assertAll();
			}
			else
			{
				softAssert.fail();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/button[1]")).click();
		System.out.println(key+"is Failed");
		driver.findElement(By.xpath("//*[@id=\"OkTransactionId\"]")).clear();
		
			}
			
		}
		
		
		
		
		
		
	}
}
