package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class TestCaseAbiBus {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//a[text()='Bus'])[2]")).click();
		
		driver.findElement(By.xpath("//input[@class='form-control border-0 mb-0 ui-autocomplete-input']")).sendKeys("Chenn");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
		driver.findElement(By.xpath("(//input[@class='form-control border-0 mb-0 ui-autocomplete-input'])[2]")).sendKeys("Banga");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		
		driver.findElement(By.xpath("(//div[@class='col pt-2'])[3]")).click();
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[1]")).click();
		
		driver.findElement(By.xpath("(//div[@class='col-md-auto'])[2]")).click();
		
		driver.findElement(By.xpath("//div[@class='search-column1']"));
		
		WebElement firstBusname = driver.findElement(By.xpath("//h2[@class='TravelAgntNm ng-binding']"));
		String firstBus = firstBusname.getText();
		System.out.println("First Bus name " + firstBus);
		
		driver.findElement(By.xpath("//li[@id='bustypeSLEEPER']")).click();
		
		driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
		
		driver.findElement(By.xpath("(//li[contains(@class,' sleeper available')])[2]/a")).click();
		
		WebElement seatnumber = driver.findElement(By.xpath("//div[@class='jurnydetails']/div/p[contains(text(),'Seats Selected')]/parent::div/p/span"));
		String seat = seatnumber.getText();
		System.out.println("Seat number " + seat);
		
		WebElement totalFare = driver.findElement(By.xpath("//span[@id='ticketfare']"));
		String totalamount = totalFare.getText();
		System.out.println("Total Amount " + totalamount);
		
				
		WebElement Borading = driver.findElement(By.xpath("//select[@name='boardingpoint_id']"));
		Select Board =new Select(Borading);
		Board.selectByIndex(5);
		
		WebElement Droping = driver.findElement(By.xpath("//select[@name='droppingpoint_id']"));
		Select Drop =new Select(Droping);
		Drop.selectByIndex(5);
		
		System.out.println("Tittle of the page " + driver.getTitle());
		
		driver.close();
	}

}
