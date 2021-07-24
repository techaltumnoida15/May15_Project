package org.project.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public final class PropertyFile {
	
	private PropertyFile(){}

	public static String getData(String key) throws Exception {

		Properties prop = new Properties();
		prop.load(new FileInputStream(new File(System.getProperty("user.dir") + "\\resources\\data.properties")));
		
		//Read Data - Risk=> if key is null in property file - > Handle that
		String value = prop.getProperty(key);
		return value.trim();
	}
	
	public static void setData(String key, String value) {
		
	}
}
