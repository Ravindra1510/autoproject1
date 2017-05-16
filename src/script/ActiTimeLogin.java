package script;

import generic.BaseTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pom.LoginPage;

public class ActiTimeLogin extends BaseTest{
	
	@Test
	public void loginActi()
	{
	
	LoginPage l = new LoginPage(driver);
	l.setUserName("admin");
	l.setPassword("manager");
	l.clickLogin();
	SoftAssert s = new SoftAssert();
	l.verifyErrMsgIsDiplayed(s);
	s.assertAll();

	}
}
