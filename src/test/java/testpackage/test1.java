package testpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.Assert;

public class test1 {
	WebDriver driver ;
	@Test
	public void f() {
	  
			String baseUrl = "https://www.toolsqa.com/";         
	        System.out.println("Launching Google Chrome browser"); 
	        driver.get(baseUrl);
	        String testTitle = "Tools QA";
	        String originalTitle = driver.getTitle();
	        Assert.assertEquals(originalTitle, testTitle);
  }
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Starting Test On Chrome Browser");
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

	}
	
	@AfterMethod
	public void afterMethod() {
		driver.close();
		System.out.println("Finished Test On Chrome Browser");
	}
}
