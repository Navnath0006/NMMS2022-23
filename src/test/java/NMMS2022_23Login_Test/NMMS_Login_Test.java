package NMMS2022_23Login_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import NMMS2022_23_LibraryFiles.BaseClass;
import NMMS2022_23_LibraryFiles.UtilityClass;
import NMMS2022_23_LoginModule.NMMS_HomePage;
import NMMS2022_23_LoginModule.NMMS_SchoolLogin;	
/*
 *	@Author Name : nksoftpune@gmail.com
 * 	@Since :2022
 */
public class NMMS_Login_Test extends BaseClass
{
	NMMS_HomePage home;
	NMMS_SchoolLogin sclog;
	
	@BeforeClass
	public void openbrowser() throws IOException
	{
		nmmssetup();
		home = new NMMS_HomePage(driver);
		sclog = new NMMS_SchoolLogin(driver);
	}
	
	@BeforeMethod
	public void beforetest()
	{
		Reporter.log("Any thing required for method goes here", true);
	}
	
	@Test(priority = 1,groups = "button")
	public void veriftybtn1() throws EncryptedDocumentException, IOException
	{	
		
		String actbtn1 = home.getbtntext1();
		String expbtn1 = UtilityClass.getexceldata(1, 0);
		Reporter.log("Actual Button Name : "+actbtn1, true);
		Reporter.log("Expected Button Name : "+expbtn1, true);
		Assert.assertEquals(actbtn1, expbtn1);
	}
	
	@Test(priority = 2,groups = "button")
	public void verifybtn2() throws EncryptedDocumentException, IOException
	{
		String actbtn2 = home.getbtntext2();
		String expbtn2 = UtilityClass.getexceldata(2, 0);
		Reporter.log("Actual Button Name : "+actbtn2, true);
		Reporter.log("Expected Button Name : "+expbtn2, true);
		Assert.assertEquals(actbtn2, expbtn2);
	}
	
	@Test(priority = 3,groups = "button")
	public void verifybtnisenabled1() 
	{
		boolean btn1status = home.btnstatus1();
		Assert.assertTrue(btn1status);
		Reporter.log("Button is enabled : "+btn1status,true);
	}
	
	@Test(priority = 4,groups = "button")
	public void verifybtnisenabled2()
	{
		boolean btn2status = home.btnstatus2();
		Assert.assertTrue(btn2status);
		Reporter.log("Button is enabled : "+btn2status,true);
	}
	
	@Test(priority = 5 , dependsOnMethods = "verifybtnisenabled2")
	public void clickonnmms22_23()
	{
		home.clickonbtn2();
	}
	@Test(priority = 6, dependsOnMethods = "clickonnmms22_23")
	public void verifybtntxtstatus() throws EncryptedDocumentException, IOException
	{
		String actbtntext = sclog.getbtntxt();
		String expbtntext = UtilityClass.getexceldata(3, 0);
		Reporter.log("Actual button text : "+actbtntext, true);
		Reporter.log("Expected button text : "+expbtntext, true);
		Assert.assertEquals(actbtntext, expbtntext);
		
		boolean btnstatus = sclog.getbtnstatus();
		
	}

	@AfterMethod
	public void logoutfromapp()
	{	
		Reporter.log("Logout from App.",true);
	}
	
	@AfterClass
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
}
