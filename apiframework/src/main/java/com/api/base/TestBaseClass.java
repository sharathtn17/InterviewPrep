package com.api.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBaseClass {
	
	
	public Properties property;
	public int STATUS_CODE_200=200;
		
	public TestBaseClass()
	{
		property=new Properties();
		
		try {
			FileInputStream fin=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/api/config/config.properties");
		    property.load(fin);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
