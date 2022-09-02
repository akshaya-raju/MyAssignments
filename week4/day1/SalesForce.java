package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
//		Launch the browser
		ChromeDriver driver=new ChromeDriver();
//		Load the url as https://login.salesforce.com/
		driver.get("https://login.salesforce.com/");
		//Maximize the browser
		driver.manage().window().maximize();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		Enter the username as ramkumar.ramaiah@testleaf.com
		driver.findElement(By.id("username")).sendKeys("ramkumar.ramaiah@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Password#123");
//		click on the login button
		driver.findElement(By.id("Login")).click();
		//Mobile publisher windows handling
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);		
//		click on the learn more option in the Mobile publisher
		driver.findElement(By.xpath("//button[@title='Learn More']")).click();
		String title = driver.getTitle();
		System.out.println(title);
//		Switch to the next window using Windowhandles.
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> l=new ArrayList<String>(windowHandles);
		driver.switchTo().window(l.get(1));
//		click on the confirm button in the redirecting page
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
//		Get the title
		String newWidowTitle = driver.getTitle();
		System.out.println("New Window Title is :" +newWidowTitle);
//		Get back to the parent window
		driver.switchTo().window(l.get(0));
//		close the browser
		driver.close();

	}

}
