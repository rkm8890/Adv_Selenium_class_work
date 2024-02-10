package com.orangehrm.pom_element_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_repository {
	@FindBy(name = "username")
	private WebElement username;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	@FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
	private WebElement logout_dropdown;
	@FindBy(xpath = "(//a[contains(text(),'out')])[2]")
	private WebElement logoutbtn;

	public login_repository(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getun() {
		return username;
	}

	public WebElement getpass() {
		return password;
	}

	public WebElement getloginbutton() {
		return loginbutton;
	}

	public WebElement getLogout_dropdown() {
		return logout_dropdown;
	}

	public WebElement getLogoutbtn() {
		return logoutbtn;
	}

}
