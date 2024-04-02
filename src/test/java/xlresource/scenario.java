package xlresource;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class scenario {
	 @Test(dataProvider = "exceldata")
	  public void scenario(String cities) throws InterruptedException {
		  WebDriver driver;
		  ChromeOptions options= new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		  driver.manage().window().maximize();
	      driver.navigate().to("https://www.99acres.com/Home-Real-Estate.htm");
	      driver.findElement(By.xpath("//*[@id=\"keyword2\"]")).sendKeys(cities);
	      
	  }
	 @Test
	 @DataProvider(name="exceldata")
	 public Object[][] a() {
			 xlSheet obj = new xlSheet("C:\\Users\\KSUDEEPT\\Excel\\AcresExcel.xlsx");
			 int rows = obj.getrowcount(0);
			 System.out.println(rows);
			 Object[][] logindetails = new Object[rows][1];
			 for(int i=0; i<3;i++) {
				 for(int j=0;j<1;j++)
				logindetails[i][j]=obj.getCellData(0, i+1, j);

			 }
			 return logindetails;
	}

}
