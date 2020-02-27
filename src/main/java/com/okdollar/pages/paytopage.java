package com.okdollar.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class paytopage extends base {
	
	@FindBy(xpath="(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']]/*[@class='android.widget.ImageView'])[1]")
	AndroidElement flag;
	
	@FindBy(xpath="//*[@class='android.widget.EditText']")
	AndroidElement mobnum;
	
	@FindBy(xpath="(//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and ./parent::*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]]/*/*[@class='android.widget.EditText'])[2]")
	AndroidElement conmobnum;
	
	@FindBy(xpath="((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[1]")
	AndroidElement name;
	
	@FindBy(xpath="((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']])[3]")
	AndroidElement businame;
	
	
	@FindBy(xpath="((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout' and @height>0 and ./*[@class='android.widget.FrameLayout' and ./*[@text]]])[2]")
	AndroidElement amt;
	
	@FindBy(xpath="((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout' and ./parent::*[@id='com.jas.digitalkyats:id/']]])[2]")
	AndroidElement amtt;
	
	@FindBy(xpath="//*[@text and @id='com.jas.digitalkyats:id/' and @class='android.widget.TextView' and @width>0 and ./parent::*[@class='android.widget.LinearLayout']]")
	AndroidElement buramt;
	
	@FindBy(xpath="((//*[@class='android.widget.LinearLayout' and ./parent::*[@id='com.jas.digitalkyats:id/' and @class='android.widget.FrameLayout']]/*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout'])[3]/*/*/*/*[@class='android.widget.EditText' and @height>0 and ./parent::*[./parent::*[@id='com.jas.digitalkyats:id/']]])[3]")
	AndroidElement rem;
	@FindBy(xpath="//*[@class='android.widget.EditText']")
	AndroidElement hidemynum;
	
	@FindBy(xpath="//*[@class='android.widget.Button']")
	AndroidElement submitbtn;
	
	
	public  paytopage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
	}
	
	public void paytosubmit() throws InterruptedException
	{
		driver.findElement(By.xpath("//*[@text='Pay / Send1']")).click();
		mobnum.sendKeys("09897241420");
		conmobnum.sendKeys("09897241420");
		Thread.sleep(3000);
		amtt.sendKeys("100");
		submitbtn.click();
		
		
		
		
	}
	

}
