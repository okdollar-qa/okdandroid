package com.okdollar.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class faceidpayvideopage extends base {
	
	@FindBy(xpath="//*[@text='Face Payment']")
	public AndroidElement facevideoicon;
	
	@FindBy(xpath="//*[@id='com.jas.digitalkyats:id/' and @class='android.widget.LinearLayout']")
	public AndroidElement youtubepopup;
	
	
	@FindBy(xpath="//*[@text='Cancel']")
	public AndroidElement cancelinpopup;
	
	
	@FindBy(xpath="//*[@text='OK']")
	public AndroidElement okinpopup;
	
	public  faceidpayvideopage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
	}
	

}
