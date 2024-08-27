package Sample_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First_Script {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("1234");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.close();
	}

}
