package com.orangehrm.generic;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UTILITY_OBJECT {
	
	public static org.openqa.selenium.interactions.Actions Actions_object(WebDriver driver)
	{
		org.openqa.selenium.interactions.Actions act = new org.openqa.selenium.interactions.Actions(driver);
		return act;
	}
	public static Select select_object(WebElement element)
	{
		Select sel = new Select(element);
		return sel;
		
	}
	public static JavascriptExecutor javascript_object(WebDriver driver)
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		return jse;
	}
	public static Robot Robot_object()
	{
		Robot robot = null;
		try {
			robot = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return robot;
	}

}
