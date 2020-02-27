package com.okdollar.test;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.okdollar.base.base;
import com.okdollar.pages.dashboardpage;
import com.okdollar.pages.topupotherconfpage;
import com.okdollar.pages.topupotherinvoicepage;
import com.okdollar.pages.topupothernumberpage;
import com.okdollar.pages.topupotherreceiptpage;
import com.okdollar.pages.topupotherselamtpage;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import okdollar.payto;

public class topupothertest extends base{
	String oordeooselamttxnid ;
	String oordeooenteramttxnid ;
	String ooredoodataplantxnid;
	
	String mptselamttxnid ;
	String mptdataplantxnid;
	
	String telenorselamttxnid ;
	String telenorenteramttxnid ;
	String telenordataplantxnid;
	
	String mytelselamttxnid ;
	String mytelenteramttxnid ;
	String myteldataplantxnid;
	
	String mectelselamttxnid ;
	String mectelenteramttxnid ;
	
	
	
	
	
	topupothernumberpage topupothernumberpage;
	topupotherselamtpage topupotherselamtpage;
	
    topupotherconfpage topupotherconfpage;
    topupotherreceiptpage topupotherreceiptpage;
    topupotherinvoicepage topupotherinvoicepage;
    dashboardpage dashboardpage;
    SoftAssert softAssert= new SoftAssert();

    
	public topupothertest() {	
		super();
		
	}
	
	
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
      initialization();
   
      topupothernumberpage =  new topupothernumberpage();
      topupotherselamtpage = new topupotherselamtpage();
      topupotherconfpage = new topupotherconfpage();
      topupotherreceiptpage = new topupotherreceiptpage();
      topupotherinvoicepage = new topupotherinvoicepage();  
      dashboardpage = new dashboardpage();
      driver.navigate().back();
      sethome();
      
	}

@Test(priority =1)
public void ooredootopupselamt() throws InterruptedException
{
	dashboardpage.topupothernumbericon.click();
	topupothernumberpage.mobnum.sendKeys("09971554804");
	topupothernumberpage.conmobnum.sendKeys("09971554804");
	topupothernumberpage.amtfield.click();
	topupotherselamtpage.amt.click();
	 try{
         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
         payto.loginpwd(driver);
     }
     catch(NoSuchElementException e){
        
     }
	
	 waitandclick(topupotherconfpage.paybtn);
	 Thread.sleep(5000);
	softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
	 

	 oordeooselamttxnid= topupotherreceiptpage.txnidval.getText();
	 System.out.println("oordeooselamttxnid"+oordeooselamttxnid);
	 softAssert.assertAll();

	
}

@Test(priority =2)
public void ooredootopupenteramt() throws InterruptedException
{
	
	dashboardpage.topupothernumbericon.click();
	topupothernumberpage.mobnum.sendKeys("09970608712");
	topupothernumberpage.conmobnum.sendKeys("09970608712");
	topupothernumberpage.amtfield.click();
	topupotherselamtpage.enteramtfield.sendKeys("1005");
	topupotherselamtpage.nextbtn.click();
	 try{
         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
         payto.loginpwd(driver);
     }
     catch(NoSuchElementException e){
        
     }
	
	 waitandclick(topupotherconfpage.paybtn);
	 Thread.sleep(5000);
	softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
	 

	oordeooenteramttxnid= topupotherreceiptpage.txnidval.getText();
	 System.out.println("oordeooenteramttxnid"+oordeooenteramttxnid);
	 softAssert.assertAll();
	
}

@Test(priority =3)
public void ooredoodataplan() throws InterruptedException
{
	dashboardpage.topupothernumbericon.click();
	topupothernumberpage.mobnum.sendKeys("09971554804");
	topupothernumberpage.conmobnum.sendKeys("09971554804");
	topupothernumberpage.amtfield.click();
	topupotherselamtpage.dataplantab.click();
	driver.findElement(By.xpath("//*[@text='999']")).click();
	
	 try{
         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
         payto.loginpwd(driver);
     }
     catch(NoSuchElementException e){
        
     }
	
	 waitandclick(topupotherconfpage.paybtn);
	 Thread.sleep(5000);
	softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
	 

	ooredoodataplantxnid= topupotherreceiptpage.txnidval.getText();
	 System.out.println("ooredoodataplantxnid"+ooredoodataplantxnid);
	 softAssert.assertAll();

	
}
 


@Test(priority =4)
public void mpttopupselamt() throws InterruptedException
{
	
		dashboardpage.topupothernumbericon.click();
		topupothernumberpage.mobnum.sendKeys("09897241420");
		topupothernumberpage.conmobnum.sendKeys("09897241420");
		topupothernumberpage.amtfield.click();
		topupotherselamtpage.amt.click();
		 try{
	         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
	         payto.loginpwd(driver);
	     }
	     catch(NoSuchElementException e){
	        
	     }
		
		 waitandclick(topupotherconfpage.paybtn);
		 Thread.sleep(5000);
		softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
		 
	
		mptselamttxnid= topupotherreceiptpage.txnidval.getText();
		 System.out.println("mptselamttxnid"+mptselamttxnid);
		 
		 softAssert.assertAll();
	
		
	}
	



@Test(priority =5)
public void mptdataplan() throws InterruptedException
{
	
	dashboardpage.topupothernumbericon.click();
	topupothernumberpage.mobnum.sendKeys("09897241420");
	topupothernumberpage.conmobnum.sendKeys("09897241420");
	topupothernumberpage.amtfield.click();
	topupotherselamtpage.dataplantab.click();
	driver.findElement(By.xpath("//*[@text='999']")).click();
	
	 try{
         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
         payto.loginpwd(driver);
     }
     catch(NoSuchElementException e){
        
     }
	
	 waitandclick(topupotherconfpage.paybtn);
	 Thread.sleep(5000);
	softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
	 

	 mptdataplantxnid= topupotherreceiptpage.txnidval.getText();
	 System.out.println("mptdataplantxnid"+mptdataplantxnid);
	 softAssert.assertAll();

	
}


@Test
public void telenortopupselamt() throws InterruptedException
{
	dashboardpage.topupothernumbericon.click();
	topupothernumberpage.mobnum.sendKeys("09774819667");
	topupothernumberpage.conmobnum.sendKeys("09774819667");
	topupothernumberpage.amtfield.click();
	topupotherselamtpage.amt.click();
	 try{
         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
         payto.loginpwd(driver);
     }
     catch(NoSuchElementException e){
        
     }
	
	 waitandclick(topupotherconfpage.paybtn);
	 Thread.sleep(5000);
	softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
	 

	telenorselamttxnid = topupotherreceiptpage.txnidval.getText();
	 System.out.println("telenorselamttxnid "+telenorselamttxnid );
	 
	 softAssert.assertAll();


	
}

@Test
public void telenortopupenteramt() throws InterruptedException
{

		
		dashboardpage.topupothernumbericon.click();
		topupothernumberpage.mobnum.sendKeys("09774819667");
		topupothernumberpage.conmobnum.sendKeys("09774819667");
		topupothernumberpage.amtfield.click();
		topupotherselamtpage.enteramtfield.sendKeys("1000");
		topupotherselamtpage.nextbtn.click();
		 try{
	         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
	         payto.loginpwd(driver);
	     }
	     catch(NoSuchElementException e){
	        
	     }
		
		 waitandclick(topupotherconfpage.paybtn);
		 Thread.sleep(5000);
		softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
		 
	
		telenorenteramttxnid = topupotherreceiptpage.txnidval.getText();
		 System.out.println("telenorenteramttxnid "+telenorenteramttxnid );
		 softAssert.assertAll();
		

	
}

@Test
public void telenordataplan() throws InterruptedException
{
	
	dashboardpage.topupothernumbericon.click();
	topupothernumberpage.mobnum.sendKeys("09774819667");
	topupothernumberpage.conmobnum.sendKeys("09778419667");
	topupothernumberpage.amtfield.click();
	topupotherselamtpage.dataplantab.click();
	driver.findElement(By.xpath("//*[@text='799']")).click();
	
	 try{
         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
         payto.loginpwd(driver);
     }
     catch(NoSuchElementException e){
        
     }
	
	 waitandclick(topupotherconfpage.paybtn);
	 Thread.sleep(5000);
	softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
	 

	telenordataplantxnid = topupotherreceiptpage.txnidval.getText();
	 System.out.println("telenordataplantxnid "+telenordataplantxnid );
	 softAssert.assertAll();
	
}


@Test
public void myteltopupselamt() throws InterruptedException
{
	
	dashboardpage.topupothernumbericon.click();
	topupothernumberpage.mobnum.sendKeys("09692874819");
	topupothernumberpage.conmobnum.sendKeys("09692874819");
	topupothernumberpage.amtfield.click();
	topupotherselamtpage.amt.click();
	 try{
         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
         payto.loginpwd(driver);
     }
     catch(NoSuchElementException e){
        
     }
	
	 waitandclick(topupotherconfpage.paybtn);
	 Thread.sleep(5000);
	softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
	 

	mytelselamttxnid  = topupotherreceiptpage.txnidval.getText();
	 System.out.println("mytelselamttxnid  "+mytelselamttxnid  );
	 
	 softAssert.assertAll();

	
}

@Test
public void myteltopupenteramt() throws InterruptedException
{
	dashboardpage.topupothernumbericon.click();
	topupothernumberpage.mobnum.sendKeys("09692874819");
	topupothernumberpage.conmobnum.sendKeys("09692874819");
	topupothernumberpage.amtfield.click();
	topupotherselamtpage.enteramtfield.sendKeys("1000");
	topupotherselamtpage.nextbtn.click();
	 try{
         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
         payto.loginpwd(driver);
     }
     catch(NoSuchElementException e){
        
     }
	
	 waitandclick(topupotherconfpage.paybtn);
	 Thread.sleep(5000);
	softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
	 

	mytelenteramttxnid  = topupotherreceiptpage.txnidval.getText();
	 System.out.println("mytelenteramttxnid  "+mytelenteramttxnid  );
	 softAssert.assertAll();
	


	
}

@Test
public void myteldataplan() throws InterruptedException
{
	dashboardpage.topupothernumbericon.click();
	topupothernumberpage.mobnum.sendKeys("09692874819");
	topupothernumberpage.conmobnum.sendKeys("09692874819");
	topupothernumberpage.amtfield.click();
	topupotherselamtpage.dataplantab.click();
	driver.findElement(By.xpath("//*[@text='2,400']")).click();
	
	 try{
         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
         payto.loginpwd(driver);
     }
     catch(NoSuchElementException e){
        
     }
	
	 waitandclick(topupotherconfpage.paybtn);
	 Thread.sleep(5000);
	softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
	 

	myteldataplantxnid  = topupotherreceiptpage.txnidval.getText();
	 System.out.println("myteldataplantxnid  "+myteldataplantxnid  );
	 softAssert.assertAll();
	

	
}



@Test
public void mecteltopupselamt() throws InterruptedException
{
	dashboardpage.topupothernumbericon.click();
	topupothernumberpage.mobnum.sendKeys("0930965918");
	topupothernumberpage.conmobnum.sendKeys("0930965918");
	topupothernumberpage.amtfield.click();
	topupotherselamtpage.amt.click();
	 try{
         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
         payto.loginpwd(driver);
     }
     catch(NoSuchElementException e){
        
     }
	
	 waitandclick(topupotherconfpage.paybtn);
	 Thread.sleep(5000);
	softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
	 

	mectelselamttxnid   = topupotherreceiptpage.txnidval.getText();
	 System.out.println("mectelselamttxnid   "+mectelselamttxnid   );
	 
	 softAssert.assertAll();

	
}

@Test
public void mecteltopupenteramt() throws InterruptedException
{
	
	dashboardpage.topupothernumbericon.click();
	topupothernumberpage.mobnum.sendKeys("0930965918");
	topupothernumberpage.conmobnum.sendKeys("0930965918");
	topupothernumberpage.amtfield.click();
	topupotherselamtpage.enteramtfield.sendKeys("1000");
	topupotherselamtpage.nextbtn.click();
	 try{
         driver.findElement(By.xpath("//*[@class='android.widget.EditText' and ./parent::*[@class='android.widget.FrameLayout']]"));
         payto.loginpwd(driver);
     }
     catch(NoSuchElementException e){
        
     }
	
	 waitandclick(topupotherconfpage.paybtn);
	 Thread.sleep(5000);
	softAssert.assertEquals(topupotherreceiptpage.title.getText(), "Receipt");
	 

	mectelenteramttxnid   = topupotherreceiptpage.txnidval.getText();
	 System.out.println("mectelenteramttxnid "+mectelenteramttxnid   );
	 softAssert.assertAll();
	
}

//---------------------------------------------------------- From here verification for topup starts--------------------
@Test(priority =2)
public void ooredootopupselamtverify()
{
	String msg =verifytopup(oordeooselamttxnid);
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("Oordeoo select amt is verified and the transaction id is:"+oordeooselamttxnid);

	
}

@Test(priority=2)
public void ooredootopupenteramtverify()
{
	String msg =verifytopup(oordeooenteramttxnid );
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("oordeoo enter amt  is verified and the transaction id is:"+oordeooenteramttxnid );

	
	
}

@Test(priority=1)
public void ooredoodataplanverify()
{
	String msg =verifytopup(ooredoodataplantxnid );
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("ooredoo dataplan  is verified and the transaction id is:"+ooredoodataplantxnid );

	
}



@Test
public void mpttopupselamtverify()
{
	
	String msg =verifytopup(mptselamttxnid );
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("mpt select amt  is verified and the transaction id is:"+mptselamttxnid );

}



@Test
public void mptdataplanverify()
{
	String msg =verifytopup(mptdataplantxnid );
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("mpt dataplan   is verified and the transaction id is:"+mptdataplantxnid );

}


@Test
public void telenortopupselamtverify()
{
	String msg =verifytopup(telenorselamttxnid );
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("telenor select amt   is verified and the transaction id is:"+telenorselamttxnid );
	
}

@Test
public void telenortopupenteramtverify()
{
	
	String msg =verifytopup(telenorenteramttxnid );
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("telenor enter amt   is verified and the transaction id is:"+telenorenteramttxnid );
	
}

@Test
public void telenordataplanverify()
{
	
	String msg =verifytopup(telenordataplantxnid );
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("telenor dataplan   is verified and the transaction id is:"+telenordataplantxnid );

}

@Test
public void myteltopupselamtverify()
{
	
	String msg =verifytopup(mytelselamttxnid );
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("mytel select amt   is verified and the transaction id is:"+mytelselamttxnid );

	
}

@Test
public void myteltopupenteramtverify()
{
	
	String msg =verifytopup(mytelenteramttxnid );
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("mytel enter amt   is verified and the transaction id is:"+mytelenteramttxnid );

	
}

@Test
public void myteldataplanverify()
{
	
	String msg =verifytopup(myteldataplantxnid );
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("mytel dataplan   is verified and the transaction id is:"+myteldataplantxnid );

	
}



@Test
public void mecteltopupselamtverify()
{
	String msg =verifytopup(mectelselamttxnid );
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("mectel select amt   is verified and the transaction id is:"+mectelselamttxnid );

	
}

@Test
public void mecteltopupenteramtverify()
{
	String msg =verifytopup(mectelenteramttxnid );
	softAssert.assertEquals(msg, "Success");
	softAssert.assertAll();
	System.out.println("mectel enter amt   is verified and the transaction id is:"+mectelenteramttxnid );

	
}



public String verifytopup(String txnid)
{
	RestAssured.baseURI="http://3.1.90.118/api/CheckTopupStatus";
	RequestSpecification req = RestAssured.given();
	JSONObject bodyparams =new JSONObject();
    
	System.out.println(txnid);
	bodyparams.put("TransactionId", txnid); 
	req.header("content-type","application/json");
	req.body(bodyparams.toString());
	Response res =req.post();
	System.out.println(res.getStatusCode());
	String message =( res.getBody().jsonPath().get("msg"));
	System.out.println(message);
	return message;

	
}

}
