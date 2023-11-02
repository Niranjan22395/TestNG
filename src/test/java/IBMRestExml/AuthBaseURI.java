package IBMRestExml;
import static org.testng.Assert.assertEquals;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AuthBaseURI {

	public static void TestAssertwithAuth(String Username, String Password) {
		RestAssured.baseURI = "https://postman-echo.com/";
		
		Response res = RestAssured.given().auth().preemptive().basic(Username, Password).get("basic-auth").then().extract().response();
		int expectedCode = 200;
		assertEquals(expectedCode ,res.getStatusCode());
	}
}
