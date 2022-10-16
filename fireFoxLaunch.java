package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fireFoxLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C://Users//kirananx//Downloads//geckodriver-v0.32.0-win-aarch64//geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.simplilearn.com/");

	}

}
