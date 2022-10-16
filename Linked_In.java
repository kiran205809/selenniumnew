package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linked_In {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		WebElement username = driver.findElement(By.name("session_key"));
		username.sendKeys("creatorshashikiran@gmail.com");
		
		WebElement password = driver.findElement(By.id("session_password"));
		password.sendKeys("Reset@123");
		
		//WebElement forgotlink =  driver.findElement(By.linkText("Forgot password?"));
		//forgotlink.click();
		
	WebElement signin = driver.findElement(By.className("sign-in-form__submit-button"));
	
	
		
		signin.click();
		
		

	}

}
