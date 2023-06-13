package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Accounts")).click();
		
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.xpath("//input[contains(@class,'Box')]")).sendKeys("Debit Limited Account");
		
		driver.findElement(By.xpath("//textarea[contains(@name,'description')] ")).sendKeys("Selenium Automation Tester");
		
		driver.findElement(By.xpath("(//input[@class='inputBox'])[3]")).sendKeys("Vignesh");
		
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Chennai_Office");
		
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("5Crore");
		
        WebElement IndustryType = driver.findElement(By.name("industryEnumId"));
		
		Select I=new Select(IndustryType);
		
	    I.selectByVisibleText("Computer Software");
	    
	    WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
	    
        Select own=new Select(ownership);
		
	    own.selectByVisibleText("S-Corporation");
	    
	    WebElement Source = driver.findElement(By.name("dataSourceId"));
	    
	    Select sc=new Select(Source);
	    
	    sc.selectByValue("LEAD_EMPLOYEE");
	    
	    WebElement MarketingComp = driver.findElement(By.name("marketingCampaignId"));
	    
	    Select mc=new Select(MarketingComp);
	    
	    mc.selectByIndex(6);
	    
	    WebElement State = driver.findElement(By.name("generalStateProvinceGeoId"));
	    
	    Select st=new Select(State);
	    
	    st.selectByValue("TX");
	    
	    driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	    
	    
		
	    
	    
	}

}
