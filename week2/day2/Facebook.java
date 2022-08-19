package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
				
				//to open the browser'
				ChromeDriver driver=new ChromeDriver();
				//to open URl
						driver.get("https://en-gb.facebook.com/");
						
						driver.manage().window().maximize();
						
						driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
						
						WebElement createNewAccount=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
						createNewAccount.click();
						
						WebElement firstName=driver.findElement(By.name("firstname"));
						firstName.sendKeys("Ak");
						
						WebElement lastName=driver.findElement(By.name("lastname"));
						lastName.sendKeys("Ra");
						
						WebElement phNumber=driver.findElement(By.name("reg_email__"));
						phNumber.sendKeys("7358597171");
						
						WebElement pw=driver.findElement(By.name("reg_passwd__"));
						pw.sendKeys("asdfgh");
						
						WebElement date=driver.findElement(By.id("day"));
						Select dt=new Select(date);
						dt.selectByIndex(6);
						
						WebElement month=driver.findElement(By.id("month"));
						Select mt=new Select(month);
						mt.selectByVisibleText("Mar");
						
						WebElement year=driver.findElement(By.id("year"));
						Select yr=new Select(year);
						yr.selectByIndex(26);
						
						
						WebElement gender=driver.findElement(By.xpath("//input[@name='sex'][1]"));
						gender.click();
						
						
						
						
						
}}
