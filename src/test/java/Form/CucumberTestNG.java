package Form;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucumberTestNG {
	WebDriver driver;
	@Given("user opens chrome and enters url")
	public void user_opens_chrome_and_enters_url() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\CTSS\\OneDrive\\Documents\\Selenium Grid\\chromedriver.exe");
		 driver= new ChromeDriver();
		 driver.get("https://v1.training-support.net/selenium/login-form");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Given("user enters username")
	public void user_enters_username() {
		driver.findElement(By.id("username")).sendKeys("Admin");
	}

	@When("user enters password")
	public void user_enters_password() {
		driver.findElement(By.id("password")).sendKeys("Password");
	    
	}

	@When("click on login")
	public void click_on_login() {
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
	    
	}

	@Then("Welcome back message is displayed")
	public void welcome_back_message_is_displayed() {
	    System.out.println("Welcome message is displayed");
	    driver.close();
	}

}
