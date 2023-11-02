package resTexm;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ResAssureExm {
	
public static void main(String[] args) {
		
		RestAssured.baseURI = "https://api.genderize.io/?name=shiv";
		RequestSpecification req = RestAssured.given();
		
		 req.queryParam("name", "Ravi");
	     Response res = req.get();
	     
	     int ResponseCode = res.getStatusCode();
	     System.out.println("ResponseCode  is "+ ResponseCode);
	     System.out.println("status coe  is "+ res.getStatusLine());
	     System.out.println("content Type  is "+ res.getHeader("Content-Type"));
	     
	     Headers resHead = res.getHeaders();
	     
	     for(Header h: resHead) {
	    	 System.out.println("name:- "+h.getName());
	    	 System.out.println("name:- "+h.getValue());
	     }
	     
	     ResponseBody reBody = res.getBody();
	     JsonPath path = reBody.jsonPath();
	     System.out.println("name: "+ path.getString("name"));
	     System.out.println("probability: "+ path.getString("probability"));
	     System.out.println("probability: "+ path.getString("probability"));
	     System.out.println("count: "+ path.getString("count"));
	}
}
