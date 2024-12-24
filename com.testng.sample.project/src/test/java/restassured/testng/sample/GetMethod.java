package restassured.testng.sample;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
public class GetMethod{
	
	@Test
	public void getMethod()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://www.google.co.in";
     
	
		// Get the RequestSpecification of the request that you want to sent to the server. 
		//The server is specified by the BaseURI that we have specified in the above step.
		RequestSpecification httpRequest = RestAssured.given();
		
		// Make a request to the server by specifying the method Type and the method URL.
		// This will return the Response from the server. Store the response in a variable.
		Response response = httpRequest.request(Method.GET, "/imghp?hl=en&authuser=0&ogbl");
      
		 //print the message body of the response received from the server
		String responseBody = response.getBody().asString();
		//System.out.println("Response Body is =>  " + responseBody);
//		
		int statusCode = response.getStatusCode();
		System.out.println("Status Code: "+statusCode );
//		
//		//To retrieve status line of the response from the server and print the returned value.
//		String statusLine = response.getStatusLine();
//		System.out.println("Status Line: "+statusLine );
//		
//		Headers allHeaders = response.getHeaders();
//		// Headers class implements Iterable interface.
//		// Iterate over all the Headers using an advance for loop as shown in the code below
//		for (Header header : allHeaders) {
//			System.out.println("Key: " + header.getName() + " Value: " + header.getValue());
//		}
//		// Reader header is passed with exact header name as argument.
//	    // In the below line,we will get header named "Content-Type"
//    	String contentType = response.header("Content-Type");
//    	System.out.println("Content-Type value: " + contentType);
//    	
//        // Reader header is passed with exact header name as argument.
//	    // In the below line,we will get header named "Server"
//    	String serverType =  response.header("Server");
//    	System.out.println("Server value: " + serverType);
//    	
//    	// Reader header is passed with exact header name as argument.
//	    // In the below line,we will get header named "Date"
//	    String date = response.header("Date");
//    	System.out.println("Date value: " + date);
//    
//        // Reader header is passed with exact header name as argument.
//	    // In the below line,we will get header named "Content-Encoding"
//    	String contentEnco = response.header("Content-Encoding");
//    	System.out.println("Content-Encoding: " + contentEnco);
//    	
//    	// Reader header is passed with exact header name as argument.
//	    // In the below line,we will get header named "Transfer-Encoding"
//    	String transferEnco = response.header("Transfer-Encoding");
//    	System.out.println("Transfer-Encoding value: " + transferEnco);
		
		
		String statusLine = response.getStatusLine();
		System.out.println(statusLine);
		Assert.assertEquals(statusLine /*actual value*/, "HTTP/1.1 200 OK" /*expected value*/, "InCorrect status Line returned");
	}
	
	
}
