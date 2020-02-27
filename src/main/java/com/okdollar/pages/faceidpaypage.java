package com.okdollar.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class faceidpaypage extends base {

	
	@FindBy(xpath="//*[@text='Deposit to transfer money']")
	public AndroidElement depositbtn;
	
	@FindBy(xpath="//*[@text='Withdrawal']") 
	public AndroidElement withdrawbtn;
	
	@FindBy(xpath="//*[@contentDescription='FacePay Demo Videos']")
	public AndroidElement videoicon;
	
	@FindBy(xpath="//*[@class='android.widget.ImageButton']")
	public AndroidElement backbtn;
	
	public  faceidpaypage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
	}
	

}
