package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//to open the browser'
		ChromeDriver driver=new ChromeDriver();
		
		
		//to open URl
		driver.get("http://leaftaps.com/opentaps");
		
		
		//to maximize the browser screen
		driver.manage().window().maximize();
		
		
		//to close the browser window
		driver.close();
		
	}

}
