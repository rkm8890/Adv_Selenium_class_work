package com.orangehrm.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UTILITY_ACTIONS {

	public static void mouse_hover(WebDriver driver,WebElement element)
	{
		UTILITY_OBJECT.Actions_object(driver).moveToElement(element).perform();
		
	}
	public static void mouse_hover_click(WebDriver driver,WebElement element)
	{
		UTILITY_OBJECT.Actions_object(driver).moveToElement(element).click().perform();
		
	}
	public static void right_click(WebDriver driver, WebElement element)
	{
		UTILITY_OBJECT.Actions_object(driver).contextClick(element).perform();
	}
	public static void double_click(WebDriver driver, WebElement element)
	{
		UTILITY_OBJECT.Actions_object(driver).doubleClick(element).perform();
	}
	public static void drag_and_drop(WebDriver driver,WebElement source,WebElement dest)
	{
		UTILITY_OBJECT.Actions_object(driver).dragAndDrop(source,dest).perform();
	}

}
