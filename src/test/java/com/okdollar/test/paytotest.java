package com.okdollar.test;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.okdollar.base.base;
import com.okdollar.pages.dashboardpage;
import com.okdollar.pages.paytoconfirmationpage;
import com.okdollar.pages.paytoinvoicepage;
import com.okdollar.pages.paytopage;
import com.okdollar.pages.paytoreceiptpage;

import okdollar.payto;

@Test
public class paytotest extends base {
	paytopage paytopage;
	paytoconfirmationpage paytoconfirmationpage;
	paytoreceiptpage paytoreceiptpage;
	paytoinvoicepage paytoinvoicepage;
	dashboardpage dashboardpage; 
    SoftAssert softAssert = new SoftAssert();
	public paytotest() {	
		super();
		
	}
	
	@BeforeTest
	public void setUp() throws MalformedURLException {
      initialization();
   
      paytopage =  new paytopage();
      paytoconfirmationpage = new paytoconfirmationpage();
      paytoreceiptpage = new paytoreceiptpage();
      paytoinvoicepage = new paytoinvoicepage();
      dashboardpage = new dashboardpage();

      
      
      
	}
	public void normalnumber() throws InterruptedException 
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09897241420");
		paytopage.confmobnum.sendKeys("09897241420");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("10");
		paytopage.submitbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		softAssert.assertAll();
		

		
	}
	public void decimalnumber() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09897241420");
		paytopage.confmobnum.sendKeys("09897241420");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("10.11");
		paytopage.submitbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		softAssert.assertAll();

		
	}
	
	public void cashbackmynumber() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09897241420");
		paytopage.confmobnum.sendKeys("09897241420");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("11");
		paytopage.submitbtn.click();
		loginpwd(driver);
		softAssert.assertTrue(paytoconfirmationpage.cashbackmynumberradiobtn.isDisplayed());
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		softAssert.assertTrue(paytoreceiptpage.cashbackval.isDisplayed());
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		softAssert.assertAll();

	}
	
	public void cashbackothernumber() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09897241420");
		paytopage.confmobnum.sendKeys("09897241420");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("12");
		paytopage.submitbtn.click();
		loginpwd(driver);
		softAssert.assertTrue(paytoconfirmationpage.cashbackothernumberradiobtn.isDisplayed());
		paytoconfirmationpage.cashbackothernumberradiobtn.click();
		
		paytoconfirmationpage.cbothermobnum.sendKeys("09774819667");
		paytoconfirmationpage.cbotherconfmobnum.sendKeys("09774819667");
		waitandclick(paytoconfirmationpage.paybtn);
		Thread.sleep(3000);
		softAssert.assertTrue(paytoreceiptpage.cashbackval.isDisplayed());
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		softAssert.assertAll();

	}
	
	public void fuelnumber() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09770618364");
		paytopage.confmobnum.sendKeys("09770618364");
		Thread.sleep(2000);
		softAssert.assertTrue(paytopage.addvehiclefield.isDisplayed());
		paytopage.selectvehicle();
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("10");
		paytopage.submitbtn.click();
		loginpwd(driver);
		waitandclick(paytoconfirmationpage.paybtn);
		Thread.sleep(3000);
		softAssert.assertTrue(paytoreceiptpage.vehiclenumberval.isDisplayed());
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		softAssert.assertAll();

	}
	
	
	public void restaurantnumber() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09959517386");
		paytopage.confmobnum.sendKeys("09959517386");
		Thread.sleep(2000);
		
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("5000");
		softAssert.assertTrue(paytopage.tippopup.isDisplayed());
		paytopage.tipamtfield.sendKeys("100");
		paytopage.tipopupokbtn.click();
		
//		paytopage.submitbtn.click();
		loginpwd(driver);

//		waitandclick(paytoconfirmationpage.paybtn);
//		Thread.sleep(3000);
//		softAssert.assertTrue(paytoreceiptpage.vehiclenumberval.isDisplayed());
//		String receipt =paytoreceiptpage.title.getText();
//		softAssert.assertEquals(receipt, "Receipt");
		softAssert.assertAll();

	}
	
	public void bonuspointnumber() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09774819667");
		paytopage.confmobnum.sendKeys("09774819667");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("10");
		paytopage.submitbtn.click();
		loginpwd(driver);
		
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		softAssert.assertTrue(paytoreceiptpage.bonusval.isDisplayed());
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		softAssert.assertAll();

	}
	
	public void unregnumber() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("0930965966");
		paytopage.confmobnum.sendKeys("0930965966");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("10");
		
		paytopage.submitbtn.click();
		softAssert.assertTrue(paytopage.unregpopup.isDisplayed());
		paytopage.unregpopupokbtn.click();
		
		loginpwd(driver);
		
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		softAssert.assertEquals(paytoreceiptpage.usernameval.getText(), "Unregister User");
		softAssert.assertAll();

	}
	
	public void othercountryregnumfromcontact() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.selfromcontact("Niresh");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("10");
		
		paytopage.submitbtn.click();
	
		loginpwd(driver);
		
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		softAssert.assertAll();

	}
	
	public void merratingfromsuggestion() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.click();
		paytopage.mobnumfield.setValue("09897");

		
		paytopage.suggestion.click();

		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("1000");
		paytopage.submitbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.ratingfield.click();
		paytoconfirmationpage.ratingpopupstar.click();
		paytoconfirmationpage.ratingpopupfeedbackfield.sendKeys("test feedback for merchant");
		paytoconfirmationpage.ratingpopupsubmitbtn.click();
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		softAssert.assertAll();

	}
	
	public void hidemynumberfromfav() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.selfromfav("8972");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("1");
		paytopage.hidemynumcheckbox.click();
		paytopage.submitbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		softAssert.assertEquals(paytoreceiptpage.txntypeval.getText(), "PAYTOID");
		softAssert.assertAll();

	}
	
	public void othercountryunregnum() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.selcountry("India");
		paytopage.mobnumfield.sendKeys("9003947569");
		paytopage.confmobnum.sendKeys("9003947569");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("1");
		paytopage.submitbtn.click();
		paytopage.unregpopupokbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		softAssert.assertAll();

	}
	
	public void twominsvalandmorepayment() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09455569667");
		paytopage.confmobnum.sendKeys("09455569667");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("1");
		paytopage.submitbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		paytoreceiptpage.moreicon.click();
		paytoreceiptpage.morepayment.click();
		paytopage.mobnumfield.sendKeys("09455569667");
		paytopage.confmobnum.sendKeys("09455569667");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("1");
		paytopage.submitbtn.click();
		softAssert.assertTrue(paytopage.twominspopup.isDisplayed());	
		paytopage.twominspopupokbtn.click();
		softAssert.assertAll();

	}
	
	
	public void homeicon() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09897241420");
		paytopage.confmobnum.sendKeys("09897241420");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("15");
		paytopage.submitbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		paytoreceiptpage.homeicon.click();
		
		
		softAssert.assertTrue(dashboardpage.searchbar.isDisplayed());
		softAssert.assertAll();
		
		
	}
	
	
	public void invoiceandinvshare() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09897241420");
		paytopage.confmobnum.sendKeys("09897241420");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("16");
		paytopage.submitbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		paytoreceiptpage.moreicon.click();
		paytoreceiptpage.invoice.click();
		softAssert.assertEquals(paytoinvoicepage.title.getText(), "Transaction Receipt");
		softAssert.assertEquals(paytoinvoicepage.amtpaidval.getText(), "16");
		paytoreceiptpage.share.click();
		softAssert.assertTrue(driver.findElement(By.xpath("//*[@resource-id='android:id/chooser_header']")).isDisplayed());
		driver.navigate().back();
		driver.navigate().back();
		softAssert.assertAll();
		
		
	}
	
	
	public void repeatpayment() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09897241420");
		paytopage.confmobnum.sendKeys("09897241420");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("19");
		paytopage.submitbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		paytoreceiptpage.moreicon.click();
		paytoreceiptpage.repeatpayment.click();
		softAssert.assertEquals(paytopage.mobnumfield.getText(), "09897241420");
		
		softAssert.assertAll();

	}
	
	
	public void receiptshare() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09897241420");
		paytopage.confmobnum.sendKeys("09897241420");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("21");
		paytopage.submitbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		paytoreceiptpage.moreicon.click();
		paytoreceiptpage.share.click();
		softAssert.assertTrue(driver.findElement(By.xpath("//*[@resource-id='android:id/chooser_header']")).isDisplayed());
		driver.navigate().back();
		softAssert.assertAll();
		
	}
	
	public void starrating() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09897241420");
		paytopage.confmobnum.sendKeys("09897241420");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("22");
		paytopage.submitbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		paytoreceiptpage.rating.click();
		paytoreceiptpage.ratingpopupstars.click();
		paytoreceiptpage.ratingpopupfeedbackfield.sendKeys("good feedback");
		paytoreceiptpage.ratingpopupsubmitbtn.click();
		softAssert.assertAll();
		
		
	}
	
	
	public void addtocontact() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09897241420");
		paytopage.confmobnum.sendKeys("09897241420");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("25");
		paytopage.submitbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		paytoreceiptpage.addcontact.click();
		driver.findElement(By.xpath("//*[@text='Cancel']")).click();
		
		softAssert.assertAll();
		
		
	    
	}
	
	public void addtofav() throws InterruptedException
	{
		sethome();
		dashboardpage.paytoicon.click();
		paytopage.mobnumfield.sendKeys("09897241420");
		paytopage.confmobnum.sendKeys("09897241420");
		waitandclick(paytopage.amtfield);
		paytopage.amtfield.sendKeys("25");
		paytopage.submitbtn.click();
		loginpwd(driver);
		paytoconfirmationpage.paybtn.click();
		Thread.sleep(3000);
		String receipt =paytoreceiptpage.title.getText();
		softAssert.assertEquals(receipt, "Receipt");
		paytoreceiptpage.addtofav.click();
		paytoreceiptpage.addtofavpopupnamefield.sendKeys("Manik");
		paytoreceiptpage.addtofavpopupsavebtn.click();

		
		softAssert.assertAll();
	    
	}
//	@DataProvider(name ="mobilenumbers")
//	public  Object[][] testdata()
//	{
//		Object[][] mobnum = new Object[5][1];
//
//		
//		mobnum[0][0]="09971554804";
//		mobnum[1][0]="09897241420";
//		mobnum[2][0]="09692874819";
//		mobnum[3][0]="0930965918";
//		mobnum[4][0]="09774819667";
//		return mobnum;
//	}
	
	
	public void numbervalidation() throws InterruptedException, AWTException
	{
		sethome();
		ArrayList<String> mobnumbers=new ArrayList<String>();
		Actions performAct = new Actions(driver);//Creating arraylist  
		mobnumbers.add("897241420");//Adding object in arraylist  
//		mobnumbers.add("959517386");  
//		mobnumbers.add("774819667");  
//		mobnumbers.add("692874819"); 
		mobnumbers.add("309659");
		mobnumbers.add("692874819"); 
		
	dashboardpage.paytoicon.click();
		Iterator itr=mobnumbers.iterator();  
		while(itr.hasNext()){  
			String mobnum = (String) itr.next();
	paytopage.mobnumfield.click();
	
	performAct.sendKeys(mobnum).build().perform();
	 try{
		 paytopage.confmobnum.isDisplayed();
		
     }
     catch(NoSuchElementException e){
      
        softAssert.fail("The number"+mobnum+"is wrong");
     }
			
			paytopage.mobnumfield.clear();
			
		}  

		softAssert.assertAll();
		
	    
	}
	
	

}
