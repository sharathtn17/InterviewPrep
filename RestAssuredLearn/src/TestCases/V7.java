package TestCases;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import restmethod.RestAction;
import v7api.Parameter;
import v7api.PostBody;
import v7api.PostSucRes;
import v7api.Resource;

public class V7 {
	
@BeforeMethod
	public void setup()
 {
	RestAssured.baseURI = "http://cisvip.qa.ch3.s.com/universalservices";
	//RestAssured.baseURI = "http://cisvip.qa.ch3.s.com/universalservices";
 }
	
	//@Test
	public void validateUpateMemberPin()
	{  /*Map<String,String> mp=new HashMap<String,String>();
	   mp.put("memnum", "7081327702717632");
	   mp.put("pin", "65656");
	   	*/
	   Response res=RestAction.getRequestForm(Parameter.getMemberPinQueryParm(), Resource.getMemberPinResource("v7"));
	   RestAction.validateResponseStatusCode(res);
	   System.out.println(res.asString()+"------"+res.getBody().asString());
	   
	   
	}
	

	@Test
	public void validatePersonalInfoAPI()
	{  Map<String,String> mp=new HashMap<String,String>();
	  mp.put("id", "10716217");
	// mp.put("pin", "32234");
	 //  String pin="32234";
	//  String Api="v7/user/personalinfo";
	  String personinfoget="v7/user";
	/*  JSONObject requestParams = new JSONObject();
		
		requestParams.put("userId", "10636666"); // Cast
		requestParams.put("sywNo", "7081327672217159");
		requestParams.put("fname", "Saritappa");
		requestParams.put("lname", "Patilappa");
		requestParams.put("birthDay", "01-01-1986");
		requestParams.put("anniversary", "01-01-1111");
		requestParams.put("annivPreferenceId", "null");*/
		
	  Response res=RestAction.postRequest(PostBody.postPersonalInfoBody(),Resource.personalInfoURI("v7"),mp);
	  System.out.println("******CODE********"+res.jsonPath().get("code")); ;
	  PostSucRes responseBody = res.getBody().as(PostSucRes.class);
	  //responseBody.equals(obj)
	  System.out.println(responseBody.code+"************");
	  System.out.println(responseBody.description+"************");
	  RestAction.validateResponseStatusCode(res);
	   
	   //RestAction.getRequestFormXML(mp, personinfoget).then().assertThat().body("user.id[0].first", equals(""));
	 //  System.out.println(responseII.body().asString());
	   
	  
		
	   /* Response res=RestAction.getRequestForm(mp, Api);
		RestAction.validateResponseStatusCode(res);
		System.out.println(res.body().asString());
		Assert.assertEquals(res.body().asString().trim(), "32234");*/
		
		
	}
	
	@Test
	public void createUser() throws IOException
	{ /* Map<String,String> mp=new HashMap<String,String>();
	  mp.put("id", "10716217");*/
	// mp.put("pin", "32234");
	 //  String pin="32234";
	//  String Api="v7/user/personalinfo";
	  String personinfoget="v7/user";
	  String myRequest = PostBody.generateStringFromResource("C:/Users/sn0000/workspace/RestAssuredLearn/src/v7api/user.xml");

	/*  JSONObject requestParams = new JSONObject();
		String myRequest = generateStringFromResource("path/to/xml.xml")

		requestParams.put("userId", "10636666"); // Cast
		requestParams.put("sywNo", "7081327672217159");
		requestParams.put("fname", "Saritappa");
		requestParams.put("lname", "Patilappa");
		requestParams.put("birthDay", "01-01-1986");
		requestParams.put("anniversary", "01-01-1111");
		requestParams.put("annivPreferenceId", "null");*/
		System.out.println(myRequest+"MYYY REQUEEEE");
	  Response res=RestAction.postRequestXML(myRequest,"v6/user");
	 System.out.println( res.getBody().asString()+res.statusCode());
	// System.out.println("******CODE********"+res.jsonPath().get("code")); ;
	 // PostSucRes responseBody = res.getBody().as(PostSucRes.class);
	  //responseBody.equals(obj)
	//  System.out.println(responseBody.code+"************");
	//  System.out.println(responseBody.description+"************");
	//  RestAction.validateResponseStatusCode(res);
	   
	   //RestAction.getRequestFormXML(mp, personinfoget).then().assertThat().body("user.id[0].first", equals(""));
	 //  System.out.println(responseII.body().asString());
	   
	  
		
	   /* Response res=RestAction.getRequestForm(mp, Api);
		RestAction.validateResponseStatusCode(res);
		System.out.println(res.body().asString());
		Assert.assertEquals(res.body().asString().trim(), "32234");*/
		
		
	}
	//@Test
	public void validategetMemberPin()
	{  Map<String,String> mp=new HashMap<String,String>();
	   mp.put("memnum", "7081327702717632");
	// mp.put("pin", "32234");
	 //  String pin="32234";
	   String Api="v7/user/getMemberPin";
		
	    Response res=RestAction.getRequestForm(mp, Api);
		RestAction.validateResponseStatusCode(res);
	
		System.out.println(res.body().asString());
		
		Assert.assertEquals(res.body().asString().trim(), "32234");
	}
	
	//@Test
	public void validatePostAffinity()
	{   Map<String,String> mp=new HashMap<String,String>();
	  mp.put("id", "10276758");
	// mp.put("pin", "32234");id=10276758
	 //  String pin="32234";
	  String Api="v7/user/personalinfo";
	  String personinfoget="v7/user/updateccaffinity";
	 
	  JSONObject requestParams = new JSONObject();
	  requestParams.put("sywr", "7081327708413301"); // Cast
		
		
	   Response res=RestAction.postRequest(requestParams, personinfoget,mp);
	   RestAction.validateResponseStatusCode(res);
	}
	
}
