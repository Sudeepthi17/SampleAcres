package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PgPF {
	WebDriver driver;
	 
	public PgPF(WebDriver driver) {
		this.driver= driver;
	    PageFactory.initElements( driver, this);
	}
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[2]/span")
	WebElement PgOpt;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[2]/div/ul/li/div/ul/li[4]/a")
	WebElement PgHyd;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div/div/div[2]/span[2]")
	WebElement Verified;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div/div/div[3]/span[2]")
	WebElement Furnish;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div/div/div[4]/span[2]")
	WebElement ForGirls;
	
	@FindBy(xpath="//a[@href=\\\"https://www.99acres.com/paying-guest-pg-for-rent-in-anjaiah-nagar-hyderabad-spid-C73620055\\")
	WebElement SelPg;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/section[1]/div/div/div[2]/div[3]/a")
	WebElement ContactOwner;
	
	public void PgOpt() throws InterruptedException {
		PgOpt.click();
		Thread.sleep(2000);
	}
	
	public void PgHyd() throws InterruptedException {
		PgHyd.click();
		Thread.sleep(2000);
	}
	
	public void Verified() throws InterruptedException {
		Verified.click();
		Thread.sleep(2000);
	}
	
	public void Furnish() throws InterruptedException {
		Furnish.click();
		Thread.sleep(2000);
	}
	
	public void ForGirls() throws InterruptedException {
		ForGirls.click();
		Thread.sleep(2000);
	}
	
	public void SelPg() throws InterruptedException {
		SelPg.click();
		Thread.sleep(2000);
	}
	
	public void ContactOwner() throws InterruptedException {
		String parenthandle = driver.getWindowHandle();
		Set<String> handle = driver.getWindowHandles();
				for(String s:handle) {
					driver.switchTo().window(s);
				}
		ContactOwner.click();
		Thread.sleep(2000);
	}
	
	
}
