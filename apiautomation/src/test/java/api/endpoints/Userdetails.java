package api.endpoints;


import static io.restassured.RestAssured.given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Userdetails {
 // from this class we can add the user details
	public static  <users> Response createUser(users payload)
	{
		Response response =given()
				 
					.contentType(ContentType.JSON)
					.body(payload)
				.when()
					.post(roots.post_request);
		return response;
	}

	
	public static Response getsingleusers_data(String createduserid)
	{
		Response response =given()
				 .pathParam("username",createduserid)
				 .when()
				 .get(roots.get_singleuserrequest);
				
		return response;
	}

	public static Response getall_userid (String users)
	{
		Response response =given()
				 
				 .when()
				 .get(roots.getalluser_request);
				
		return response;
	}


}
