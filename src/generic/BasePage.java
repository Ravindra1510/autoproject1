package generic;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
       public WebDriver driver;
       
       public BasePage(WebDriver driver)
       {
    	   this.driver= driver;
       }
       public void verifyTitle(String eTitle)
       {
    	   try
    	   {
    	   WebDriverWait wait = new WebDriverWait(driver,10);
    	   wait.until(ExpectedConditions.titleIs(eTitle));
    	   System.out.println("title is matched");
    	   }
    	   catch(Exception e)
    	   {
    		   System.out.println("title is not matched");
    	   }
    	   
       }
       
}
