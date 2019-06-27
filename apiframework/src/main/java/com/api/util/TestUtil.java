package com.api.util;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestUtil {
	
	public static JSONObject jobject;
	public static String getValueByJpath(JSONObject jobject,String Jpath) throws JSONException
	{
		Object obj=jobject;
		for(String s:Jpath.split("/"))
		{
			if(!s.isEmpty())
			{   
				if(!((s.contains("["))||(s.contains("]"))))
				{
					obj=((JSONObject) obj).get(s);
				}
				else if((s.contains("["))||(s.contains("]")))
				{
					obj=((JSONArray)((JSONObject)obj).get(s.split("\\[")[0])).get(Integer.parseInt(s.split("\\[")[1].replace("]","")));
				}
			}
		}
		
		
		
		return obj.toString();
	}

	public static String getValueByStream(JSONObject jobject,String Jpath) throws JSONException
	{
		Object obj=jobject;
		
		JSONArray ja=(JSONArray) jobject.get("weather");
		ja.get(0);
		
		
		System.out.println("--------"+ja.get(0));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return obj.toString();
	}
}
