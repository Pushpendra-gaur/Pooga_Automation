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

		driver.get("https://www.sarkariresult.com/");

		driver.manage().window().maximize();

	}

}
