package NMMS2022_23_LibraryFiles;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import static java.time.Duration.ofSeconds;


public class BaseClass
{
	public WebDriver driver;
	public void nmmssetup() throws IOException
	{
		driver = new ChromeDriver();
		driver.get(UtilityClass.getschooldetails("url"));
		//driver.manage().timeouts().implicitlyWait(ofSeconds(10));
		driver.manage().window().maximize();
		System.out.println("Browser Open Succesfully");
		
	}

}
