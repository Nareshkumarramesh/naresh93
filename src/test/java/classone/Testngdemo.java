package classone;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Testngdemo {
	
	static WebDriver driver;
	
	
	@BeforeClass
	public void browserLaunch() {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\classone\\Driver\\chromedriver.exe");
	 driver =new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	
	}
	
	
	@BeforeMethod
	public void sTime() {
	Date d = new Date();
	System.out.println(d);

	}
	
	@Test
	@Parameters({"Email","Pass"})
	public void	 userDetails(String email,String passw) {
		WebElement user = driver.findElement(By.name("email"));
		user.sendKeys(email);
		
		String s =user.getAttribute("value");
		System.out.println(s);
		
		WebElement pass = driver.findElement(By.name("pass"));
		pass.sendKeys(passw);
		
		String p =pass.getAttribute("value");
		System.out.println(p);
		
		WebElement login = driver.findElement(By.name("login"));
		login.click();

	}

@AfterMethod
	public void eTime() {
		Date d = new Date();
		System.out.println(d);


	}
	
	
	
	@AfterClass
	public void close() {
	driver.close();
	}

	
	
		
	}
