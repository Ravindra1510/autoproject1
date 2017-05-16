package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest implements AutoConst{
    public WebDriver driver;
	@BeforeMethod
	public void openApplication()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://localhost:8080/login.do");
	}
	@AfterMethod
	public void closeApplication(ITestResult result) throws IOException
	{
		String testName = result.getName();
		int status = result.getStatus();
		if(status==ITestResult.FAILURE)
		{
			Library.getSnapshot(driver,SNAP_PATH);
		}
		driver.quit();
	}

}
