package com.api.test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.api.base.TestBaseClass;
import com.api.client.RestClient;
import com.api.util.TestUtil;

public class getApiTest extends TestBaseClass{
	TestBaseClass testBaseClass;
	String serviceurl;
	String apiurl;
	String url;
	RestClient restClient;
	CloseableHttpResponse closeableResponse;
	@BeforeMethod
	public void setup()
	{
		testBaseClass=new TestBaseClass();
		
		 serviceurl=property.getProperty("url");
		 apiurl=property.getProperty("serviceurl");
		
		 url=serviceurl+apiurl;
		System.out.println(url);
		
	}
	
	
	@Test
	public void getTestMethod() throws ClientProtocolException, IOException, JSONException
	{
		
		restClient=new RestClient();
		closeableResponse=restClient.get(url);
		
		
		int statuscode=closeableResponse.getStatusLine().getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, STATUS_CODE_200);
		
	
		
		String response=EntityUtils.toString(closeableResponse.getEntity(),"UTF-8");//response to string
		//	String responsewithoutUTF=EntityUtils.toString(closeableResponse.getEntity());
		System.out.println("ResponseJson"+response);
		
		JSONObject responseJson=new JSONObject(response);//json response object
		
		
		String cood=TestUtil.getValueByJpath(responseJson, "/coord");
		System.out.println(cood);
		System.out.println();
		System.out.println();
		//Json Array
		String weatherID=TestUtil.getValueByJpath(responseJson, "/weather[0]/id");
		System.out.println(weatherID);
		
		String Description=TestUtil.getValueByJpath(responseJson, "/weather[0]/description");
		System.out.println(Description);
		
		//System.out.println("ResponseJson"+responseJson);
	
		String weathD=TestUtil.getValueByStream(responseJson, "");
		//Handling header
		Header[] headerArray=closeableResponse.getAllHeaders();//headers to store
		
		HashMap<String,String> allheader=new HashMap<String, String>();
		
		for(Header header:headerArray)
		{
			allheader.put(header.getName(),header.getValue());
		}
		
		allheader.forEach((k,v)->System.out.println(k+":"+v));
		for(Map.Entry<String, String> e:allheader.entrySet()){
			
			//System.out.println(e.getKey()+" : "+e.getValue());
			
		}
	
		
	}
	

}