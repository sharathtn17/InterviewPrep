package StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import restmethod.RestAction;
import v7api.Parameter;
import v7api.Resource;

public class Steps {				

    
    @Given("^Create a request$")				
    public void getRequest() throws Throwable							
    {		
       //Response res=RestAction.getRequestForm(Parameter.getMemberPinQueryParm(), Resource.getMemberPinResource("v7"));
   	 //  RestAction.validateResponseStatusCode(res);
        System.out.println("This Step open the Firefox and launch the application."+"YEAAS");					
    }		

    @When("^hit a API request$")					
    public void enter_the_Username_and_Password() throws Throwable 							
    {		
       System.out.println("This step enter the Username and Password on the login page.");					
    }		

    @Then("^validate API request$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        System.out.println("This step click on the Reset button.");					
    }		

}