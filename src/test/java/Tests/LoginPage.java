package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPage {
	WebDriver driver;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Nikhil\\Desktop\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.saucedemo.com/");		
	    
	}

	@Then("user enters {string} , {string} and click on login button")
	public void user_enters_and_click_on_login_button(String userid, String password) throws InterruptedException {
	    
		
		driver.findElement(By.id("user-name")).sendKeys(userid);
		
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(1000);
	    
		
		driver.findElement(By.id("login-button")).click();
		
	}




}
