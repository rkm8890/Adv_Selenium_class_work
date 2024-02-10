package com.orangehrm.generic;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UTILITY_SELECT {
	public static void select_option(WebElement element,Object data)
	{
		Select sel=UTILITY_OBJECT.select_object(element);
		if (data instanceof Integer)
		{
			sel.selectByIndex((Integer)data);
		}
		else if (data instanceof String)
		{
			try
			{
				sel.selectByValue((String)data);
			}
			catch(Exception e)
			{
				sel.selectByVisibleText((String)data);
			}
		}
				
	}
	public static void deselect_option(WebElement element,Object data)
	{
		Select sel=UTILITY_OBJECT.select_object(element);
		if (data instanceof Integer)
		{
			sel.deselectByIndex((Integer)data);
		}
		else if (data instanceof String)
		{
			try
			{
				sel.deselectByValue((String)data);
			}
			catch(Exception e)
			{
				sel.deselectByVisibleText((String)data);
			}
		}
		
	}
	public static void deselect_All_option(WebElement element)
	{
		Select sel=UTILITY_OBJECT.select_object(element);
		sel.deselectAll();
	}
	public static List<WebElement> get_options(WebElement element)
	{
		Select sel=UTILITY_OBJECT.select_object(element);
		return sel.getOptions();
	}
	

}
