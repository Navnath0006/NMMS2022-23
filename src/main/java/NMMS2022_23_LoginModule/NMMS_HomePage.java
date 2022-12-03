package NMMS2022_23_LoginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NMMS_HomePage 
{
	@FindBy(xpath = "(//a)[4]") private WebElement btn1;
	@FindBy(xpath = "(//a)[5]") private WebElement btn2;
	
	public NMMS_HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	public String getbtntext1() 
	{
		String btntext = btn1.getText();
		return btntext;
	}
	public String getbtntext2()
	{
		String btntext = btn2.getText();
		return btntext;
	}
	public boolean btnstatus1() 
	{
		boolean btstatus = btn1.isEnabled();
		return btstatus;
	}
	public boolean btnstatus2()
	{
	 	boolean btnstatus = btn2.isEnabled();
	 	return btnstatus;
	}
	public void clickonbtn2()
	{
		btn2.click();
	}
	
}
