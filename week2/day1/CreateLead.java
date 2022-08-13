package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		//URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		WebElement elementUsername=driver.findElement(By.id("username"));
		elementUsername.sendKeys("Demosalesmanager");
		
		WebElement elementPassword=driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		
		WebElement elementLoginButton=driver.findElement(By.className("decorativeSubmit"));
		elementLoginButton.click();
		
		WebElement elementWelcomMessage=driver.findElement(By.tagName("h2"));
		String txt=elementWelcomMessage.getText();
		System.out.println(txt);
		
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
		
		WebElement elementLastName=driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("Lname");
		
		WebElement elementFirstnameLocal=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstnameLocal.sendKeys("Fname Local");
		
		WebElement elementDepartment=driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartment.sendKeys("CSI");
		
		WebElement elementDescription=driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Create Leads");
		
		WebElement elementEMail=driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEMail.sendKeys("abcnewuser@testleaf.com");
		
		WebElement elementState=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select obj1=new Select(elementState);
		obj1.selectByIndex(5);
		
		WebElement  elementCreateLeadButton=driver.findElement(By.name("submitButton"));
		elementCreateLeadButton.click();
		
		String title=driver.getTitle();
		System.out.println(title);
	}

}
