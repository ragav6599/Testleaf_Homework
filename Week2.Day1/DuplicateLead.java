package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

		//Enter Username
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");

		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click Login
		driver.findElement(By.className("decorativeSubmit")).click();

		//Click CRM
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
		
		//Select state
		WebElement SeleState = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select StateDD = new Select(SeleState);
		StateDD.selectByVisibleText("Missouri");
		
		//Click Create lead
		driver.findElement(By.className("smallSubmit")).click();
		
		//click Duplicate Lead
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//Clear Company name
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		//Clear First Name
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		//Create Lead
		driver.findElement(By.className("smallSubmit")).click();
		
		//Get tittle
		System.out.println("Get Page Tittle : " + driver.getTitle() );


	}

}
