package Sample_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_Script {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		// Identify WebElement -- Locator -- ID

		WebElement Email=driver.findElement(By.id("email"));
		Email.sendKeys("Test@gmail.com");

		WebElement Password=driver.findElement(By.id("pass"));
		Password.sendKeys("12345678");

		//WebElement LoginButton=driver.findElement(By.id("u_0_9_aE"));
		//LoginButton.click();

		//Identify WebElement -- Locator -- Name 
		WebElement LoginButton=driver.findElement(By.name("login"));
		LoginButton.click();

	}

}
