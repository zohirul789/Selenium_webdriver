import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserSingonSingoff {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.newtours.demoaut.com/");
		//enter valid user name
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("zohirul789");
		//enter valid password
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("05071988");
		//click on sing on
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
		//click on sing off
		driver.findElement(By.xpath("//a[contains(text(),'SIGN-OFF')]")).click();
		driver.quit();
	
	}

}
