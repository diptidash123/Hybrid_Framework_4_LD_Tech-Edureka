package Generics_Frame;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Base_Page extends Base_Test
{

		public void drop_down(WebElement element,String text)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
		}
		
		public void drop_down1(WebElement element,int value)
		{
			Select sel=new Select(element);
			sel.selectByIndex(value);
		}
		
		public void drop_down2(WebElement element,String value)
		{
			Select sel=new Select(element);
			sel.selectByValue(value);
		}
		
		public void alertshandle()
		{
			Alert alt=driver.switchTo().alert();
			alt.accept();
			alt.dismiss();
			
		}
	  
}