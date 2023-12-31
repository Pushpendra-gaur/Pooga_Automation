package Automation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pushpendra {
	
	public ChromeDriver driver;
	
	String path = "C:\\Users\\DELL\\eclipse-workspace\\Pooja_Automation\\Floder\\chromedriver.exe";

	@Test
	public void Broswer() {

		System.setProperty("webdriver.chrome.driver", path);
		
	    driver = new ChromeDriver();

		driver.get("https://www.testingbaba.com/old/");

		driver.manage().window().maximize();
		
		System.out.println("pushpendra");
		
		System.out.println("Ankit");

	}

 
	
	
}
