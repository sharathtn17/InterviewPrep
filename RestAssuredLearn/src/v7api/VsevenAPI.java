package v7api;

import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class VsevenAPI {

	
	
	
	@Test
	public void VerifyMemberPinUpdate()
	
	{
		//DigitalSignature.generateDigitalSignature("58");
		//String MemberNum="7081327702717632";
		String pin="32343";
		//Header head=new Header("application","json");
		
		RestAssured.baseURI = "http://cisvip.qa.ch3.s.com/universalservices";
		Map<String,String> mp=new HashMap();
		mp.put("memnum", "7081327702717632");
		mp.put("pin", pin);
		
		
		
		RestAssured
				
	   .given()
				.params(mp)
				
				//.param("memnum", "7081327702717632").param("pin", Integer.parseInt(pin))
				.param(DigitalSignature.generateDigitalSignature("3")).log().all()
				.urlEncodingEnabled(false).accept("application/json")
		
	  
		.when()
	           .get("v7/user/updateMemberPin").
	           
	           
	    then()
	            .statusCode(200);
		
		
		//Assert.assertEquals(200,response.statusCode());
		
		
		
	//	System.out.println(response.statusCode());
		//System.out.println(response.getBody().asString());
		
		
		RequestSpecification httpGetMemberpinRequest = RestAssured.given().param("memnum", "7081327702717632")
				.param(DigitalSignature.generateDigitalSignature("3")).log().all();
		
		httpGetMemberpinRequest.accept("application/json");
		
		Response responseJson = httpGetMemberpinRequest.urlEncodingEnabled(false).when().get("v6/user/getMemberPin");
		System.out.println(responseJson.getBody().asString());
		
		Assert.assertEquals(responseJson.getBody().asString(), pin);
		
	}
}
