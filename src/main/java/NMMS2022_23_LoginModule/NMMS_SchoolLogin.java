package NMMS2022_23_LoginModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NMMS_SchoolLogin 
{
	// (//div[@class='divMenu']/a)[1]    <<=== xpath for school login btn
	
	@FindBy(xpath = "(//div[@class='divMenu']/a)[1]") private WebElement sloginbt;
	
	public NMMS_SchoolLogin(WebDriver driver) 
	{
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}
	
	public String getbtntxt()
	{
		String btntxt = sloginbt.getText();
		return btntxt;
	}
	public boolean getbtnstatus()
	{
		boolean btnstatus = sloginbt.isEnabled();
		return btnstatus;
	}
	public void clickonSchoolLoginBtn()
	{
		sloginbt.click();
	}
	
}
