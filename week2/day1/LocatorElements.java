package week2.day1;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class LocatorElements {
		public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			
			//to open the browser'
			ChromeDriver driver=new ChromeDriver();
			
			
			//to open URl
			driver.get("http://leaftaps.com/opentaps");
			
			
			//to maximize the browser screen
			driver.manage().window().maximize();
			
			WebElement elementUsername=driver.findElement(By.id("username"));
			elementUsername.sendKeys("Demosalesmanager");
			
			WebElement elementPassword=driver.findElement(By.name("PASSWORD"));
			elementPassword.sendKeys("crmsfa");
			
			WebElement elementLogin=driver.findElement(By.className("decorativeSubmit"));
			elementLogin.click();
			
			WebElement elementWelcomeMessage=driver.findElement(By.tagName("h2"));
			
			String text=elementWelcomeMessage.getText();
			System.out.println(text);
			
			WebElement elementCRMSFALink=driver.findElement(By.linkText("CRM/SFA"));
			elementCRMSFALink.click();
			
			WebElement elementLeads=driver.findElement(By.linkText("Leads"));
			elementLeads.click();
			
			WebElement elementCreateLead=driver.findElement(By.linkText("Create Lead"));
			elementCreateLead.click();
			
			WebElement elementCompanyName=driver.findElement(By.id("createLeadForm_companyName"));
			elementCompanyName.sendKeys("TCS");
			
			WebElement elementFirstName=driver.findElement(By.id("createLeadForm_firstName"));
			elementFirstName.sendKeys("Fname");
			
			WebElement elementLastName=driver.findElement(By.id("createLeadForm_firstName"));
			elementLastName.sendKeys("Lname");
			
			WebElement sourceDD=driver.findElement(By.id("createLeadForm_dataSourceId"));
			sourceDD.sendKeys("Conference");
			
			WebElement industryDD=driver.findElement(By.id("createLeadForm_industryEnumId"));
			Select obj=new Select(industryDD);
			obj.selectByIndex(3);
			
			WebElement marketingDD=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select obj2=new Select(marketingDD);
			obj2.selectByVisibleText("Automobile");
			
			WebElement ownershipDD=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select obj3=new Select(ownershipDD);
			obj3.selectByVisibleText("Partnership");
			
			WebElement  elementCreateLeadButton=driver.findElement(By.name("submitButton"));
			elementCreateLeadButton.click();
			
			
			
			
			
		}

	}


	
