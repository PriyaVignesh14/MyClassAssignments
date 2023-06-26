package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnButtons {

	
	private static Point point;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		
		
		
	System.out.println("Click and confirm Title");
	driver.findElement(By.xpath("//span[@class='ui-button-text ui-c']")).click();
	Thread.sleep(2000);
	
	driver.navigate().back();
	
	System.out.println("Confirm if button is disabled");
	 
	boolean enabled=driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
	
	if(!enabled)
		
	{
		System.out.println("NotEnabled");
	}
	
	else
	{
	
		System.out.println("Enabled");	
		
	}
	
	System.out.println("find the position of the submit button");
	
	Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
	
	System.out.println(location);

	
	System.out.println("find the save button color");
	
	
	
	 String cssValue = driver.findElement(By.xpath("//span[text()='Save']")).getCssValue("color");
	 
	 System.out.println(cssValue);
	 
	 System.out.println("find hight and weight of button");
	 
	 Dimension size = driver.findElement(By.xpath("(//span[text()='Submit']/parent::button)[2]")).getSize();
	  System.out.println(size);
	
	  System.out.println("MouseHover and confirm color change");
	  
	  WebElement s = driver.findElement(By.xpath("//span[text()='Success']/parent::button"));
	  
	  String color1=s.getCssValue("color");
	  
	  
	  Actions builder=new Actions(driver);
	  
	  builder.moveToElement(s).perform();
	  
	  String Color2=s.getCssValue("color");
	  
	  if(color1.equals(Color2))
	  {
		  
		  System.out.println("color chnaged");
	  }
	  else
	  {
		  System.out.println("color not chnaged");
	  }
	  
	  System.out.println("click image button and click on hidden button");
	  
	  driver.findElement(By.xpath("//span[text()='Image']")).click();
	  
	  System.out.println("rounded buttons");
	  
	  List<WebElement> rb = driver.findElements(By.xpath("//button[contains(@class,'rounded-button')]"));
	  
	  int size2=rb.size();
	  
	  System.out.println(size2);
	  
	  
	}
	

}
