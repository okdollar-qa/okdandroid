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
	public AndroidElement paytoicon;
	
	@FindBy(xpath="//*[@text='Instant Pay']")
	public AndroidElement instantpayicon;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/searchLayout']")
	public AndroidElement searchbar;
	
	
	

	
	public dashboardpage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
	
	public void selfaceidpayicon() {
		
		faceipayicon.click();
		
	}
	
}
