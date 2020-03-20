package HemoDepot.com.BootCamp2020;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;

public class TestNG extends Browers {
	
  @Test(priority=1)
  public void f() throws Exception {
	  First_Page obj1=new First_Page(driver);
	  obj1.signinn();
	  
	  Thread.sleep(6000);
	//  driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
	  
	  obj1.Registr();
	  
  }
 @Test(priority=2)
 public void g () {
	 Second_Page obj2=new Second_Page(driver);
	 obj2.emil();	 
	 obj2.psdwd();
	 obj2.zpcod();
	 obj2.phne();
	 obj2.crteacc();
 }
  
  
	  
	  
	  
	  
  
 
  

}