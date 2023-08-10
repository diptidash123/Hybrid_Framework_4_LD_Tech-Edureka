package Generics_Frame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class Base_Test implements Auto_constant
{
	public WebDriver driver;
	
	@BeforeSuite
	public void TestNgstarted()
	{
		System.out.println("Suite execution is started");
	}
	@BeforeClass
	public void openingbrowser()
	{
		System.out.println("The Execution Is Started");
		System.setProperty(chrome_key, chrome_value);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.navigate().to(staggingURL);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterClass
	public void closingbrowser()
	{
		System.out.println("The Execution Is Closed");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	@AfterSuite
	public void TestNgclosed()
	{
		System.out.println("Suite execution is closed");
	}
}