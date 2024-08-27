package Sample_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Second_Script {

	public static void main(String[] args)
	{
		// Browser Opening
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
	    driver.get(" https://demo.guru99.com/test/newtours/register.php");
	    driver.manage().window().maximize();
	    
	    // Identify WebElement By using Locators-----name
	    
	    // Contact Information
	    driver.findElement(By.name("firstName")).sendKeys("Ayansh");
	    driver.findElement(By.name("lastName")).sendKeys("Kadu");
	    driver.findElement(By.name("phone")).sendKeys("9876543214");
	    driver.findElement(By.name("userName")).sendKeys("Test123@gmail.com");
	    
	    // Mailing Information
	    driver.findElement(By.name("address1")).sendKeys("Chhatrapati Sambhajinagar");
	    driver.findElement(By.name("city")).sendKeys("Chhatrapati Sambhajinagar");
	    driver.findElement(By.name("state")).sendKeys("Maharashtra");
	    driver.findElement(By.name("postalCode")).sendKeys("123451");
	    driver.findElement(By.name("country")).sendKeys("India");
	    
	    // User Information
	    driver.findElement(By.name("email")).sendKeys("Test123@gmail.com");
	    driver.findElement(By.name("password")).sendKeys("12345");
	    driver.findElement(By.name("confirmPassword")).sendKeys("12345");
	    driver.findElement(By.name("submit")).click();
	    
	    // Browser Closing 
	    driver.close();
	}

}
