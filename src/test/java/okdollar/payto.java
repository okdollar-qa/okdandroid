package okdollar;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class payto {

	protected static AndroidDriver<AndroidElement> driver = null;

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
	
	
	
	
	@Test(priority=1)
	public void normalpayto() throws MalformedURLException, InterruptedException
	{
		sethome();
	        
		driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
		AndroidElement mobnum =driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
		mobnum.sendKeys("09897241420");
		
		//driver.switchTo().activeElement().sendKeys("2");
		
		//new WebDriverWait(driver, 10).until((Function<? super WebDriver, V>) ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]")));
		AndroidElement confmobnumdriver = driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]"));
		confmobnumdriver.click();
		confmobnumdriver.sendKeys("09897241420");
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")));
        driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")).sendKeys("20.55");
//driver.switchTo().activeElement().sendKeys("2");
new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Submit']")));
		driver.findElement(By.xpath("//*[@text='Submit']")).click();
		loginpwd(driver);
		new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Pay']")));
		 
		driver.findElement(By.xpath("//*[@text='Pay']")).click();
		Thread.sleep(5000);
		Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Receipt']")).getText(), "Receipt");
		invoiceandshare();
		recshare();
		//driver.findElement(By.xpath("//*[@text='Home']")).click();
		morepayment();
		

	}
	
	@Test(priority=2)
	public void cashbackmyno() throws InterruptedException
	{
		
		sethome();
			driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
			AndroidElement mobnum =driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
			mobnum.sendKeys("09897241420");
			
			//driver.switchTo().activeElement().sendKeys("2");
			
			//new WebDriverWait(driver, 10).until((Function<? super WebDriver, V>) ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]")));
			AndroidElement confmobnumdriver = driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]"));
			confmobnumdriver.click();
			confmobnumdriver.sendKeys("09897241420");
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")));
	        driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")).sendKeys("11");
	//driver.switchTo().activeElement().sendKeys("2");
	new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Submit']")));
			driver.findElement(By.xpath("//*[@text='Submit']")).click();
			loginpwd(driver);
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Pay']")));
			Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Cashback']")).isDisplayed());
			driver.findElement(By.xpath("//*[@text='Pay']")).click();
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Receipt']")).getText(), "Receipt");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Cashback']")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.ScrollView']]/*/*/*[@text and @id='com.jas.digitalkyats:id/' and (./preceding-sibling::* | ./following-sibling::*)[@text] and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[5]")).isDisplayed());
			driver.findElement(By.xpath("//*[@text='Home']")).click();
			
		
	}
	
	@Test(priority=3)
	public void cashbackotherno() throws InterruptedException
	{
		
		sethome();
			driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
			AndroidElement mobnum =driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
			mobnum.sendKeys("09897241420");
			
			//driver.switchTo().activeElement().sendKeys("2");
			
			//new WebDriverWait(driver, 10).until((Function<? super WebDriver, V>) ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]")));
			AndroidElement confmobnumdriver = driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]"));
			confmobnumdriver.click();
			confmobnumdriver.sendKeys("09897241420");
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")));
	        driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")).sendKeys("12");
	//driver.switchTo().activeElement().sendKeys("2");
	new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Submit']")));
			driver.findElement(By.xpath("//*[@text='Submit']")).click();
			payto.loginpwd(driver);
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Pay']")));
			Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Cashback']")).isDisplayed());
			driver.findElement(By.xpath("//*[@text='Other Number']")).click();
			driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("099774819667");
			driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@id='com.jas.digitalkyats:id/']]")).sendKeys("099774819667");
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@text='Pay']")).click();
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Receipt']")).getText(), "Receipt");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Cashback']")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.ScrollView']]/*/*/*[@text and @id='com.jas.digitalkyats:id/' and (./preceding-sibling::* | ./following-sibling::*)[@text] and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[5]")).isDisplayed());
			//driver.findElement(By.xpath("//*[@text='Home']")).click();
			repeatpayment();
			
		
	}
	
	@Test(priority=4)
	
    public void fuelno() throws InterruptedException
	{
		
		sethome();
			driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
			AndroidElement mobnum =driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
			mobnum.sendKeys("09770618364");
						AndroidElement confmobnumdriver = driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]"));
			confmobnumdriver.click();
			confmobnumdriver.sendKeys("09770618364");
			Thread.sleep(3000);
			AndroidElement vclfld=driver.findElement(By.xpath("//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./*[@text] and ./*[@class='android.widget.ImageView']]"));
			Assert.assertTrue(vclfld.isDisplayed());
			vclfld.click();
			payto.loginpwd(driver);
			Thread.sleep(3000);
			driver.findElement(By.xpath("(//*[@class='android.widget.ListView']/*/*/*/*[@class='android.widget.RelativeLayout' and ./*[@class='android.widget.ImageView']])[1]")).click();
			
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")));
	        driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")).sendKeys("10");
	//driver.switchTo().activeElement().sendKeys("2");
	new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Submit']")));
			driver.findElement(By.xpath("//*[@text='Submit']")).click();
			payto.loginpwd(driver);
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Pay']")));
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@text='Pay']")).click();
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Receipt']")).getText(), "Receipt");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Vehicle No.']")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("(((//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.ScrollView']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[2]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[1]/*[@text and @id='com.jas.digitalkyats:id/'])[2]")).isDisplayed());
			driver.findElement(By.xpath("//*[@text='Home']")).click();
			
		
	}
	
	@Test(priority=5)
	public void bonpt() throws InterruptedException
	{
		
		sethome();
			driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
			AndroidElement mobnum =driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
			mobnum.sendKeys("09897241420");
						AndroidElement confmobnumdriver = driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]"));
			confmobnumdriver.click();
			confmobnumdriver.sendKeys("09897241420");

	
			
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")));
	        driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")).sendKeys("10");
	//driver.switchTo().activeElement().sendKeys("2");
	new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Submit']")));
			driver.findElement(By.xpath("//*[@text='Submit']")).click();
			payto.loginpwd(driver);
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Pay']")));
			driver.findElement(By.xpath("//*[@text='Pay']")).click();
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Receipt']")).getText(), "Receipt");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Bonus']")).isDisplayed());
			Assert.assertTrue(driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.ScrollView']]/*/*/*[@text and @id='com.jas.digitalkyats:id/' and (./preceding-sibling::* | ./following-sibling::*)[@text] and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[5]")).isDisplayed());
			
			
		
			driver.findElement(By.xpath("//*[@text='Home']")).click();
			
		
	}

	@Test(priority=6)
	public void unreg() throws InterruptedException
	{
		
		sethome();
			driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
			AndroidElement mobnum =driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
			mobnum.sendKeys("095000000");
						AndroidElement confmobnumdriver = driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]"));
			confmobnumdriver.click();
			confmobnumdriver.sendKeys("095000000");

	
			
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")));
	        driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")).sendKeys("20");
	//driver.switchTo().activeElement().sendKeys("2");
	new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Submit']")));
			driver.findElement(By.xpath("//*[@text='Submit']")).click();
			driver.findElement(By.xpath("((//*[@id='com.jas.digitalkyats:id/']/*[@class='android.widget.LinearLayout'])[2]/*[@class='android.widget.Button'])[2]")).click();
			payto.loginpwd(driver);
			Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Unregister User' and (./preceding-sibling::* | ./following-sibling::*)[@text='Receiver Name']]")).isDisplayed());
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Pay']")));
			driver.findElement(By.xpath("//*[@text='Pay']")).click();
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Receipt']")).getText(), "Receipt");
			Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Unregister User' and ./parent::*[@id='com.jas.digitalkyats:id/']]")).isDisplayed());
			
			driver.findElement(By.xpath("//*[@text='Home']")).click();
			
		
	}
	@Test(priority=7)
	public void otherconnum() throws InterruptedException
	{
		sethome();
	      
			driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
			driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']]/*[@class='android.widget.ImageView'])[1]\r\n" + 
					"")).click();
			
			driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("ind");
			driver.findElement(By.xpath("//*[@text='India   (+91)']")).click();
			
			
			AndroidElement mobnum =driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
			mobnum.sendKeys("9791060420");
						AndroidElement confmobnumdriver = driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]"));
			confmobnumdriver.click();
			confmobnumdriver.sendKeys("9791060420");

	
			
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")));
	        driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")).sendKeys("20");
	
	new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Submit']")));
			driver.findElement(By.xpath("//*[@text='Submit']")).click();
		
			payto.loginpwd(driver);
			Assert.assertTrue(driver.findElement(By.xpath("//*[@text='+91 9791060420']")).isDisplayed());
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Pay']")));
			driver.findElement(By.xpath("//*[@text='Pay']")).click();
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Receipt']")).getText(), "Receipt");			
			
			driver.findElement(By.xpath("//*[@text='Home']")).click();
			
		
	}
	
	
	@Test(priority=8)
	public void unregotherconnum() throws InterruptedException
	{
		sethome();;
	      
			driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
			driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']]/*[@class='android.widget.ImageView'])[1]\r\n" + 
					"")).click();
			
			driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys("ind");
			driver.findElement(By.xpath("//*[@text='India   (+91)']")).click();
			
			
			AndroidElement mobnum =driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
			mobnum.sendKeys("8124370868");
						AndroidElement confmobnumdriver = driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]"));
			confmobnumdriver.click();
			confmobnumdriver.sendKeys("8124370868");

	
			
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")));
	        driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")).sendKeys("20");
	
	new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Submit']")));
			driver.findElement(By.xpath("//*[@text='Submit']")).click();
			driver.findElement(By.xpath("((//*[@id='com.jas.digitalkyats:id/']/*[@class='android.widget.LinearLayout'])[2]/*[@class='android.widget.Button'])[2]")).click();
		
			payto.loginpwd(driver);
			Assert.assertTrue(driver.findElement(By.xpath("//*[@text='+91 8124370868']")).isDisplayed());
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Pay']")));
			driver.findElement(By.xpath("//*[@text='Pay']")).click();
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Receipt']")).getText(), "Receipt");			
			
			driver.findElement(By.xpath("//*[@text='Home']")).click();
			
		
	}
	
	
    private static void balpopup() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and @width>0 and ./*[@text='More'] and ./*[@class='android.widget.ImageView']]")).click();
		driver.findElement(By.xpath("(//*[@class='android.widget.RelativeLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/'] and (./preceding-sibling::* | ./following-sibling::*)[@id='com.jas.digitalkyats:id/']]]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.ImageView' and @height>0])[2]")).click();		
		loginpwd(driver);
	}
	
	@Test(priority=9)
	public void hideno() throws InterruptedException
	{
		
		sethome();
			driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
		
			
			
			AndroidElement mobnum =driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
			mobnum.sendKeys("09897241420");
						AndroidElement confmobnumdriver = driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]"));
			confmobnumdriver.click();
			confmobnumdriver.sendKeys("09897241420");

	
			
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")));
	        driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")).sendKeys("101");
	driver.navigate().back();
	driver.findElement(By.xpath("//*[@text='Hide My Number - (+95)9971554804']")).click();
	
	new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Submit']")));
			driver.findElement(By.xpath("//*[@text='Submit']")).click();
			
			payto.loginpwd(driver);
	
			
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Pay']")));
			driver.findElement(By.xpath("//*[@text='Pay']")).click();
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Receipt']")).getText(), "Receipt");	
			Assert.assertTrue(driver.findElement(By.xpath("//*[@text='PAYTOID']")).isDisplayed());	
			
			
			driver.findElement(By.xpath("//*[@text='Home']")).click();
			
		
	}
	@Test(priority=10)
	public void merrating() throws InterruptedException
	{
		sethome();
	      
			driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
		
			
			
			AndroidElement mobnum =driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
			mobnum.sendKeys("09897241420");
						AndroidElement confmobnumdriver = driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]"));
			confmobnumdriver.click();
			confmobnumdriver.sendKeys("09897241420");

	
			
	        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")));
	        driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")).sendKeys("1000");
	
	new WebDriverWait(driver, 60).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Submit']")));
			driver.findElement(By.xpath("//*[@text='Submit']")).click();
			
			payto.loginpwd(driver);
			Assert.assertTrue(driver.findElement(By.xpath("//*[@text='Rate my service']")).isDisplayed());
			driver.findElement(By.xpath("//*[@class='android.widget.RatingBar']")).click();
			driver.findElement(By.xpath("//*[@class='android.widget.RatingBar']")).click();
			driver.findElement(By.xpath("//*[@text='Submit']")).click();
			
			new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Pay']")));
			driver.findElement(By.xpath("//*[@text='Pay']")).click();
			Thread.sleep(5000);
			Assert.assertEquals(driver.findElement(By.xpath("//*[@text='Receipt']")).getText(), "Receipt");			
			
			driver.findElement(By.xpath("//*[@text='Home']")).click();
			
		
	}
@Test	
public void numberinterchange() throws InterruptedException
{
	sethome();
	driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
//	enterno("09897241420");
	fromcon("Manik");
	fromfav();
	
	
	
}
	public void enterno(String string) throws InterruptedException
	{
		
	      
			driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
		
			
			
			AndroidElement mobnum =driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
			mobnum.sendKeys(string);
						AndroidElement confmobnumdriver = driver.findElement(By.xpath("(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]"));
			confmobnumdriver.click();
			confmobnumdriver.sendKeys(string);

		
	}

	public void fromfav() throws InterruptedException
	{
		
	      
		//driver.findElement(By.xpath("//*[@text='Pay / Send']")).click();
		Thread.sleep(2000);
			
		if(driver.findElements(By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']]/*[@class='android.widget.ImageView'])[2]")).size()==0)
		{
		 
		   driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*/*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']])[1]/*[@class='android.widget.ImageView'])[3]")).click(); 

		}
		else
		{
		  driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']]/*[@class='android.widget.ImageView'])[2]")).click();

		}  
			Thread.sleep(2000);
			
		AndroidElement favbtn = driver.findElement(By.xpath("//*[@text='Choose from Favorite']"));
		favbtn.click();
		driver.findElement(By.xpath("(//*[@class='o.гі']/*/*/*/*[@class='android.widget.RelativeLayout' and ./*[@id='com.jas.digitalkyats:id/' and @class='android.widget.RelativeLayout']])[1]")).click();
	
		
	}
	
	public void fromcon(String name) throws InterruptedException
	{
		
	
		Thread.sleep(2000);
		if(driver.findElements(By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']]/*[@class='android.widget.ImageView'])[2]")).size()==0)
		{
		 
		   driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*/*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']])[1]/*[@class='android.widget.ImageView'])[3]")).click(); 

		}
		else
		{
		  driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']]/*[@class='android.widget.ImageView'])[2]")).click();

		}  
			Thread.sleep(3000);
		AndroidElement conbtn = driver.findElement(By.xpath("//*[@text='Choose from Contact']"));
		conbtn.click();
		AndroidElement consericon = driver.findElement(By.xpath("//*[@contentDescription='Search for other area']"));
		consericon.click();
		
		AndroidElement conser = driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
		conser.sendKeys(name);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout' and @width>0 and @height>0 and ./*[@text and @id='com.jas.digitalkyats:id/']]")).click();
		
		
	}
//    public static void loginpwd(AndroidDriver<AndroidElement> driver) throws InterruptedException {
//		driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]")).sendKeys("123456");
//		driver.findElement(By.xpath("//*[@text='Login']")).click();
//		Thread.sleep(3000);

//}
    public void invoiceandshare() throws InterruptedException
	{
		
	      
		driver.findElement(By.xpath("//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./*[@text='More'] and ./*[@class='android.widget.ImageView']]")).click();
				
			driver.findElement(By.xpath("//*[@text='Invoice']")).click();
			driver.findElement(By.xpath("//*[@text='Transaction Receipt']")).isDisplayed();
			driver.findElement(By.xpath("//*[@text='SHARE']")).click();
			
			driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout' and @height>0 and ./*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.FrameLayout'] and ./*[@text='Gmail']]]")).isEnabled();
			driver.navigate().back();
			driver.navigate().back();
	
	}
   
	public void morepayment() throws InterruptedException
	{
		
	      
			driver.findElement(By.xpath("//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./*[@text='More'] and ./*[@class='android.widget.ImageView']]")).click();
				
			driver.findElement(By.xpath("//*[@text='More Payment']")).click();
			driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).isDisplayed();
			driver.navigate().back();
			
	
	}

	
	public void repeatpayment() throws InterruptedException
	{
	
	      
			driver.findElement(By.xpath("//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./*[@text='More'] and ./*[@class='android.widget.ImageView']]")).click();
				
			driver.findElement(By.xpath("//*[@text='Repeat Payment']")).click();
			driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).isDisplayed();
			Thread.sleep(3000);
			String mobinum =driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.LinearLayout']]")).getText();
			Assert.assertEquals(mobinum, "09897241420");
			driver.navigate().back();
	
	}


	public void recshare() throws InterruptedException
	{
		
	      
			driver.findElement(By.xpath("//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./*[@text='More'] and ./*[@class='android.widget.ImageView']]")).click();
				
			driver.findElement(By.xpath("//*[@text='Share']")).click();
			driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout' and @height>0 and ./*[@class='android.widget.LinearLayout' and ./*[@class='android.widget.FrameLayout'] and ./*[@text='Gmail']]]")).isDisplayed();
		driver.navigate().back();
	
	}

    private static void loginpat(AndroidDriver<AndroidElement> driver) throws InterruptedException {

//	Integer x_topLeftCorner=168;
//	Integer y_topLeftCorner=765;
//	 
//	Integer x_topRightCorner=952;
//	Integer y_topRightCorner=768;
//	 
//	 
//	Integer x_bottomRightCorner=892;
//	Integer y_bottomRightCorner=1505;
//	 
//	//Use coordinates to draw the security pattern and unlock the screen
//
//	TouchAction obj = new TouchAction(driver); 
//obj.press(point(x_topLeftCorner,y_topLeftCorner)).moveTo(point(x_topRightCorner,y_topRightCorner)).moveTo(point(x_bottomRightCorner,y_bottomRightCorner)).release().perform();
	
    	
TouchAction ta= new TouchAction(driver);
for (int i=0;i<=50;i++)
{
 ta.tap(point(168,765)).moveTo(point(952, 765)).moveTo(point(952, 1505)).release().perform();
 driver.findElement(By.xpath("//*[@text='OK']")).click();
 Thread.sleep(2000);
}
}

    public static void sethome()
	{
		for (int i = 0; i < 50; i++){
			try {
				driver.findElement(By.xpath("//*[@class='android.widget.RelativeLayout' and @width>0 and ./*[@text='Home'] and ./*[@class='android.widget.ImageView']]")).isDisplayed();
				break;
			}
		catch(NoSuchElementException e)
		{
			driver.navigate().back();
		}
		}
		
		
	}





}