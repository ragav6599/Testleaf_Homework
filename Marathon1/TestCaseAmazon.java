package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCaseAmazon {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("Bags");
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		// Print the total number of results (like 50000)1-48 of over 50,000 results for "bags for boys"
		
		WebElement results = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
		String res = results.getText();
		System.out.println("Total number of results "+ res);
		
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
		
		driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
		driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
		
		// Print the first resulting bag info (name, discounted price)
		
		WebElement bagname = driver.findElement(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']"));
		String namebag = bagname.getText();
		System.out.println("Name of the bag " + namebag);
		
		WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole']"));
		String pp = price.getText();
		System.out.println("Price " + pp);
		
		System.out.println("Page Tittle " + driver.getTitle());
		
		driver.close();
		
		
		
	}

}
