package TestNG_Test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestNG_ChromeBO {
	private WebDriver driver;
	
	
  @Test
  public void f() {
	  //driver.get("https://www.google.com/");
	  driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("udemy");
	  driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@value='Google Search']")).click();
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  //Thread.sleep(3000);
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
