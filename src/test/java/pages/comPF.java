package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class comPF {
	WebDriver driver;
	 
	public comPF(WebDriver driver) {
		this.driver= driver;
	    PageFactory.initElements( driver, this);
	}
	
	@FindBy(xpath="//span[@data-label='PG/CO-LIVING']/following::li/span[@data-label='COMMERCIAL']")
	WebElement ComOpt;
	
	@FindBy(xpath="//a[@data-label=\"LINK\" and contains(text(),\"Commercial property for rent in Hyderabad\")]")
	WebElement ComHyd;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div[1]/div/div[3]/span[2]")
	WebElement Verify;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[3]/div[2]/section[1]/div/div/div[1]/div[2]/div[1]/div/div[2]/a/h2")
	WebElement SelCom;
	
	@FindBy(xpath="/html/body/div[1]/div/div[4]/section[1]/div/div/div[2]/div[3]/div[1]/span/div[2]/span")
	WebElement ShortList;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[6]/div[2]/div[1]/div/div[5]/div/div/input")
	WebElement Phonenum;
//	
//	@FindBy(xpath="/html/body/div[1]/div/div[4]/section[1]/div/div/div[2]/div[3]/a")
//	WebElement Contact;
	
	public void ComOpt() throws InterruptedException {
		ComOpt.click();
		Thread.sleep(2000);
	}
	
	public void ComHyd() throws InterruptedException {
		ComHyd.click();
		Thread.sleep(2000);
	}
	public void Verify() throws InterruptedException {
		Verify.click();
		Thread.sleep(2000);
	}
	public void SelCom() throws InterruptedException {
		SelCom.click();
		Thread.sleep(2000);
	}
	public void ShortList() throws InterruptedException {
		ShortList.click();
		Thread.sleep(2000);
		
	}
	public void Phonenum() throws InterruptedException {
		Phonenum.sendKeys("8985014994");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-label=\"CLOSE\"]")).click();
		Thread.sleep(1000);		
	}
	
	
	
}
