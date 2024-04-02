package stepdefinitions;
 
import java.awt.AWTException;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.comPF;
import pages.insightPF;
import pages.pgPF;
import pages.rentPF;
import pages.tenantPF;
 
public class tenants {
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
    tenantPF tf = new tenantPF(driver);
    tf.AllIndia();
}
 
@Then("the user selects view top cities")
public void the_user_selects_view_top_cities() throws InterruptedException {
   // Write code here that turns the phrase above into concrete actions
	 tenantPF tf = new tenantPF(driver);
	    tf.TopCities();
}
 
@Then("the user selects Hyderabad has option")
public void the_user_selects_hyderabad_has_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 tenantPF tf = new tenantPF(driver);
	    tf.Hyderabad();
}
 
@Then("selects For tenats as option")
public void selects_for_tenats_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 tenantPF tf = new tenantPF(driver);
	    tf.Tenants();
}
 
@Then("the user selects rent a home option")
public void the_user_selects_rent_a_home_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 tenantPF tf = new tenantPF(driver);
	    tf.RentHome();
}
 
@Then("selects independent house as option")
public void selects_independent_house_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	 tenantPF tf = new tenantPF(driver);
	    tf.Independent();
}
 
@Then("selects a filter")
public void selects_a_filter() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	//pop-up should also be selected here 
	String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
			driver.findElement(By.xpath("//div[@data-label=\"FRAUD_ALERT_UNDERSTOOD\"]")).click();
			tenantPF tf = new tenantPF(driver);
			tf.Furnished();
}
 
@Then("selects the desired property")
public void selects_the_desired_property() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	tenantPF tf = new tenantPF(driver);
	tf.Home();
}
 
@When("the user selects For tenats as option")
public void the_user_selects_for_tenats_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	tenantPF tf = new tenantPF(driver);
	tf.Tenant();
}

@Then("the user selects pg\\/co living option")
public void the_user_selects_pg_co_living_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pgPF pp = new pgPF(driver);
	pp.PgOpt();
}
 
@Then("the user selects pg in hyderabad as option")
public void the_user_selects_pg_in_hyderabad_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	pgPF pp = new pgPF(driver);
	pp.PgHyd();
}
 
@Then("the user selects multiple filter")
public void the_user_selects_multiple_filter() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
			driver.findElement(By.xpath("//div[@data-label=\"FRAUD_ALERT_UNDERSTOOD\"]")).click();
			
	pgPF pp = new pgPF(driver);
	pp.Verified();
	pp.Furnish();
	pp.ForGirls();
}
 
@Then("the user selects the desired pg")
public void the_user_selects_the_desired_pg() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	//Anjaiah Nagar,Hyderabad-Name of pg
	pgPF pp = new pgPF(driver);
	pp.SelPg();
}
 
@Then("the user shotlists the property and contacts the owner")
public void the_user_shotlists_the_property_and_contacts_the_owner() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
	pgPF pp = new pgPF(driver);
	pp.ContactOwner();
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[4]/form/div[1]/div[3]/div[1]/div[1]/input")).sendKeys("K Sudeepthi");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[4]/form/div[1]/div[3]/div[2]/div[1]/div[1]/input")).sendKeys("898501499");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[4]/form/div[1]/div[3]/div[3]/div[1]/input")).sendKeys("kotasudeepthi@gmail.com");
	driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[4]/form/div[1]/div[2]/div/div[2]/label")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@data-label=\"SUBMIT\"]")).click();
	Thread.sleep(2000);
}
 
@Then("the user selects commercial option")
public void the_user_selects_commercial_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
  comPF cp = new comPF(driver);
  cp.ComOpt();
}
 
@Then("the user selects commercial property for rent in hyderabad as option")
public void the_user_selects_commercial_property_for_rent_in_hyderabad_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	comPF cp = new comPF(driver);
	  cp.ComHyd();
}
 
@Then("the user selects few filters")
public void the_user_selects_few_filters() throws AWTException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
			comPF cp = new comPF(driver);
			  cp.Verify();
}
@Then("the user will shotlist the property and contacts the owner")
public void the_user_will_shotlist_the_property_and_contacts_the_owner() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	
	comPF cp = new comPF(driver);
	  cp.SelCom();
	String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
	cp.ShortList();
	cp.Phonenum();
}
 
@Then("the user selects rent a home as option")
public void the_user_selects_rent_a_home_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	rentPF rf = new rentPF(driver);
	rf.RentOpt();
}
 
@Then("the user selects for rent in Mumbai as option")
public void the_user_selects_for_rent_in_mumbai_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	rentPF rf = new rentPF(driver);
	rf.RentHyd();
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
	rentPF rf = new rentPF(driver);
	rf.WithPic();
	rf.Furnis();
	rf.veri();
	rf.Owner();
}
@Then("the user shotlists the property and contacts owner")
public void the_user_shotlists_the_property_and_contacts_owner() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	JavascriptExecutor javascriptExecutor  = (JavascriptExecutor) driver;
    javascriptExecutor.executeScript("window.scrollTo(0,5000)");
    Thread.sleep(3000);
    driver.findElement(By.xpath("//div[@class=\"iconS_Common_24 icon_goToTop bttb__up_arrow\"]")).click();
    
}

@When("the user selects the Insights as option")
public void the_user_selects_the_insights_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
    insightPF ip = new insightPF(driver);
    ip.InOpt();
}

@Then("the user will select ratings and review as option")
public void the_user_will_select_ratings_and_review_as_option() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	insightPF ip = new insightPF(driver);
    ip.rar();
    String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
}

@Then("the user will select hyderabad reviews and scroll")
public void the_user_will_select_hyderabad_reviews_and_scroll() throws AWTException, InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	insightPF ip = new insightPF(driver);
    ip.expand();
    ip.icon();
    JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
    javascriptExecutor.executeScript("window.scrollTo(0,500)");
    Thread.sleep(3000);
    ip.hydReview();
    String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
	Thread.sleep(2000);
    WebElement head = driver.findElement(By.xpath("//p[text()=\"Localities in Hyderabad\"]"));
    String value = head.getText();
    
    SoftAssert as = new SoftAssert();
    as.assertEquals(value,"Localities in Hyderabad");
    System.out.println(value);
}
@Then("the user clicks on contact Owner")
public void the_user_clicks_on_contact_owner() throws InterruptedException {
    // Write code here that turns the phrase above into concrete actions
	String parenthandle = driver.getWindowHandle();
	Set<String> handle = driver.getWindowHandles();
			for(String s:handle) {
				driver.switchTo().window(s);
			}
	driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/section[1]/div/div/div[2]/div[3]/a")).click();
	//radio button
   //driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[4]/form/div[1]/div[2]/div/div[2]/label/span")).click();
		   
}

@Then("enters the name {string}")
public void enters_the_name(String name) {
    // Write code here that turns the phrase above into concrete actions
	//driver.findElement(By.xpath("(//input[@name='name'])[2]")).sendKeys("Sudeepthi");
//   pgPF pp = new pgPF(driver);
//   pp.Name(name);
	
	driver.findElement(By.xpath("//input[@name='name'])[2]")).sendKeys(name);
	
}

@Then("enters the phonenumber {string}")
public void enters_the_phonenumber(String phone) {
    // Write code here that turns the phrase above into concrete actions
//	pgPF pp = new pgPF(driver);
//	pp.Phonenum(phone);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[4]/form/div[1]/div[3]/div[2]/div[1]/div[1]/input")).sendKeys(phone);
	
}

@Then("enters the email {string}")
public void enters_the_email(String email) {
    // Write code here that turns the phrase above into concrete actions
//	pgPF pp = new pgPF(driver);
//	pp.Email(email);
	
	driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[1]/div[4]/form/div[1]/div[3]/div[3]/div[1]/input")).sendKeys(email);
	
}



 
}

