package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("(//form[@method='post']//a)[3]")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("thanvissha");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("VR");
		
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input[1]")).sendKeys("9999999999");
		
		driver.findElement(By.xpath("//div[@id='password_field']//input[@type='password']")).sendKeys("TVR@123");
		
		WebElement Day = driver.findElement(By.id("day"));
		
		Select d=new Select(Day);
		
		d.selectByVisibleText("7");
		
		WebElement Month = driver.findElement(By.id("month"));
		
		Select m=new Select(Month);
		
		m.selectByVisibleText("Jun");
		
		WebElement Year = driver.findElement(By.id("year"));
		
		Select y=new Select(Year);
		
		y.selectByVisibleText("2018");
		
		
		driver.findElement(By.xpath("//input[@type='radio'][1]")).click();
		
		
		
		
		
	}

}
