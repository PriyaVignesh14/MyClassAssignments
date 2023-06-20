package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Priya");
		
		Thread.sleep(2000);
		
        driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(2000);
		
		WebElement e = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		
		e.click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		Thread.sleep(2000);
		
		
		WebElement p = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		
		Thread.sleep(2000);
		
		p.clear();
		
		Thread.sleep(2000);
		
		p.sendKeys("TestLeaf");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		Thread.sleep(2000);
		
		driver.close();
		
	
		
		
	}

}
