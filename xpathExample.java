package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		
		
		//WebElement loginbt=driver.findElement(By.xpath("//html/body/div/div/div/div[3]/header/div/a"));
		
		WebElement loginbt=driver.findElement(By.xpath("//a[@title='Log in']"));
		
		loginbt.click();
		
		
		driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
		
		WebElement email = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[2]/input"));
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
	    WebElement signup = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/input"));
		
	    
	    
	    email.sendKeys("creatorshashikiran@gmail.com");
	    pass.sendKeys("Reset@123");
		signup.click();
		
		
		//loginbt.sendKeys("kiranm");
		
		
		
		//driver.close();
		

	}

}
