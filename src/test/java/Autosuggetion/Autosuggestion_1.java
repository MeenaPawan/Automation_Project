package Autosuggetion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggestion_1 {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Laptop");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		System.out.println(list.size());
	}

}
