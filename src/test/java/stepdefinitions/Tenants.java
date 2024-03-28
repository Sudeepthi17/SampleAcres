package stepdefinitions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;

public class Tenants {
	WebDriver driver;
	

@Given("user is logged into the website")
public void user_is_logged_into_the_website() {
    // Write code here that turns the phrase above into concrete actions
	EdgeOptions chromeOptions = new EdgeOptions();
	chromeOptions.addArguments("--disable-notification");
	driver = new EdgeDriver(chromeOptions);
	driver.get("https://www.99acres.com/Home-Real-Estate.htm");
	driver.manage().window().maximize();
	
    
}

@When("the user selects All india option a dropdown is visable")
public void the_user_selects_all_india_option_a_dropdown_is_visable() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//span[text()=\"All India\"]")).click();
}

@Then("the user selects view top cities")
public void the_user_selects_view_top_cities() {
   // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//span[text()=\"View top cities\"]")).click();
}

@Then("the user selects Hyderabad has option")
public void the_user_selects_hyderabad_has_option() {
    // Write code here that turns the phrase above into concrete actions
	WebElement x = driver.findElement(By.xpath("//a[@href=\"https://www.99acres.com/Hyderabad-Real-Estate.htm\"]"));
	String thisLink = x.getAttribute("href");
	driver.get(thisLink);
}

@Then("selects For tenats as option")
public void selects_for_tenats_as_option() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/a")).click();
}

@Then("the user selects rent a home option")
public void the_user_selects_rent_a_home_option() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[1]/span")).click();
}

@Then("selects independent house as option")
public void selects_independent_house_as_option() {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[1]/div/ul/li[1]/div/ul/li[3]/a")).click();
}

@Then("selects a filter")
public void selects_a_filter() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	//Thread.sleep(10);
	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS)
	driver.findElement(By.xpath("//div[@data-label='FRAUD_ALERT_UNDERSTOOD']")).click();
    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div[3]")).click();
}

@Then("selects the desired property")
public void selects_the_desired_property() {
    // Write code here that turns the phrase above into concrete actions
    //driver.findElement(By.xpath("//*[@id=\"L74350593\"]/div/div[1]/div[2]/div[1]/div/div[1]/div[1]/div")).click();
}

@When("the user selects For tenats as option")
public void the_user_selects_for_tenats_as_option() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/a")).click();
}

@Then("the user selects pg\\/co living option")
public void the_user_selects_pg_co_living_option() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[2]/span")).click();
}

@Then("the user selects pg in hyderabad as option")
public void the_user_selects_pg_in_hyderabad_as_option() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[2]/div/ul/li/div/ul/li[4]/a")).click();
}

@Then("the user selects multiple filter")
public void the_user_selects_multiple_filter() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	//Thread.sleep(10);
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div/div/div[2]/span[2]")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div/div/div[3]/span[2]")).click();
    driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div/div/div[4]/span[2]")).click();
}

@Then("the user selects the desired pg")
public void the_user_selects_the_desired_pg() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("the user shotlists the property and contacts the owner")
public void the_user_shotlists_the_property_and_contacts_the_owner() {
    // Write code here that turns the phrase above into concrete actions
    
}

@Then("the user selects commercial option")
public void the_user_selects_commercial_option() {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[3]/span")).click();
}

@Then("the user selects commercial property for rent in hyderabad as option")
public void the_user_selects_commercial_property_for_rent_in_hyderabad_as_option() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[3]/div/ul/li/div/ul/li[4]/a")).click();
}

@Then("the user selects few filters")
public void the_user_selects_few_filters() throws AWTException {
    // Write code here that turns the phrase above into concrete actions
	
}
@Then("the user will shotlist the property and contacts the owner")
public void the_user_will_shotlist_the_property_and_contacts_the_owner() {
    // Write code here that turns the phrase above into concrete actions
   // driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[2]/section[1]/div/div/div[1]/div[2]/div[1]/div/div[2]/a/h2/span")).click();
}

@Then("the user selects rent a home as option")
public void the_user_selects_rent_a_home_as_option() {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[1]/span")).click();
}

@Then("the user selects for rent in Mumbai as option")
public void the_user_selects_for_rent_in_mumbai_as_option() {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[1]/div/ul/li/div/ul/li[4]/a")).click();
}

@Then("the user selects filters")
public void the_user_selects_filters() {
    // Write code here that turns the phrase above into concrete actions
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath("//div[@data-label='FRAUD_ALERT_UNDERSTOOD']")).click();
    
}
@Then("the user shotlists the property and contacts owner")
public void the_user_shotlists_the_property_and_contacts_owner() {
    // Write code here that turns the phrase above into concrete actions
    
}

}

