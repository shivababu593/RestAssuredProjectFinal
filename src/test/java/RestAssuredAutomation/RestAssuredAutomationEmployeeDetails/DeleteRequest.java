package RestAssuredAutomation.RestAssuredAutomationEmployeeDetails;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.when;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DeleteRequest
{
	

    // This code is for Delete - "message": "successfully! deleted Records".
  
    
    @Test
	public void deleteRequest()
	{
		baseURI="http://dummy.restapiexample.com/api";
		
		Response response = 
		    when()
		    .delete("/v1/delete/2")
		    .then()
		    .statusCode(200)
			.log()
			.all()
			.extract().response();
		    String data =response.asString();
		    Assert.assertEquals(data.contains("Successfully! Record has been deleted"),true);
		    
	}
  

}

