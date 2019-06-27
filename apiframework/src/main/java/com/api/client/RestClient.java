package com.api.client;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class RestClient {
	
	
	//Get Method implementation
	
	public CloseableHttpResponse get(String url) throws ClientProtocolException, IOException, JSONException
	{
		CloseableHttpClient httpClient=HttpClients.createDefault();//closable httpclient object buid restclient
		HttpGet httpget=new HttpGet(url);//httpGetRequest
		CloseableHttpResponse closeableResponse=httpClient.execute(httpget);//closeableResponse-->have all the response of the request - header, response json/xml
		
		return closeableResponse;
		
	}

}
