package script;

import java.net.MalformedURLException;
import java.net.URL;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.Test;

public class Demo1 {

	    
		@Test
		public void testA() throws MalformedURLException
		{
		URL url=new URL("http://192.168.43.14:4444/wd/hub");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setBrowserName("chrome");
		WebDriver driver=new RemoteWebDriver(url,dc);

	}

	}


