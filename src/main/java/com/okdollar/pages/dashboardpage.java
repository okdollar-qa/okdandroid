package com.okdollar.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class dashboardpage extends base{
	
	@FindBy(xpath="//*[@text='Face ID Pay']")
	public AndroidElement faceipayicon;
	
	@FindBy(xpath="//*[@text='Other Number']")
	public AndroidElement topupothernumbericon;
	
	@FindBy(xpath="//*[@text='Pay / Send']")
	public AndroidElement payto;
	
	

	
	public dashboardpage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	public void selfaceidpayicon() {
		
		faceipayicon.click();
		
	}
	
}
