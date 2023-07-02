package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		//Enter Username
		
		WebElement elementFind = driver.findElement(By.id("username"));
		elementFind.sendKeys("demoSalesManager");
		
		//Enter Password
		WebElement elementFinds = driver.findElement(By.id("password"));
		elementFinds.sendKeys("crmsfa");
		
		//Click Button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click link 
		driver.findElement(By.partialLinkText("CRM")).click();
		
		//Click Lead
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		
		//Enter first name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ragavan");
		
		//Enter Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		
		//Enter Dept 
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
		
		
		//Enter Desc
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Hai, Ragavan");
		
		//Enter E-mail
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vragavan1005@gmail.com");
		
		//select state using DD
		
		WebElement SelState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select State = new Select(SelState);
		State.selectByVisibleText("Missouri");
		
//		//Select DD using index 
//		WebElement DDValue = driver.findElement(By.id("createLeadForm_dataSourceId"));
//		Select Sel = new Select(DDValue);
//		Sel.selectByIndex(4);
//		
//		//Select DD using visible text
//		WebElement MarkDD = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
//		Select Mark = new Select(MarkDD);
//		Mark.selectByVisibleText("Automobile");
//		
//		//Select DD using value
//		WebElement OwnerDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
//		Select Own = new Select(OwnerDD);
//		Own.selectByValue("OWN_CCORP");
		
		//Click Create 
		driver.findElement(By.className("smallSubmit")).click();
		
		//Get tittle
		System.out.println("Page Tittle is : "+ driver.getTitle());
		
		
		
	}

}
