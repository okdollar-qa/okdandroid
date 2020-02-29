package com.okdollar.test;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.okdollar.base.base;
import com.okdollar.pages.paytopage;
import com.okdollar.pages.topupotherselamtpage;

public class paytotest extends base {
	paytopage pp;
	
	public paytotest() {	
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws MalformedURLException {
      initialization();
   
  pp =  new paytopage();
	}
	@Test
	public void payto() throws InterruptedException
	{
		

		
	}
	
	@AfterMethod
	public void teardown()
	{
		System.out.println("test");
		
		
	}

}
