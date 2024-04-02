package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pgPF {
	WebDriver driver;
	 
	public pgPF(WebDriver driver) {
		this.driver= driver;
	    PageFactory.initElements( driver, this);
	}
	@FindBy(xpath="//span[@data-label=\"PG/CO-LIVING\" and contains(text(),\"PG/CO-LIVING\")]")
	WebElement PgOpt;
	
	@FindBy(xpath="//a[@href=\"https://www.99acres.com/pg-in-hyderabad-ffid\" and contains(text(),\"PG in Hyderabad\")]")
	WebElement PgHyd;
	
	@FindBy(xpath="//span[text()=\"Verified\"]")
	WebElement Verified;
	
	@FindBy(xpath="//div[@datalabel=\"FURNISHED_NUDGE\"]")
	WebElement Furnish;
	
	@FindBy(xpath="//div[@datalabel=\"GIRLS\"]")
	WebElement ForGirls;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[3]/div[2]/section[1]/div/div/div[1]/div[2]/div[1]/div/div[2]/a/h2/span")
	WebElement SelPg;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/section[1]/div/div/div[2]/div[3]/a")
	WebElement ContactOwner;
	
//	@FindBy(xpath="//div[contains(@class,'component__segment')]//div[contains(@class,'undefined')]//div//input[@name='name']")
//	WebElement Name;
//	
//	@FindBy(xpath="/html/body/div[1]/div/div[4]/div[1]/div[4]/form/div[1]/div[3]/div[2]/div[1]/div[1]/input")
//	WebElement Phonenum;
//	
//	@FindBy(xpath="/html/body/div[1]/div/div[4]/div[1]/div[4]/form/div[1]/div[3]/div[3]/div[1]/input")
//	WebElement Email;
	
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
		ContactOwner.click();
		Thread.sleep(2000);
	}
//	
//	public void Name(String name) {
//		Name.sendKeys(name);
//	}
//	
//	public void Phonenum(String phone) {
//		Phonenum.sendKeys(phone);
//	}
//	
//	public void Email(String email) {
//		Email.sendKeys(email);
//	}
	
	
}
