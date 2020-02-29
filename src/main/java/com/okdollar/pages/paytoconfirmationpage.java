package com.okdollar.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class paytoconfirmationpage extends base{
	
	@FindBy(xpath="//*[@contentDescription='Navigate up']")
	public AndroidElement backicon   ;
	
	@FindBy(xpath="//*[@text='Confirmation']")
	public AndroidElement title   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/custom_textview_timer']")
	public AndroidElement  toptimer  ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/confirmation_Screen_textview_receiverName_add']")
	public AndroidElement receivernumval   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/confirmation_Screen_textview_nameadd']")
	public AndroidElement receivernameval   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/tv_account_type_receiver']")
	public AndroidElement acctypeval   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/confirmation_Screen_textview_business']")
	public AndroidElement   businessnameval ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/confirmation_Screen_textview_transationType_Amountadd']")
	public AndroidElement amtval   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/confirmation_Screen_textview_kickback_amount_uer']")
	public AndroidElement cashbackval    ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/confirmationpage_kickbacktomynumber']")
	public AndroidElement cashbackmynumberradiobtn   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/confirmationpage_kickbacktoothernumber']")
	public AndroidElement cashbackothernumberradiobtn   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/mconformation_submit_button']")
	public AndroidElement  paybtn  ;

	@FindBy(xpath="//*[@text='Session Expired']")
	public AndroidElement  sessionexpiredpopup  ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/tv_ok']")
	public AndroidElement  sessionexpiredpopupokbtn  ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_send_money_mobilenumber']")
	public AndroidElement cbothermobnum   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_Send_money_confirmation']")
	public AndroidElement  cbotherconfmobnum  ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_send_money_country_image']")
	public AndroidElement cbotherflag   ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_send_money_contact_image']")
	public AndroidElement cbothercontact   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/add_fav']")
	public AndroidElement cbotheraddfromfavbtn   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/add_from_contact']")
	public AndroidElement cbotheraddfromconbtn    ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/conformation_tv_timer']")
	public AndroidElement  downtimer  ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/ratingBar1']")
	public AndroidElement  ratingfield  ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/ratingBarApp']")
	public AndroidElement ratingpopupstar   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/rating_feedback']")
	public AndroidElement  ratingpopupfeedbackfield  ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/feedback_cancel']")
	public AndroidElement  ratingpopupcancelbtn  ;


	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/feedback_ok']")
	public AndroidElement  ratingpopupsubmitbtn  ;


	
	

	
	public  paytoconfirmationpage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
	}
	


	
	
	

}
