package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		//to open the browser'
		ChromeDriver driver=new ChromeDriver();
		
		
		//to open URl
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		
		//to maximize the browser screen
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//to get into frame
		WebElement frameName=driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frameName);
		
		WebElement tryIt=driver.findElement(By.xpath("//button[text()='Try it']"));
		tryIt.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.switchTo().defaultContent();
		
		WebElement txt=driver.findElement(By.id("demo"));
		String txtDisplay=txt.getText();
		System.out.println(txtDisplay);

}}
