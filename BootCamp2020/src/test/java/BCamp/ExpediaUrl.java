package BCamp;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class ExpediaUrl {
	WebDriver driver;

	@Test
	public void f() throws InterruptedException {
		WebElement alertt = driver.findElement(By.id("travel-advisory-close-button"));
		alertt.click();

		WebElement flght = driver.findElement(By.id("tab-flight-tab-hp"));
		flght.click();

		WebElement roundtrp = driver.findElement(By.id("flight-type-roundtrip-label-hp-flight"));
		roundtrp.click();

		WebElement cler = driver.findElement(By.xpath("//*[@aria-autocomplete='list'][1]"));
		cler.clear();
		cler.sendKeys("bwi");
		Thread.sleep(6000);
		cler.sendKeys(Keys.ARROW_DOWN);
		cler.sendKeys(Keys.ENTER);

		WebElement elemt = driver.findElement(By.id("flight-destination-hp-flight"));
		elemt.clear();
		elemt.sendKeys("ny");
		Thread.sleep(6000);
		elemt.sendKeys(Keys.ARROW_DOWN);
		elemt.sendKeys(Keys.ENTER);

		WebElement dept = driver.findElement(By.id("flight-departing-hp-flight"));
		dept.clear();
		dept.click();
		
		String month= "May 2020";
		String expDate= "25";
		
		while(true) {
			String txt=driver.findElement(By.xpath("//caption")).getText();
		if(txt.equals(month)) {
			break;
		}
		else { driver.findElement(By.xpath("//*[@id='flight-departing-wrapper-hp-flight']/div/div[2]/button[2]")).click();
			
		}
		
		List<WebElement> allDates=driver.findElements(By.xpath("//*[@id='flight-departing-wrapper-hp-flight']/div/div[2]"));
		for(WebElement ele:allDates) {
		String actualDate=ele.getText();
		String date[]=actualDate.split("\n");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		if(date[1].equals(expDate)) {
			ele.click();
			break;
		}
		else {
			System.out.println("Nothing selected");
		}
		
		
		
		}
	
		
		
		
		
		}
		
		
		
	
		
		
		
		

	}

	@BeforeClass
	public void beforeClass() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kafle\\Desktop\\PNT\\BootCamp2020\\Webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.expedia.com/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public void afterClass() {
	}

}
