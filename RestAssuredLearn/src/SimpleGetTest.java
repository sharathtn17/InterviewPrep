import org.testng.annotations.Test;
import io.restassured.RestAssured;
 
public class SimpleGetTest {
 /*
	//@Test
	public void GetWeatherDetails()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
 
		// Get the RequestSpecification of the request that you want to sent
		// to the server. The server is specified by the BaseURI that we have
		// specified in the above step.	
		RequestSpecification httpRequest = RestAssured.given();
 
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/Hyderabad");
 
		// Now let us print the body of the message to see what response
		// we have recieved from the server
		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println(response.statusCode());
 
	}*/
	
	@Test
	public void storeFormat(String[] args)
	{
		RestAssured.baseURI="http:///cisvip.qa.ch3.s.com";
		
		RestAssured.
		
		given()
		       .param("storeformat", "10153")
		       .param("userid", "userid")
		       .param("storedetails", "true")
		       .param("sid", "3")
		       .param("sig", "VAd4paYoSl%2F3zJHsCvT%2FvilaShg%3D")
		       .param("ts", "2019-05-26T18:34:08Z").

		when()
		       .get("/universalservices/v7/user/preferredstore").
		       
		then()
		
		      .assertThat().statusCode(200);
		
	}
 /*
	@Test
	public void IteratingOverHeaders()
	{
		RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.get("/Bangalore");
	 
		// Get all the headers. Return value is of type Headers.
		// Headers class implements Iterable interface, hence we
		// can apply an advance for loop to go through all Headers
		// as shown in the code below
		Headers allHeaders = response.headers();
	 
		// Iterate over all the Headers
		for(Header header : allHeaders)
		{
			System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
		}
		
		System.out.println(response.print());
		JsonPath jp = response.jsonPath();
		
		System.out.println(jp.getString("City"));
		
	}
	*/
	
}
