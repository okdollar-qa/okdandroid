package com.okdollar.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class topupothernumberpage extends base{
	
	@FindBy(xpath="//*[@text='Other Number']")
	public AndroidElement title;
	
	@FindBy(xpath="//*[@text='   TOP-UP   ']")
	public AndroidElement topuptab;
	
	@FindBy(xpath="//*[@text='  DATA PLAN  ']")
	public AndroidElement dataplantab;
	
	@FindBy(xpath="//*[@text='SPECIAL OFFERS']")
	public AndroidElement specialofferstab;
	
	@FindBy(xpath="//*[@id='TopupNumber']")
	public	AndroidElement mobnum ;
	
	@FindBy(xpath="//*[@id='iv_num_clear_contact']")
	public AndroidElement mobnumclearicon  ;
	
	@FindBy(xpath="//*[@id='multiple_topup_contact_image']")
	public AndroidElement contacticon  ;
	
	@FindBy(xpath="//*[@id='ConfirmTopupNumber']")
	public AndroidElement conmobnum;
	
	
	@FindBy(xpath="//*[@id='confirm_iv_num_clear_contact']")
	public AndroidElement  conmobnumclearicon ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/TopupAmount']")
	public  AndroidElement amtfield ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/bonus_point']")
	public AndroidElement bonpointfield  ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/fab_add']")
	public AndroidElement plusicon ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_send_money_submit_button']")
	public AndroidElement submitbtn  ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/custom_actionbar_application_right_image']")
	public AndroidElement operatorname ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/custom_actionbar_application_left_image']")
	public AndroidElement backicon ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/adverImage']")
	public AndroidElement ad  ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/add_fav']")
	public AndroidElement addfromfav  ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/add_from_contact']")
	public 	AndroidElement addfromcontact  ;
	
		
public topupothernumberpage() {
	PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	//PageFactory.initElements(driver, this);
}








}