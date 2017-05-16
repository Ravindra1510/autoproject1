package generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;




public class Library1 {

	public static void getSnap(String folder,WebDriver driver) throws IOException {
		Date d = new Date();
		TakesScreenshot t = (TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File(folder+d);
		FileUtils.copyFile(src,dest);
		
		

	}

}
