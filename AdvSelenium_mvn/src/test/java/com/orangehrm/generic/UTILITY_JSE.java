package com.orangehrm.generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UTILITY_JSE {
	public static void scroll_action(WebDriver driver,WebElement element)
	{
		JavascriptExecutor jse=UTILITY_OBJECT.javascript_object(driver);
		jse.executeScript("arguments.scrollIntoView()",element);
	}
	public static void disabled_element(WebDriver driver, String value,WebElement element)
	{
		JavascriptExecutor jse=UTILITY_OBJECT.javascript_object(driver);
		jse.executeScript("arguments[0].value='"+value+"'",element);
	}
	public static void click_disbled_element(WebDriver driver, Object element)
	{
		JavascriptExecutor jse=UTILITY_OBJECT.javascript_object(driver);
		jse.executeScript("arguments [0].click()",element);
	}

}
