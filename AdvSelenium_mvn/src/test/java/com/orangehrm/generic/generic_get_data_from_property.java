package com.orangehrm.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class generic_get_data_from_property implements framework_constant_orangehrm
{
public static String getdata(String key) throws IOException
{
	FileInputStream fis=new FileInputStream(property_file);
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
	}
}

