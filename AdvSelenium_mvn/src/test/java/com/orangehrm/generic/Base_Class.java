package com.orangehrm.generic;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.pom_element_repository.login_repository;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class implements framework_constant_orangehrm  {
	public login_repository login;
	public WebDriver driver;
	public WebDriverWait wait;
@BeforeClass
public void openapp()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get(Base_url);
	wait=new WebDriverWait(driver,TIME_OUT);
}
@BeforeMethod
public void login() throws IOException
{
	String username = generic_get_data_from_property.getdata("username");
	String password = generic_get_data_from_property.getdata("password");
	
	login_repository login = new login_repository(driver);
	login.getun().sendKeys(username);
	login.getpass().sendKeys(password);
	login.getloginbutton().click();
	
}
@AfterMethod
public void logout()
{
	login.getLogout_dropdown().click();
	login.getLogoutbtn();
}
@AfterClass
public void closeapp()
{
	driver.quit();
}

}
