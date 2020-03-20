package HemoDepot.com.BootCamp2020;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Second_Page {
	
	WebDriver driver;
	
	@FindBy(xpath = "//*[@type='text'][1]")
	WebElement eml;
	
	@FindBy(xpath = "//*[@id='password-input-field']")
	WebElement pasdd;
	
	@FindBy(id ="zipCode")
	WebElement zpcd;
	
	@FindBy(id="phone")
	WebElement numbr;
	
	@FindBy(xpath = "//*[contains(@class,'bttn')]")
	WebElement create;
	
	public Second_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void emil() {
		eml.sendKeys("kafle678@gmail.com");
		
	}
	public void psdwd() {
		pasdd.sendKeys("Mohan@123478");
		
	}
	public void zpcod() {
		zpcd.sendKeys("21043");
	}
	public void phne() {
		numbr.sendKeys("4439841784");
	}
	public void crteacc() {
		create.click();
	}

}
