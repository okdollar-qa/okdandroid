package com.okdollar.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class topupotherconfpage extends base
{
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/custom_actionbar_application_left_image']")
	public AndroidElement backicon    ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/custom_actionbar_application_textview_title_of_application']")
	public  AndroidElement  title ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_topup_your_name']")
	public AndroidElement  nameval  ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_topup_your_number']")
	public AndroidElement numval   ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_topup_your_topupconf_type']")
	public AndroidElement  typeval ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_topup_your_topupconf_cashbk']")
	public AndroidElement cashbackval   ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_topup_your_topupconf_topamt']")
	public AndroidElement amtval   ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/ad_gif']")
	public AndroidElement  ad ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/text_topupconfm_btn']")
	public AndroidElement paybtn   ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/tv_ok']")
	public AndroidElement   sessionexpiredokbtn;
	

	
		
public topupotherconfpage() {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	//PageFactory.initElements(driver, this);
}

	
	
	
}
