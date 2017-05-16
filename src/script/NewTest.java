package script;

import generic.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest extends BaseTest{

	@Test
	public void LoginFacebook()
	{
		driver.get("http://www.fb.com");
		Assert.fail();
		

	}

}
