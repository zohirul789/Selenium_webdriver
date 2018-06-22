package CrossBrowser_lunch;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CrossBrowser_test {
	
	WebDriver driver ;
	
	public void open(){
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		assertEquals(driver.getTitle(),"Google");
		driver.quit();
		
	}

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe\\chromedriver.exe");
		System.setProperty("webdriver.ie.driver", "C:\\users\\la\\downloads\\newmusic\\iedriverserver_x64.exe\\iedriverserver.exe");
		
	}

	

	@Test
	public void test() {
		for(int i = 0; i<3;i++) 
		{
			if (i==0) 
			{
				driver = new FirefoxDriver();
				open();
			}
			else if (i==1)
			{
				driver= new ChromeDriver();
				open();
				
			}
			else
				
			{
				driver = new InternetExplorerDriver();
			}
		}
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
