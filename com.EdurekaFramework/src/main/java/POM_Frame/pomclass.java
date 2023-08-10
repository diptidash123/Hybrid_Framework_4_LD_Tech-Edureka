package POM_Frame;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generics_Frame.Auto_constant;
import Generics_Frame.Base_Test;
import Generics_Frame.ExternalDataFile;

public class pomclass extends Base_Test implements Auto_constant
{
	    public WebDriver driver;
		
		//declaration
		@FindBy(xpath = "//span[@class=\"login_click login-vd giTrackElementHeader \"]")
		private WebElement loginbutton;
		
		@FindBy(xpath = "(//input[@class=\"control_place popusreml\"])[2]")
		private WebElement emailid;
		
		@FindBy(xpath = "(//input[@class=\"control_place pass_in\"])[1]")
		private WebElement password;
		
		@FindBy(xpath = "//button[@class=\"clik_btn_log btn-block\"]")
		private WebElement loginicon;	
		
		@FindBy(xpath = "//span[@class=\"user_name\"]")
		private WebElement usericon;
		
	    @FindBy(xpath = "//a[.='My Profile']")
	    private WebElement myprofile;
	    
	    @FindBy(xpath = "(//i[@class=\"icon-pr-edit\"])[2]")
	    private WebElement editicon;
	    
	    @FindBy(xpath = "//button[@class=\"No thanks\"]")
	    private WebElement popup;
	    
	    @FindBy(xpath = "//input[@id=\"fullName\"]")
	    private WebElement fullname;
	    
	    @FindBy(xpath = "(//span[@class=\"nsdicon-angle-down\"])[1]")
	    private WebElement dropclick;
	    
	    @FindBy(xpath = "//li[normalize-space()='2-4 years']")
	    private WebElement dropdwonexp;
	    
	    @FindBy(xpath = "(//span[@class=\"nsdicon-angle-down\"])[2]")
	    private WebElement industryarrowdown;
	    
	    @FindBy(xpath ="//li[normalize-space()='Others']")
	    private WebElement industrybutton;
	    
	    @FindBy(xpath = "//input[@id=\"designation\"]")
	    private WebElement designation;
	    
	    @FindBy(xpath = "//span[.='India-IST-Asia/Kolkata ']")
	    private WebElement timezone;
	    
	    @FindBy(xpath = "(//span[@class='nsdicon-angle-down'])[4]")
	    private WebElement weekdayarrowbutton1;
	    
	    @FindBy(xpath = "//li[normalize-space()='08:00 AM']")
		private WebElement weekdaysavailableform;
	    
	    @FindBy(xpath = "(//span[@class='nsdicon-angle-down'])[5]")
	    private WebElement weekdayarrowbutton2;
	    
	    @FindBy(xpath = "//li[normalize-space()='09:00 AM']")
	    private WebElement weekdaysto;
	    
	    @FindBy(xpath = "(//span[@class='nsdicon-angle-down'])[6]")
	    private WebElement weekdayarrowbutton3;
	    
	    @FindBy(xpath = "//li[normalize-space()='08:00 AM']")
		private WebElement weekendsavailableform;
	    
	    @FindBy(xpath = "(//span[@class='nsdicon-angle-down'])[7]")
	    private WebElement weekdayarrowbutton4;
	    
	    @FindBy(xpath = "//li[normalize-space()='09:00 AM']")
	    private WebElement weekendto;
	    
	    @FindBy(xpath = "//button[.='Save and Continue']")
	    private WebElement savbutton;
	    
	    @FindBy(xpath = "(//a[@target='_blank'][normalize-space()='Blog'])[2]")
	    private WebElement blog;
	    
	    @FindBy(xpath = "//button[text()='Sign me up!']")
	    private WebElement singmeup;
	    
	    @FindBy(xpath = "(//a[@class='text-truncate'])[1]")
	    private WebElement home;
	    
	    @FindBy(xpath = "//span[@class='webinar-profile-name']")
	    private WebElement user;
	    	    
	    @FindBy(xpath = "(//a[text()='Log Out'])[1]")
	    private WebElement logoutitem;
	    
		//initialization
		public pomclass(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		
		}
		//utilization
		public void clickingaction()
		{
			loginbutton.click();
		}
		public void logincredentials() throws IOException
		{
			emailid.sendKeys(ExternalDataFile.Datafetching(excelfilepath, excelsheetname, 0, 1));
			password.sendKeys(ExternalDataFile.Datafetching(excelfilepath, excelsheetname, 1, 1));
			loginicon.click();
			try 
		{
				Thread.sleep(5000);
		} 
			catch (InterruptedException e) 
		{
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		}
	    public void userredirection()
		{
				usericon.click();
				myprofile.click();
				editicon.click();
		}
	    public void userinformation() throws IOException, InterruptedException
		{
				popup.click();
				fullname.clear();
				fullname.sendKeys(ExternalDataFile.Datafetching(excelfilepath, excelsheetname, 2, 1));
				Thread.sleep(3000);
				dropclick.click();
				dropdwonexp.click();
				industryarrowdown.click();
				industrybutton.click();
				Thread.sleep(3000);
				designation.clear();
				designation.sendKeys(ExternalDataFile.Datafetching(excelfilepath, excelsheetname, 3, 1));
				Thread.sleep(3000);
				System.out.println(timezone.getText());					
		}	
		public void availability()
		{
				weekdayarrowbutton1.click();
				weekdaysavailableform.click();
				weekdayarrowbutton2.click();
				weekdaysto.click();
				weekdayarrowbutton3.click();
				weekendsavailableform.click();
				weekdayarrowbutton4.click();
				weekendto.click();
				savbutton.click();
		}
		
		public void homepagemenu() throws InterruptedException
		{
			Thread.sleep(5000);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)", "");
			blog.click();			
			Set<String> windows=driver.getWindowHandles();
			Iterator<String> windowsid=windows.iterator();
			String pwindow = windowsid.next();
			System.out.println(pwindow);
			String cwindow=windowsid.next();
			System.out.println(cwindow);
			driver.switchTo().window(cwindow);
			singmeup.click();
			home.click();
			Thread.sleep(10000);
			user.click();
			logoutitem.click();
			Thread.sleep(10000);
					
		}
	
	}