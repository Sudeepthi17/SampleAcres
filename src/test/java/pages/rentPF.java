package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class rentPF {
	WebDriver driver;
	 
	public rentPF(WebDriver driver) {
		this.driver= driver;
	    PageFactory.initElements( driver, this);
	}
	@FindBy(xpath="//span[@data-label=\"RENT A HOME\"]")
	WebElement RentOpt;
	
	@FindBy(xpath="//a[@data-label=\"LINK\" and contains(text(),\"Property for rent in Hyderabad\")]")
	WebElement RentHyd;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div[4]/span[2]")
	WebElement WithPic;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div[3]/span[2]")
	WebElement Furnis;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div[2]/span[2]")
	WebElement veri;
	
	@FindBy(xpath="/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div[1]/span[2]")
	WebElement Owner;
	
	public void RentOpt() throws InterruptedException {
		RentOpt.click();
		Thread.sleep(2000);
	}
	
	public void RentHyd() throws InterruptedException {
		RentHyd.click();
		Thread.sleep(2000);
	}
	public void WithPic() throws InterruptedException {
		WithPic.click();
		Thread.sleep(2000);
	}
	public void Furnis() throws InterruptedException {
		Furnis.click();
		Thread.sleep(2000);
	}
	public void veri() throws InterruptedException {
		veri.click();
		Thread.sleep(2000);
	}
	public void Owner() throws InterruptedException {
		Owner.click();
		Thread.sleep(2000);
	}
	
	
	
}
