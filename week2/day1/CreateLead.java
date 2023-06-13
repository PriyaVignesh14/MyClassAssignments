package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

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
		
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select source1=new Select(source);
		
	    source1.selectByVisibleText("Employee");

	    WebElement mc = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	    
	    Select mc1=new Select(mc);
	    
	    mc1.selectByValue("9001");
	    
	    WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	    
	    Select own=new Select(ownership);
	    
	    own.selectByIndex(5);
	    
	    WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	    
	    Select c1=new Select(country);
	    
	    c1.selectByVisibleText("India");
	    
	    driver.findElement(By.name("submitButton")).click();
	    
	    System.out.println("Page title is : " + driver.getTitle());
	    
	    
	    
	    
}
	
}