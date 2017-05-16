package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Library {
	
	public static void getSnapshot(WebDriver driver,String folder) throws IOException 
	{
		Date d = new Date();
	    String now = d.toString().replace(':','_');
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest=new File(folder+now+".png");
		FileUtils.copyFile(src, dest);
	}

}
