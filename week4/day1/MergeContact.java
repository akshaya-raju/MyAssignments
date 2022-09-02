package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementLink = driver.findElement(By.linkText("CRM/SFA"));
		elementLink.click();
		driver.findElement(By.linkText("Contacts")).click();
		// Click on Merge Contacts using Xpath Locator
		driver.findElement(By.linkText("Merge Contacts")).click();
		//Click on Widget of From Contact
       String windowHandle=driver.getWindowHandle();
       driver.switchTo().window(windowHandle);
       driver.findElement(By.xpath("//img[@alt='Lookup'][1]")).click();
       //to swtich focus to new window
       Set<String> newWindow=driver.getWindowHandles();
       List<String> lst=new ArrayList<String>(newWindow);
       driver.switchTo().window(lst.get(1));
       driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext'])[1]")).click();
       driver.switchTo().window(lst.get(0));
       
       driver.findElement(By.xpath("(//img[@alt='Lookup']/parent::a)[2]")).click();
       Set<String> newWindow1 = driver.getWindowHandles();
       List <String> lst2 = new ArrayList<String>(newWindow1);
       driver.switchTo().window(lst2.get(1));
       Thread.sleep(3000);
       driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[@class='linktext'])[2]")).click();
       driver.switchTo().window(lst.get(0));
       driver.findElement(By.xpath("//a[text()='Merge']")).click();
       driver.switchTo().alert().accept();
       
       System.out.println(driver.getTitle());

}
}