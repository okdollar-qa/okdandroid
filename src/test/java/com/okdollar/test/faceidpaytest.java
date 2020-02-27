package com.okdollar.test;

import java.net.MalformedURLException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.okdollar.base.base;
import com.okdollar.pages.dashboardpage;
import com.okdollar.pages.faceidpaydepositpage;
import com.okdollar.pages.faceidpaypage;
import com.okdollar.pages.faceidpayvideopage;

import okdollar.payto;

public class faceidpaytest extends base {
	faceidpaypage fp;
	faceidpaydepositpage fpdep;
	faceidpayvideopage fpvid;
	dashboardpage	db;
	public  faceidpaytest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
      initialization();
   
  fp =  new faceidpaypage();
  fpdep=new faceidpaydepositpage();
  fpvid= new faceidpayvideopage();
  db = new dashboardpage();
	}
	@Test
	public void basicflow() throws InterruptedException
	{
		db.faceipayicon.click();
		fp.depositbtn.click();
		fpdep.mobnum.sendKeys("092222224");
		fpdep.confirmmobnum.sendKeys("092222224");
		Thread.sleep(5000);
		fpdep.enterdepname("Male", "Mr", "Madan");
		fpdep.amtfield.sendKeys("1000");
		Thread.sleep(3000);
		fpdep.wdmobnum.sendKeys("09254801467");
		fpdep.wdconmobnum.sendKeys("09254801467");
		Thread.sleep(5000);
		fpdep.enterwdname("Male", "Dr", "Mani");
		fpdep.selwdphoto();
		Thread.sleep(5000);
		fpdep.seldiv();
		fpdep.nextbtn.click();
		payto.loginpwd(driver);
		
		

		
	}
	
	
	
	
}
