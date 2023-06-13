package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
        driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vignesh");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("RP");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Information Technology");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc.1@gmail.com");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("Page title is : " + driver.getTitle());
		 
		driver.findElement(By.linkText("Duplicate Lead")).click(); 
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Leaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("RangaPriya");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println("Page title is : " + driver.getTitle());
		
		
		
	}

}
