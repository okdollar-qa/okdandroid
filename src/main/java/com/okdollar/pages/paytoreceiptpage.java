package com.okdollar.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class paytoreceiptpage extends base{

	@FindBy(xpath="//*[@text='Receipt']")
	public AndroidElement    title ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transcation_success_name_of_name_input']")
	public AndroidElement   businame  ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transcation_success_number_of_destimnation_input']")
	public AndroidElement mobnum    ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_amount_input']")
	public AndroidElement  amt   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/tv_merchantName']")
	public AndroidElement  usernameval   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_catagories_input']")
	public AndroidElement  categoryval   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_balance_input']")
	public AndroidElement  balanceval   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_transid_input']")
	public AndroidElement  txnidval   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_transtypeid_input']")
	public AndroidElement  txntypeval   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_loyalty_input']")
	public AndroidElement   bonusval  ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transcation_summnery_kickback_input']")
	public AndroidElement   cashbackval  ;

	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transcation_success_date_input']")
	public AndroidElement  date   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transcation_success_time_input']")
	public AndroidElement  time   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/ratingFeedbackBar']")
	public AndroidElement rating    ;

	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/ratingBarApp']")
	public AndroidElement   ratingpopupstars  ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/rating_feedback']")
	public AndroidElement  ratingpopupfeedbackfield   ;

	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/feedback_cancel']")
	public AndroidElement ratingpopupclosebtn     ;

	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/feedback_ok']")
	public AndroidElement  ratingpopupsubmitbtn   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transaction_infor_add_to_Fav']")
	public AndroidElement  addtofav   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/dialog_editext']")
	public AndroidElement  addtofavpopupnamefield   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/tv_cancel']")
	public AndroidElement   addtofavpopupskipbtn  ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/tv_ok']")
	public AndroidElement addtofavpopupsavebtn    ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transaction_infor_add_to_cont']")
	public AndroidElement   addcontact  ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transaction_infor_home']")
	public AndroidElement homeicon    ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transaction_info_more']")
	public AndroidElement   moreicon  ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/relative_morePayment']")
	public AndroidElement  morepayment   ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/relative_repeatPayment']")
	public AndroidElement  repeatpayment   ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/relative_invoice']")
	public AndroidElement invoice    ;

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/relative_Share']")
	public AndroidElement share    ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transcation_success_car']")
	public AndroidElement vehiclenumberval  ;
	
	
	

	
	public  paytoreceiptpage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
	}
}
