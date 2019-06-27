package com.framework.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	protected static String filepath="C:/Users/sn0000/workspace/FrameWork/src/com/framework/utility/config.properties";
	protected static String filepathtestData="C:/Users/sn0000/workspace/FrameWork/src/com/framework/utility/testData.properties";
	//public  Properties prop=new Properties();
	
	public static  void readConfig(String path,Properties prop)
	{
		File fs=new File(path);
		
		FileInputStream fis=null;
		
		try{
			fis=new FileInputStream(fs);
			
		}catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		try{
			prop.load(fis);
		}catch(IOException e){
			e.printStackTrace();
		}
	
	}
	
	
	public static String getConfProperty(String propertyName){
		 Properties prop=new Properties();
		 readConfig(filepath,prop);
		 String s=prop.getProperty(propertyName);
		
		return s;
		
	}
	
	public static String gettestDataProperty(String propertyName){
		 Properties prop2=new Properties();
		 readConfig(filepathtestData,prop2);
		 String s=prop2.getProperty(propertyName);
		 
		 System.out.print("TestData "+s);
		
		return s;
		
	}

}
