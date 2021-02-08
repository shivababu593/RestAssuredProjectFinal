package RestAssuredAutomation.RestAssuredAutomationEmployeeDetails;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

public class GetEmployeeRequest 
{
	
	
	  //  This code is for  Get - Return specific Employee details(Any).
	  
    @Test
	public void  getEmployeRequest()
	{				
		given()
		.get("http://dummy.restapiexample.com/api/v1/employee/1")
		.then()
		.statusCode(200)
		.body("data.id", equalTo(1))
		.log()
		.all();
	}

}
