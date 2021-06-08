package selenium.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class firstTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void start()
	{
		System.setProperty("webdriver.gecko.driver","lib/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
	@Test
	public void firsttest()
	{
		driver.get("https://www.google.com/");
	}
	
	@AfterTest
	public void end()
	{
		driver.close();
	}
	
	

}
