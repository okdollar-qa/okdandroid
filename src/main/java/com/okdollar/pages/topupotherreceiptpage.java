package com.okdollar.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class topupotherreceiptpage extends base {

	@FindBy(xpath = "//*[@text='Receipt']")
	public AndroidElement   title  ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/transcation_success_number_of_destimnation_input']")
	public AndroidElement  mobnum;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_amount_input']")
	public 	AndroidElement  amt   ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/tv_merchantName']")
	public AndroidElement  nameval   ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_catagories_input']")
	public AndroidElement  catval   ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_balance_input']")
	public AndroidElement  balval   ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_transid_input']")
	public 	AndroidElement   txnidval  ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_transtypeid_input']")
	public AndroidElement   txntype  ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_kickback_input']")
	public 	AndroidElement  cashbackval   ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/ratingFeedbackBar']")
	public AndroidElement   starrating  ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/ratingBarApp']")
	public 	AndroidElement  selstar   ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/rating_feedback']")
	public AndroidElement   ratingfeedbackfield  ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/feedback_cancel']")
	public AndroidElement  ratingclosebtn  ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/feedback_ok']")
	public AndroidElement   ratingsubmitbtn ;
	
	@FindBy(xpath = "//*[@text='Add Favorite']")
	public 	AndroidElement   addtofavicon  ;
	
	@FindBy(xpath = "//*[@text='Add Contact']")
	public AndroidElement   addtocontacticon  ;
	
	@FindBy(xpath = "//*[@text='Home']")
	public 	AndroidElement  homeicon   ;
	
	@FindBy(xpath = "//*[@text='More']")
	public AndroidElement   moreicon  ;
	
	@FindBy(xpath = "//*[@resource-id='com.samsung.android.app.contacts:id/largeLabel']")
	public AndroidElement  contactcancelnativebtn  ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/dialog_editext']")
	public 	AndroidElement  favnamefield  ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/tv_cancel']")
	public AndroidElement  favskipbtn  ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/tv_ok']")
	public AndroidElement  favsavebtn  ;

	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/tv_ok']")
	public AndroidElement  favsucpopupokbtn   ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/moreText']")
	public 	AndroidElement  moretopup   ;

	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/repeatText']")
	public AndroidElement  repeattopup   ;
	
	@FindBy(xpath = "//*[@text='Invoice']")
	public AndroidElement   invoice  ;

	@FindBy(xpath = "//*[@text='Share']")
	public 	AndroidElement  share   ;





	
	public topupotherreceiptpage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
	}
}
