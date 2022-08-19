package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {
	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		//to open the browser'
		ChromeDriver driver=new ChromeDriver();
		//to open URl
				driver.get("http://leaftaps.com/opentaps");
				
		
		
		WebElement elementUsername=driver.findElement(By.xpath("//input[@id='username']"));
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword=driver.findElement(By.xpath("//input[@id='password']"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLogin=driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		elementLogin.click();
		
		WebElement elementCRMSFALink=driver.findElement(By.xpath("//a[contains(text(),'RM/SFA')]"));
		elementCRMSFALink.click();
		
		WebElement elementLeads=driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		elementLeads.click();
		
		WebElement elementCreateLead=driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]"));
		elementCreateLead.click();
		
		WebElement elementCompanyName=driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']"));
		elementCompanyName.sendKeys("TCS");
		
		WebElement elementFirstName=driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']"));
		elementFirstName.sendKeys("Fname");
		
		WebElement elementLastName=driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']"));
		elementLastName.sendKeys("Lname");
		
		WebElement  elementCreateLeadButton=driver.findElement(By.xpath("//input[@class='smallSubmit']"));
		elementCreateLeadButton.click();
		
	}

}
