package Test_Runner_Frame;

import java.io.IOException;

import org.testng.annotations.Test;

import Generics_Frame.Base_Test;
import POM_Frame.pomclass;

public class Testclass extends Base_Test{
  @Test
  public void execution() throws IOException, InterruptedException 
  {
	  pomclass p=new pomclass(driver);
	  p.clickingaction();
	  p.logincredentials();
	  p.userredirection();
	  p.userinformation();
	  p.availability();
	  p.homepagemenu();
	 
  }
}