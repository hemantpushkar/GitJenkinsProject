package com.Config.GitJenkinsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Hello world!
 *
 */
public class FBLogin 
{
	
	WebDriver driver;
	By userName = By.name("email");
	By password = By.name("pass");
	
	public FBLogin(WebDriver driver){
	
		this.driver = driver;
	}
	
	//Set user name in textbox
		public void EnterUserName(){
			driver.findElement(userName).sendKeys("selenium");
			 
		}
		
		//Set password in password textbox
		public void setPassword(String strPassword){
			 driver.findElement(password).sendKeys(strPassword);
			 
		}

}
