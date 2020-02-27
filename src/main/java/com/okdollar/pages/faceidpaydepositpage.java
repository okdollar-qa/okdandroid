package com.okdollar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class faceidpaydepositpage extends base
{

	@FindBy(xpath="//*[contains(text(),'Use My Account')]")
	public AndroidElement usemyacc;
	
	@FindBy(xpath="//*[@text='Depositor']")
	public AndroidElement depradiobtn;
	
	@FindBy(xpath="(//*[@class='android.widget.RadioGroup']/*[@class='android.widget.RadioButton'])[2]")
	public AndroidElement withdrawradiobtn;
	
	@FindBy(xpath="//*[@class='android.widget.EditText']")
	public AndroidElement mobnum;
	
	@FindBy(xpath="(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.RelativeLayout']]/*/*[@class='android.widget.EditText'])[2]")
	public AndroidElement confirmmobnum;
	
	@FindBy(xpath="//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]")
	public AndroidElement amtfield;
	
	@FindBy(xpath="//*[@class='android.widget.LinearLayout' and @width>0 and ./*[@text='(+95)'] and ./parent::*[./parent::*[./parent::*[./parent::*[@id='com.jas.digitalkyats:id/']]]] and ./*[@class='android.widget.ImageView'] and ./*[@id='com.jas.digitalkyats:id/']]//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[./parent::*[./parent::*[./parent::*[@id='com.jas.digitalkyats:id/']]]]] and (./preceding-sibling::* | ./following-sibling::*)[@text='(+95)']]")
	public AndroidElement wdmobnum;
	
	@FindBy(xpath="(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.RelativeLayout']]/*/*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.LinearLayout']])[4]")
	public AndroidElement wdconmobnum;
	
	@FindBy(xpath="//*[@text='Next']")
	public AndroidElement nextbtn;
	
	
	
	
	public  faceidpaydepositpage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
	}
	
	


public void selfromcontact(String name) throws InterruptedException
{
	if(driver.findElements(By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']]/*[@class='android.widget.ImageView'])[2]")).size()==0)
	{
	 
	   driver.findElement(By.xpath("((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*/*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']])[1]/*[@class='android.widget.ImageView'])[3]")).click(); 

	}
	else
	{
	  driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']]/*[@class='android.widget.ImageView'])[2]")).click();

	}  
	AndroidElement consericon = driver.findElement(By.xpath("//*[@contentDescription='Search for other area']"));
	consericon.click();
	
	AndroidElement conser = driver.findElement(By.xpath("//*[@class='android.widget.EditText']"));
	conser.sendKeys(name);
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@class='android.widget.LinearLayout' and @width>0 and @height>0 and ./*[@text and @id='com.jas.digitalkyats:id/']]")).click();
	
}

public void selcountry(String countryname)
{
	driver.findElement(By.xpath("(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']]/*[@class='android.widget.ImageView'])[1]"));
	
	
	driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).sendKeys(countryname);
	driver.findElement(By.xpath("//*[contains(text(),'"+countryname+"')]")).click();
	
}


public void enterdepname(String gender, String prefix, String name)

{
	driver.findElement(By.xpath("//*[@text='Enter Depositor Name']")).click();
	driver.findElement(By.xpath("//*[@text='"+gender+"']")).click();
	driver.findElement(By.xpath("//*[@text='"+prefix+"']")).click();
	driver.findElement(By.xpath("//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@id='com.jas.digitalkyats:id/']]")).sendKeys(name);
	

}

public void seldepphoto() throws InterruptedException
{
	
	driver.findElement(By.xpath("//*[@text='Attach Depositor Face Photo']")).click();
	driver.findElement(By.xpath("//*[@text='Gallery']")).click();
	driver.findElement(By.xpath("//*[@text='OK']")).click();
	AndroidElement image =driver.findElement(By.xpath("//*[@text='20191213_222352.jpg']"));
	JavascriptExecutor js = ((JavascriptExecutor) driver);
	js.executeScript("arguments[0].scrollIntoView(true);", image);
	Thread.sleep(5000);
	
}

public void enterdepnrc()
{
	driver.findElement(By.xpath("//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and @height>0 and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[./parent::*[@id='com.jas.digitalkyats:id/']]]]")).click();
	
	driver.findElement(By.xpath("//*[@text='4/(Chin State)']")).click();
	driver.findElement(By.xpath("//*[@text='4/(PhaLaNa) Falam']")).click();
	driver.findElement(By.xpath("//*[@text='4/PhaLaNa(N)']")).click();
	
	driver.findElement(By.xpath("//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and @height>0 and (./preceding-sibling::* | ./following-sibling::*)[@text='4/PhaLaNa(N)'] and ./parent::*[@id='com.jas.digitalkyats:id/']]")).sendKeys("123456");

}
public void enterwdname(String gender, String prefix, String name)

{
	driver.findElement(By.xpath("//*[@text='Enter Withdrawal Name']")).click();
	driver.findElement(By.xpath("//*[@text='"+gender+"']")).click();
	driver.findElement(By.xpath("//*[@text='"+prefix+"']")).click();
	driver.findElement(By.xpath("//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and @height>0 and ./parent::*[@id='com.jas.digitalkyats:id/']]")).sendKeys(name);
	

}
public void selwdphoto() throws InterruptedException
{
	
	driver.findElement(By.xpath("//*[@text='Attach Withdrawal Face Photo']")).click();
	driver.findElement(By.xpath("//*[@text='Gallery']")).click();
	driver.findElement(By.xpath("//*[@text='OK']")).click();
	AndroidElement image =driver.findElement(By.xpath("//*[@id='thumbnail' and (./preceding-sibling::* | ./following-sibling::*)[./*[@height>0] and ./*[contains(text(),'20191213')]]]"));
//	JavascriptExecutor js = ((JavascriptExecutor) driver);
//	js.executeScript("arguments[0].scrollIntoView(true);", image);
	image.click();
	Thread.sleep(5000);
	
}
public void enterwdnrc()
{
	driver.findElement(By.xpath("//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and @height>0 and ./parent::*[@class='android.widget.FrameLayout']]")).click();
	
	driver.findElement(By.xpath("//*[@text='13/(Shan State)']")).click();
	driver.findElement(By.xpath("//*[@text='13/(HaPaNa) Hopang']")).click();
	driver.findElement(By.xpath("//*[@text='13/HaPaNa(N)']")).click();
	
	driver.findElement(By.xpath("//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and @height>0 and ./parent::*[@id='com.jas.digitalkyats:id/'] and (./preceding-sibling::* | ./following-sibling::*)[@text='13/HaPaNa(N)']]")).sendKeys("123123");

}

public void seldiv()
{
	driver.findElement(By.xpath("//*[@text='Select State / Division']")).click();
	driver.findElement(By.xpath("//*[@text='Yangon Division']")).click();
	
	
}

public void addaddress()
{
	driver.findElement(By.xpath("//*[@text='Do you want to send full address']")).click();
	driver.findElement(By.xpath("//*[@text='Select Township']")).click();
	driver.findElement(By.xpath("//*[@text='Botahtaung']")).click();
	driver.findElement(By.xpath("//*[@text and @class='android.widget.EditText' and @height>0 and ./parent::*[@class='android.widget.RelativeLayout']]")).sendKeys("50 street");
	
	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @height>0 and ./parent::*[@class='android.widget.LinearLayout'] and (./preceding-sibling::* | ./following-sibling::*)[@text='House No.']]")).sendKeys("1");
	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @height>0 and ./parent::*[@class='android.widget.LinearLayout'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Floor No.']]")).sendKeys("2");
	driver.findElement(By.xpath("//*[@class='android.widget.EditText' and @height>0 and ./parent::*[@class='android.widget.LinearLayout'] and (./preceding-sibling::* | ./following-sibling::*)[@text='Room No.']]")).sendKeys("3");
	
}

}