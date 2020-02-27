package com.okdollar.test;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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
	long oordeooselamttxnid ;
	topupothernumberpage topupothernumberpage;
	topupotherselamtpage topupotherselamtpage;
	
    topupotherconfpage topupotherconfpage;
    topupotherreceiptpage topupotherreceiptpage;
    topupotherinvoicepage topupotherinvoicepage;
    dashboardpage dashboardpage;
    
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
      sethome();
      dashboardpage.topupothernumbericon.click();
	}

@Test
public void ooredootopupselamt() throws InterruptedException
{
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
	 

	 oordeooselamttxnid=1515842582;

	
}

@Test
public void ooredootopupenteramt()
{
	

	
}

@Test
public void ooredoodataplan()
{
	

	
}

@Test
public void ooredoospecialoff()
{
	

	
}

@Test
public void mpttopupselamt()
{
	
System.out.println("test");
	
}



@Test
public void mptdataplan()
{
	

	
}

@Test
public void mptspecialoff()
{
	

	
}

@Test
public void telenortopupselamt()
{
	

	
}

@Test
public void telenortopupenteramt()
{
	

	
}

@Test
public void telenordataplan()
{
	

	
}

@Test
public void telenorspecialoff()
{
	

	
}

@Test
public void myteltopupselamt()
{
	

	
}

@Test
public void myteltopupenteramt()
{
	

	
}

@Test
public void myteldataplan()
{
	

	
}

@Test
public void mytelspecialoff()
{
	

	
}

@Test
public void mecteltopupselamt()
{
	

	
}

@Test
public void mecteltopupenteramt()
{
	

	
}

@Test
public void mecteldataplan()
{
	

	
}

@Test
public void mectelspecialoff()
{
	

	
}

@Test
public void ooredootopupselamtverify()
{
	RestAssured.baseURI="http://3.1.90.118/api/CheckTopupStatus";
	
	RequestSpecification req = RestAssured.given();
	
	JSONObject bodyparams =new JSONObject();
	
	bodyparams.put("TransactionId", oordeooselamttxnid); 
	
	
	req.header("content-type","application/json");
	
	req.body(bodyparams.toString());
	
	
	Response res =req.post();
	
	System.out.println(res.getStatusCode());
	String message =( res.getBody().jsonPath().get("msg"));
	System.out.println(message);
	Assert.assertEquals(message, "success");



	
}

@Test
public void ooredootopupenteramtverify()
{
	

	
}

@Test
public void ooredoodataplanverify()
{
	

	
}

@Test
public void ooredoospecialoffverify()
{
	

	
}

@Test
public void mpttopupselamtverify()
{
	

	
}



@Test
public void mptdataplanverify()
{
	

	
}

@Test
public void mptspecialofferverify()
{
	
}


@Test
public void telenortopupselamtverify()
{
	

	
}

@Test
public void telenortopupenteramtverify()
{
	

	
}

@Test
public void telenordataplanverify()
{
	

	
}

@Test
public void telenorspecialoffverify()
{
	

	
}

@Test
public void myteltopupselamtverify()
{
	

	
}

@Test
public void myteltopupenteramtverify()
{
	

	
}

@Test
public void myteldataplanverify()
{
	

	
}

@Test
public void mytelspecialoffverify()
{
	

	
}

@Test
public void mecteltopupselamtverify()
{
	

	
}

@Test
public void mecteltopupenteramtverify()
{
	

	
}

@Test
public void mecteldataplanverify()
{
	

	
}

@Test
public void mectelspecialoffverify()
{
	

	
}


}
