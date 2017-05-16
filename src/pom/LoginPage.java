package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import generic.BasePage;

public class LoginPage extends BasePage{
	
	
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="//*[.='Login ']")
	private WebElement loginBT;
	
	@FindBy(xpath="//span[contains(.,'invalid')]")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	 
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginBT.click();
	}
	
	public void verifyErrMsgIsDiplayed(SoftAssert s)
	{
		WebDriverWait wait = new WebDriverWait(driver,5);
		try{
			wait.until(ExpectedConditions.visibilityOf(errMsg));
			System.out.println("errmsg is displayed");	
		}
		catch(Exception e)
		{
			System.out.println("errmsg not is displayed");	
			s.fail();
			Reporter.log("hi",true);
		}
	}
	

}
