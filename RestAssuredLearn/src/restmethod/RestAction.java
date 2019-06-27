package restmethod;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpRequest;
import org.json.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import v7api.DigitalSignature;

public class RestAction {
	
	
	
	public static Response getRequestForm(Map<String,String> mp, String Api)
	{
				
		Response response=RestAssured
				
	   .given()
				.params(mp)
				//.param("memnum", "7081327702717632").param("pin", Integer.parseInt(pin))
				.param(DigitalSignature.generateDigitalSignature("3"))
				.urlEncodingEnabled(false).accept("*/*").log().all()
		
	  
		.when()
	           .get(Api);
		
		return response;
	}

	
	public static void validateResponseStatusCode(Response response)
	{
		response.then().assertThat();
		
	}
	
	public static Response postRequest(JSONObject requestParams, String Api,Map<String,String> mp)
	{
		
		
				
    Response response=RestAssured.given().params(mp).param(DigitalSignature.generateDigitalSignature("3")).
    		  urlEncodingEnabled(false).
    		  contentType("application/json").log().all().
    		  body(requestParams.toString()).
    		  when().put(Api);
				
	    System.out.println(response.body().asString());
		return response;
	}
	public static Response postRequestXML(String requestParams, String Api)
	{
			  Response response=RestAssured.given().queryParam(DigitalSignature.generateDigitalSignature("3")).
    		  urlEncodingEnabled(false).
    		  contentType("application/xml").log().all().
    		  body(requestParams).
    		  when().post(Api);
				
	    System.out.println(response.body().asString());
		return response;
	}

	public static Response getRequestFormXML(Map<String, String> mp, String Api) {
		// TODO Auto-generated method stub
		Response response=RestAssured
				
				   .given()
							.params(mp)
							//.param("memnum", "7081327702717632").param("pin", Integer.parseInt(pin))
							.param(DigitalSignature.generateDigitalSignature("3"))
							.urlEncodingEnabled(false).accept("*/*").log().all()
					
				  
					.when()
				           .get(Api);
					
					return response;
		
		
	}
}
