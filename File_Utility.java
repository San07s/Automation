package com.genericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class File_Utility {
	
	// This method is used to fetch the common datas like url,email,password. so using this 
	// method we can fetch the data.and also reduce the again and again code writtening.(Ex:Excel_File_Learning.class 43th line)
	
	public static String getPropertyData(String key) {
		FileInputStream fis=null;
		
		try {
			fis=new FileInputStream("./src/main/resources/commonDataProperties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties property=new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		String value = property.getProperty(key);
		return value;
		
		
	}

}
