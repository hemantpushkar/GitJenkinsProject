package com.Config.GitJenkinsProject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestFBLogin {
	

	WebDriver driver;
	FBLogin objLogin;
	
	@BeforeTest
	public void launchChrome()	
	{
	System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	}
	@Test
	public void testChrome()
	{
		objLogin= new FBLogin(driver);
		
		objLogin.EnterUserName();
		
		
	//	Assert.assertEquals("", "", "");
	
	}
	@AfterTest
	public void kill()
	{
	driver.close();
	driver.quit();
	}
	}
