package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCasePVR {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//div[text()='Movie Library ']")).click();

		WebElement Citys = driver.findElement(By.xpath("//select[@name='city']"));
		Select City = new Select(Citys);
		City.selectByVisibleText("Chennai");

		WebElement Animation = driver.findElement(By.xpath("//select[@name='genre']"));
		Select Anim = new Select(Animation);
		Anim.selectByVisibleText("ANIMATION");

		WebElement Language = driver.findElement(By.xpath("//select[@name='lang']"));
		Select Langu = new Select(Language);
		Langu.selectByVisibleText("ENGLISH");

		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[@class='movie-list']/div/div)[1]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();

		//cinema name
		WebElement cineName=driver.findElement(By.name("cinemaName"));
		Select ss3 = new Select (cineName);
		ss3.selectByVisibleText("SPI Sathyam Chennai");

		driver.findElement(By.xpath("//div[@class='datepicker-container datepicker-default']/input")).click();
		Thread.sleep(2000);
		//select date
		driver.findElement(By.xpath("//div[@class='main-calendar-days']/span[text()='14']")).click();  

		//timeshow
		WebElement timing=driver.findElement(By.name("timings"));
		Select ss4 = new Select (timing);
		ss4.selectByVisibleText("03:00 PM - 06:00 PM");

		//number of seats
		driver.findElement(By.name("noOfTickets")).sendKeys("4");

		//name
		driver.findElement(By.name("name")).sendKeys("Ragavan");

		//email
		driver.findElement(By.name("email")).sendKeys("ragavan1005@gmail.com");

		//monile
		driver.findElement(By.name("mobile")).sendKeys("9487482338");

		//F&B Req
		WebElement food =driver.findElement(By.xpath("//select[@name='food']"));
		Select ss5 = new Select(food);
		ss5.selectByVisibleText("Yes");

		//other req
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("Nothing");

		//click on copy itself
		driver.findElement(By.xpath("//label[@class='custom-control custom-radio']")).click();

		//click ons end req
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();

		//click on cancel button
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();

		//click on close otp dialog
		driver.findElement(By.xpath("//button[text()='×']")).click();

		String title =driver.getTitle();
		System.out.println("Page title name is :" + title);
		driver.close();
	}

}
