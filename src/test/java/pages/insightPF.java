package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class insightPF {
	WebDriver driver;
	 
	public insightPF(WebDriver driver) {
		this.driver= driver;
	    PageFactory.initElements( driver, this);
	}
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[4]/span")
	WebElement InOpt;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[4]/div[2]/ul/li/div/ul/li[2]/a")
	WebElement rar;
	
	@FindBy(xpath="//div[@title=\"Expand\"]")
	WebElement expand ;
	
	@FindBy(xpath="//div[@data-label=\"LOCALITY_INSIGHTS\"]")
	WebElement icon;
	
	@FindBy(xpath="//a[@rel=\"noreferrer\" and contains(text(),\"Localities in Hyderabad\")]")
	WebElement hydReview;
	
	public void InOpt() throws InterruptedException {
		InOpt.click();
		Thread.sleep(2000);
	}
	public void rar() throws InterruptedException {
		rar.click();
		Thread.sleep(2000);
	}
	public void expand() throws InterruptedException {
		expand.click();
		Thread.sleep(2000);
	}
	public void icon() throws InterruptedException {
		icon.click();
		Thread.sleep(2000);
	}
	public void hydReview() throws InterruptedException {
		hydReview.click();
		Thread.sleep(2000);
	}
	

}
