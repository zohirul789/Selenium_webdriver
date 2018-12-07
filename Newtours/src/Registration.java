import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Registration {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver.exe\\chromedriver.exe");
		WebDriver Driver= new ChromeDriver();
		Thread.sleep(3000);
		
		Driver.get("http://www.newtours.demoaut.com/");
		Driver.manage().window().maximize();
		Driver.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
		//First name 
		Driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("zohirul");
		//last name
		Driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("alom");
		//phone
		Driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("7189155916");
		//Email
		Driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("zohirul789@yahoo.com");
		//Address
		Driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("9720 78th st");
		//City
		Driver.findElement(By.xpath("//input[@name='city']")).sendKeys("ozone park");
		//State
		Driver.findElement(By.xpath("//input[@name='state']")).sendKeys("NY");
		//postal
		Driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("11416");
		//country
		//Driver.findElement(By.xpath("//select[@name='country']")).clear();
		Driver.findElement(By.xpath("//select[@name='country']")).sendKeys("UNITED STATES");
		//User name
		Driver.findElement(By.xpath("//input[@id='email']")).sendKeys("zohirul789");
		//password
		Driver.findElement(By.xpath("//input[@name='password']")).sendKeys("05071988");
		//Confirm password
		Driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("05071988");
		//Submit
		Driver.findElement(By.xpath("//input[@name='register']")).click();
		Driver.quit();
		
		
		

	}

}
