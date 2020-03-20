package HemoDepot.com.BootCamp2020;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.mysql.cj.jdbc.Driver;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Browers {
	
	WebDriver driver;
	
  @Test
  public void f() throws Exception {
  }
  
  @BeforeClass
  @Parameters({"url","browser"})
  public void beforeClass( String webste,String brws) {
	  
	  if(brws.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kafle\\Desktop\\PNT\\BootCamp2020\\Webdriver\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.homedepot.com/");
	  driver.manage().window().maximize();
	  }
	  
	  else if(brws.equalsIgnoreCase("firefox")) {
		  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\kafle\\Desktop\\PNT\\BootCamp2020\\Webdriver\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.homedepot.com/");
	  driver.manage().window().maximize();
	  }
	  
	  else {
		  System.out.println("please check the error");
	  }
	  }
	  

  @AfterClass
  public void afterClass() {
	  driver.close();
	  
  }

}
