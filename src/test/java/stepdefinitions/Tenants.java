package stepdefinitions;
 
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.time.Duration;
import java.util.Set;
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
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PgPF;
import pages.TenantPF;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
 
public class Tenants {
	WebDriver driver;

 
@Given("user is logged into the website")
public void user_is_logged_into_the_website() {
    // Write code here that turns the phrase above into concrete actions
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--disable-notification");
	driver = new ChromeDriver(chromeOptions);
	driver.get("https://www.99acres.com/Home-Real-Estate.htm");
	driver.manage().window().maximize();

}
 
@When("the user selects All india option a dropdown is visable")
public void the_user_selects_all_india_option_a_dropdown_is_visable() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    TenantPF tf = new TenantPF(driver);
    tf.AllIndia();
}
 
@Then("the user selects view top cities")
public void the_user_selects_view_top_cities() throws InterruptedException {
   // Write code here that turns the phrase above into concrete actions
	 TenantPF tf = new TenantPF(driver);
	    tf.TopCities();
}
 
@Then("the user selects Hyderabad has option")
public void the_user_selects_hyderabad_has_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 TenantPF tf = new TenantPF(driver);
	    tf.Hyderabad();
}
 
@Then("selects For tenats as option")
public void selects_for_tenats_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 TenantPF tf = new TenantPF(driver);
	    tf.Tenants();
}
 
@Then("the user selects rent a home option")
public void the_user_selects_rent_a_home_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 TenantPF tf = new TenantPF(driver);
	    tf.RentHome();
}
 
@Then("selects independent house as option")
public void selects_independent_house_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 TenantPF tf = new TenantPF(driver);
	    tf.Independent();
}
 
@Then("selects a filter")
public void selects_a_filter() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	//pop-up should also be selected here 
	 TenantPF tf = new TenantPF(driver);
	    tf.Independent();
}
 
@Then("selects the desired property")
public void selects_the_desired_property() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	TenantPF tf = new TenantPF(driver);
	tf.Home();
}
 
@When("the user selects For tenats as option")
public void the_user_selects_for_tenats_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	TenantPF tf = new TenantPF(driver);
	tf.Tenant();
}

@Then("the user selects pg\\/co living option")
public void the_user_selects_pg_co_living_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	PgPF pp = new PgPF(driver);
	pp.PgOpt();
}
 
@Then("the user selects pg in hyderabad as option")
public void the_user_selects_pg_in_hyderabad_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	PgPF pp = new PgPF(driver);
	pp.PgHyd();
}
 
@Then("the user selects multiple filter")
public void the_user_selects_multiple_filter() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	TenantPF tf = new TenantPF(driver);
	tf.PopUp();
	PgPF pp = new PgPF(driver);
	pp.Verified();
	pp.Furnish();
	pp.ForGirls();
}
 
@Then("the user selects the desired pg")
public void the_user_selects_the_desired_pg() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	//Anjaiah Nagar,Hyderabad-Name of pg
	PgPF pp = new PgPF(driver);
	pp.SelPg();
}
 
@Then("the user shotlists the property and contacts the owner")
public void the_user_shotlists_the_property_and_contacts_the_owner() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	PgPF pp = new PgPF(driver);
	pp.ContactOwner();
}
 
@Then("the user selects commercial option")
public void the_user_selects_commercial_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[3]/span")).click();
   Thread.sleep(3000);
}
 
@Then("the user selects commercial property for rent in hyderabad as option")
public void the_user_selects_commercial_property_for_rent_in_hyderabad_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[3]/div/ul/li/div/ul/li[4]/a")).click();
    Thread.sleep(3000);
}
 
@Then("the user selects few filters")
public void the_user_selects_few_filters() throws AWTException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div/div/div[1]/div/div[3]/span[2]")).click();
	Thread.sleep(3000);
}
@Then("the user will shotlist the property and contacts the owner")
public void the_user_will_shotlist_the_property_and_contacts_the_owner() {
    // Write code here that turns the phrase above into concrete actions
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[2]/section[1]/div/div/div[1]/div[2]/div[1]/div/div[2]/a/h2")).click();
	String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
	driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/section[1]/div/div/div[2]/div[3]/div[1]/span/div[2]/span")).click();
	
}
 
@Then("the user selects rent a home as option")
public void the_user_selects_rent_a_home_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[1]/span")).click();
	Thread.sleep(3000);
}
 
@Then("the user selects for rent in Mumbai as option")
public void the_user_selects_for_rent_in_mumbai_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[1]/div/ul/li/div/ul/li[4]/a")).click();
    Thread.sleep(3000);
}
 
@Then("the user selects filters")
public void the_user_selects_filters() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
	driver.findElement(By.xpath("//div[@data-label=\"FRAUD_ALERT_UNDERSTOOD\"]")).click();
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div[4]/span[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div[3]/span[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div[2]/span[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div[5]/div[3]/div[1]/div[3]/div[1]/div/div[1]/span[2]")).click();
}
@Then("the user shotlists the property and contacts owner")
public void the_user_shotlists_the_property_and_contacts_owner() {
    // Write code here that turns the phrase above into concrete actions
	JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
    javascriptExecutor.executeScript("window.scrollTo(0,500)");
}

@When("the user selects the Insights as option")
public void the_user_selects_the_insights_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[4]/span")).click();
    Thread.sleep(3000);
}

@Then("the user will select ratings and review as option")
public void the_user_will_select_ratings_and_review_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div[1]/div[2]/div/ul/li[4]/div[2]/ul/li/div/ul/li[2]/a")).click();
    //Thread.sleep(2000);
    String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
}

@Then("the user will select hyderabad reviews and scroll")
public void the_user_will_select_hyderabad_reviews_and_scroll() throws AWTException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//i[@class=\"iconS_Common_20  icon_greyRightArr \"]")).click();
	//Thread.sleep(2000);
    driver.findElement(By.xpath("//i[@class=\"iconS_rlp_32 icon_ratingReview\"]")).click();
    //Thread.sleep(2000);
    JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
    javascriptExecutor.executeScript("window.scrollTo(0,500)");
    driver.findElement(By.xpath("//a[@href=\"https://www.99acres.com/hyderabad-reviews-and-ratings-wrffid\"]")).click();
    String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
    WebElement head = driver.findElement(By.xpath("//h1[@class='reiPage__largeHeading']"));
    String value = head.getText();
    
    SoftAssert as = new SoftAssert();
    as.assertEquals(value,"Check Locality Reviews of Hyderabad");
    System.out.println(value);
}
 
}

