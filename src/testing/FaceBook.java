package testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("hardcorefanofpk@gmail.com"+Keys.TAB+"stupid12"+Keys.ENTER);
		Thread.sleep(3000);
		try{
		driver.findElement(By.xpath("(//div[@class='_4kny'])[4]/div/a/div")).click();
		}
		catch(Exception e)
		{
			driver.findElement(By.xpath("//em[.='Not Now']")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("(//div[@class='_4kny'])[4]/div/a/div")).click();
		}

	}

}
