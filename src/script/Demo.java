package script;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;





public class Demo {
	
	
	@Test
	public void testA() throws MalformedURLException
	{
	  URL url = new URL("http://2405:204:5004:c06e:69ea:c64a:a6d7:6567:4444/wd/hub");
	  DesiredCapabilities dc = new DesiredCapabilities();
	  dc.setBrowserName("firefox");
	  WebDriver driver = new RemoteWebDriver(url,dc);
	  driver.get("http://localhost/login.do");
	  
	}

}
