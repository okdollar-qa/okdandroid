package com.okdollar.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.okdollar.base.base;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class topupotherselamtpage extends base{
	
	@FindBy(xpath = "//*[@class='android.widget.ImageButton']")
	public AndroidElement backbtn ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/txt_topupheaderid']")
	public AndroidElement title    ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/txt_topup_operatorid']")
	public AndroidElement  operatorname   ;
	
	@FindBy(xpath = "//*[@text='   TOP-UP   ']")
	public AndroidElement topuptab    ;
	
	@FindBy(xpath = "//*[@text='  DATA PLAN  ']")
	public AndroidElement  dataplantab   ;
	
	@FindBy(xpath = "//*[@text='SPECIAL OFFERS']")
	public AndroidElement  specialofferstab   ;
	
	@FindBy(xpath = "//*[@text='1,000']")
	public AndroidElement   amt  ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/topup_amt_fieldId']")
	public AndroidElement enteramtfield    ;
	
	@FindBy(xpath = "//*[@resource-id='com.jas.digitalkyats:id/topup_amt_btnId']")
	public AndroidElement   nextbtn  ;



	
	public topupotherselamtpage() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		//PageFactory.initElements(driver, this);
	}
	
	
}
