package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandling {
	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.leafground.com/");
		 
		 driver.manage().window().maximize();
		 
		 driver.findElement(By.xpath("//*[text()='Browser']/ancestor::a")).click();
		 driver.findElement(By.xpath("//span[text()='Alert']/ancestor::a")).click();
		 driver.findElement(By.xpath("//span[text()='Show']")).click();
		 Alert alert=driver.switchTo().alert();
		 String text=alert.getText();
		 System.out.println(text);
		 alert.accept();
		 
		 
		 driver.findElement(By.xpath("//h5[text()=' Alert (Confirm Dialog)']/following-sibling::button")).click();
		 Alert conAlert=driver.switchTo().alert();
		 String txt=conAlert.getText();
		 System.out.println(txt);
		 conAlert.accept();
		
		 }


}
