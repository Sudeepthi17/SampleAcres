package pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TenantPF {
	WebDriver driver;
	 
	public TenantPF(WebDriver driver) {
		this.driver= driver;
	    PageFactory.initElements( driver, this);
	}
 
	@FindBy(xpath="//span[text()=\"All India\"]")
	WebElement AllIndia;
 
	@FindBy(xpath="//span[text()=\"View top cities\"]")
	WebElement TopCities;
 
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[1]/div[2]/div/div/div[2]/div[2]/ul[1]/a[6]/li")
	WebElement Hyderabad;
 
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/a")
	WebElement Tenants;
 
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[1]/span")
	WebElement RentHome;
 
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[1]/div/ul/li[1]/div/ul/li[3]/a")
	WebElement Independent;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[1]/div/div/div/div[5]/div")
	WebElement PopUp;
 
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div[3]/span[2]")
	WebElement Furnished;
 
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[3]/div[2]/section[1]/div/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/div")
	WebElement Home;
	
	@FindBy(xpath="/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/a")
	WebElement Tenant;
	
	public void AllIndia() throws InterruptedException {
		AllIndia.click();
		Thread.sleep(2000);
	}
	public void TopCities() throws InterruptedException {
		TopCities.click();
		Thread.sleep(2000);
	}
	public void Hyderabad() throws InterruptedException {
		Hyderabad.click();
		Thread.sleep(2000);
	}
	public void Tenants() throws InterruptedException {
		Tenants.click();
		Thread.sleep(2000);
	}
	public void RentHome() throws InterruptedException {
		RentHome.click();
		Thread.sleep(2000);
	}
	public void Independent() throws InterruptedException {
		Independent.click();
		Thread.sleep(2000);
	}
	public void PopUp() throws InterruptedException {
		String parenthandle = driver.getWindowHandle();
		Set<String> handle = driver.getWindowHandles();
				for(String s:handle) {
					if(!s.equals(parenthandle)) {
						driver.switchTo().window(s);
					}
					
				}
		PopUp.click();
		Thread.sleep(2000);
	}
	public void Furnished() throws InterruptedException {
		String parenthandle = driver.getWindowHandle();
		Set<String> handle = driver.getWindowHandles();
				for(String s:handle) {
					driver.switchTo().window(s);
				}
		Furnished.click();
		Thread.sleep(2000);
	}
	public void Home() throws InterruptedException {
		Home.click();
		Thread.sleep(2000);
	}
	public void Tenant() throws InterruptedException {
		Tenant.click();
		Thread.sleep(2000);
	}

}