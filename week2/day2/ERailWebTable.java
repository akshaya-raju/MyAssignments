package week2.day2;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ERailWebTable {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
				
				//to open the browser'
				ChromeDriver driver=new ChromeDriver();
				//to open URl
						driver.get("https://erail.in/");
						//to maximize the browser screen
						driver.manage().window().maximize();
						
						WebElement fromBox=driver.findElement(By.xpath("//input[@id='txtStationFrom']"));
						fromBox.clear();
						fromBox.sendKeys("MS" , Keys.TAB);
						
						
						WebElement toBox=driver.findElement(By.xpath("//input[@id='txtStationTo']"));
						toBox.clear();
						toBox.sendKeys("PDY" , Keys.TAB);
						
						WebElement checkBox=driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']"));
						checkBox.click();
						
						List<WebElement> tRow = driver.findElements(By.xpath("(//table[3]/tbody/tr"));
						List<WebElement> tCol = driver.findElements(By.xpath("(//table[3]/tbody/tr/td"));
						
						for(int i=1;i<=tRow.size();i++) {
							
							for(int j=1;j<=tCol.size();j++) {
								String text = driver.findElements(By.xpath("(//table[3]/tbody/tr/td")).get(j).getText();
								System.out.println(text + "   ");
							}
							
						}
						System.out.println("");
						
						
						
						
}}
