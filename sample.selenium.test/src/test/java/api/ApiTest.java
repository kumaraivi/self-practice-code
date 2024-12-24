package api;

import java.util.List;
import java.util.Map;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiTest {

	public static void main(String[] args) {
		
//		RestAssured.baseURI="https://demoqa.com/BookStore/v1/Books";
//		
//		RequestSpecification httpRequest=RestAssured.given();
//		
//		Response response=httpRequest.request(Method.GET, "");
//		
//		System.out.println(response.getStatusCode());
		
		RestAssured.baseURI="https://practice.expandtesting.com/notes/api";

		Response response1=RestAssured.given()
		.when()
		.get("/health-check")
		.then()
		.statusCode(200)
		.extract()
		.response();
		
		String str=response1.jsonPath().getString("message");
		Assert.assertEquals("Notes API is Running", str);
		
		System.out.println(str);
		
//		String requestBody = """
//			{
//			"name": "Avinash1",
//			"email": "avina30861@gmail.com",
//			"password": "test1234"
//			}
//			""";
//		Response response2=RestAssured.given()
//				.contentType(ContentType.JSON)
//				.body(requestBody)
//				.when()
//				.post("/users/register")
//				.then()
//				.statusCode(201)
//				.extract()
//				.response();
//		
//		System.out.println(response2.asPrettyString());
		
		
		String requestBody1 = """
				{
				"email": "avina30861@gmail.com",
				"password": "test1234"
				}
				""";
			Response response3=RestAssured.given()
					.contentType(ContentType.JSON)
					.body(requestBody1)
					.when()
					.post("/users/login")
					.then()
					.statusCode(200)
					.extract()
					.response();
			
			System.out.println(response3.asPrettyString());
			
			String token=response3.jsonPath().getString("data.token");
			
			System.out.println(token);
			
			
			
			
			Response response4=RestAssured.given()
					.header("x-auth-token", token)					
					.when()
					.get("/users/profile")
					.then()
					.statusCode(200)
					.extract()
					.response();
			
			System.out.println(response4.asPrettyString());
			
			
			String requestBody2="""
			{
            "name":"Avinash1",
            "phone":"9568670123",
            "company":"Albert"
            }
	      """;
			
			Response response5=RestAssured.given()
					.contentType(ContentType.JSON)
					.header("x-auth-token", token)
					.when()
					.body(requestBody2).patch("/users/profile")
					.then()
					.statusCode(200)
					.extract()
					.response();
			System.out.println(response5.asPrettyString());	
			
			Response response6=RestAssured.given()
					.header("x-auth-token", token)					
					.when()
					.get("/users/profile")
					.then()
					.statusCode(200)
					.extract()
					.response();
			
			System.out.println(response6.asPrettyString());	
			
			
			String requestBody3="""
					{
		            "email":"avina30861@gmail.com"
		            }
			      """;
			Response response7=RestAssured.given()
					.contentType(ContentType.JSON)
					.header("x-auth-token", token)
					.when()
					.body(requestBody3)
					.post("/users/forgot-password")
					.then()
					.statusCode(200)
					.extract()
					.response();
			
			System.out.println(response7.asPrettyString());
			
	}

}
