package TestNG_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Flight_search {
	
	private WebDriver driver;
	
	
	
  @Test
  public void f () throws InterruptedException {
	  
	  driver.findElement(By.xpath(".//*[@id='primary-header-flight']")).click();
	  driver.findElement(By.xpath(".//*[@id='flight-type-one-way-label-flp']")).click();
	  //Thread.sleep(3000);
	  
  }
  @BeforeMethod
  public void beforeMethod() throws InterruptedException {
	  driver = new FirefoxDriver();
	  driver.get("https://www.expedia.com");
	  driver.manage().window().maximize();
	  //Thread.sleep(3000);h
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
