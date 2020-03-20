package HemoDepot.com.BootCamp2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_Page {
	
		WebDriver driver;
	
		@FindBy(xpath = "//*[@title='My Account']")
		WebElement acctn;
		
		@FindBy(xpath = "//*[@id=\'SPSORegister\']/a/span")
		WebElement Regs;
		
		public First_Page(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		public void signinn() {
			acctn.click();
		}
		public void Registr() {
			Regs.click();
		}
	

}
