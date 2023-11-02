package IBMRestExml;

import static org.testng.Assert.assertEquals;
import java.util.List;


import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class UnversityAPIExmpl {

	public static void main(String[] args) {
		RestAssured.baseURI = "http://universities.hipolabs.com/";
		Object country = "india";
		Response res = RestAssured.given().queryParam("country", country).get("search").then().extract().response();
		assertEquals(200,res.getStatusCode());
		ResponseBody  reBody = res.getBody(); 
		JsonPath  respath= 	reBody.jsonPath();
		List<String> stateList = respath.getList("state-province");
		System.out.println();
		
	}

}
