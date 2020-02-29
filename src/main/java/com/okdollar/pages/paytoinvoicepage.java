package com.okdollar.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class paytoinvoicepage extends base{
	
	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/ctv_trans_receipt_title']")
	public AndroidElement title  ;


	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transaction_invoice_name']")
	public AndroidElement sendernameval  ;


	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transaction_invoice_number']")
	public AndroidElement sendernumval  ;


	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transaction_receiver_name']")
	public AndroidElement receivernameval  ;


	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transaction_invoice_receiver']")
	public AndroidElement receivernumval  ;


	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transaction_invoice_transactionId']")
	public AndroidElement txnidval  ;


	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transaction_invoice_transactiontype']")
	public AndroidElement txntypeval  ;


	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transaction_invoice_date']")
	public AndroidElement datetimeval  ;


	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/cashback_value']")
	public AndroidElement cashbackval   ;


	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/transaction_invoice_amount']")
	public AndroidElement amtpaidval  ;


	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/tranasaction_invoice_qrode']")
	public AndroidElement qrcode  ;


	@FindBy(xpath="//*[@resource-id='com.jas.digitalkyats:id/invoice_share']")
	public AndroidElement  sharebtn ;


	
	public  paytoinvoicepage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
	}
}
