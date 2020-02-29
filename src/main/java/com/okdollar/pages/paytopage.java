package com.okdollar.pages;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class paytopage extends base {
	
	@FindBy(xpath="//*[@class='android.widget.ImageButton']")
	public AndroidElement backbtn  ;
	
	@FindBy(xpath="//*[@text='Pay / Send']")
	public AndroidElement title  ;
	
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/scan2']")
	public AndroidElement topmoremenu  ;
	
	@FindBy(xpath="//*[@text='Add Money']")
	public AndroidElement addmoney ;
	
	@FindBy(xpath="//*[@text='Pay To']")
	public AndroidElement paytotab  ;
	
	@FindBy(xpath="//*[@text='Scan To Pay']")
	public AndroidElement scantopaytab ;
	
	@FindBy(xpath="//*[@text='Map']")
	public AndroidElement maptab ;
	
	@FindBy(xpath="//*[@text='Received Payment Request']")
	public AndroidElement receivedpaymentreqtab ;
	
	@FindBy(xpath="//*[@text='Sent Payment Request']")
	public AndroidElement sentpaymentreqtab  ;
	
	@FindBy(xpath="(//*[@class='android.widget.LinearLayout' and ./parent::*[@id='nvlValidation']]/*[@class='android.widget.ImageView' and @width>0])[1]")
	public AndroidElement flag  ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/account_number_edittext']")
	public AndroidElement mobnumfield;
	
	@FindBy(xpath="((//*[@id='nvlValidation']/*[@class='android.widget.LinearLayout'])[1]/*[@class='android.widget.ImageView' and @width>0])[2]")
	public AndroidElement mobnumclearicon ;
	
	@FindBy(xpath="(//*[@id='nvlValidation']/*/*[@class='android.widget.EditText'])[2]")
	public AndroidElement confmobnum  ;
	
	@FindBy(xpath="((//*[@id='nvlValidation']/*[@class='android.widget.LinearLayout'])[2]/*[@class='android.widget.ImageView' and @width>0])[2]")
	public AndroidElement confmobnumclearicon ;
	
	@FindBy(xpath="")
	public AndroidElement Contact ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_send_money_transaction_type']")
	public AndroidElement categoryvalue ;
	
	@FindBy(xpath="//*[@id='til_merchant']")
	public AndroidElement acctype ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/tv_merchantName']")
	public AndroidElement accname ;
	
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/tv_businessName']")
	public AndroidElement businessname  ;
	
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_send_money_amount']")
	public AndroidElement amtfield ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/sendmoney_image_crossamount']")
	public AndroidElement amtclearicon ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/sendmoney_image_miceIcons']")
	public AndroidElement amtsoundicon ;
	
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_send_money_amount_voice']")
	public AndroidElement burmeseamt  ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_send_money_comment']")
	public AndroidElement remarks ;
	
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_send_money_checkbox']")
	public AndroidElement hidemynumcheckbox ;
	
	@FindBy(xpath="//*[@class='android.widget.ImageButton' and ./parent::*[@id='fab_multiMenus']]")
	public AndroidElement plusbtn  ;
	
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_send_money_submit_button']")
	public AndroidElement submitbtn ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/new_send_money_add_vehicle']")
	public AndroidElement addvehiclefield ;
	
	
	@FindBy(xpath="//*[@text='Are you sure want to payto Unregister number?']")
	public AndroidElement unregpopup ;
	
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/tv_cancel']")
	public AndroidElement unregpopupokbtn  ;
	
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/tv_ok']")
	public AndroidElement unregpopupcancelbtn ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/add_fav']")
	public AndroidElement addfromfav ;
	
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/add_from_contact']")
	public AndroidElement addfromcontact ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/oklayout']")
	public AndroidElement tippopup ;
	
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/bill_input_amount']")
	public AndroidElement billamt ;
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/enter_tips_amount']")
	public AndroidElement tipamtfield ;
	
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/btn_cancel']")
	public AndroidElement tippopupnothanksbtn  ;
	

	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/btn_settings']")
	public AndroidElement tipopupokbtn  ;
	

	
	
	

	
	public  paytopage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
	}
	


}
