import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser_lunch {
	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe\\chromedriver.exe");
		driver= new ChromeDriver();
	}



	@Test
	public void test() {
	
		driver.get("https://www.google.com/");
		assertEquals(driver.getTitle(),"Google");
		driver.quit();
		
	 }
	
	
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}


