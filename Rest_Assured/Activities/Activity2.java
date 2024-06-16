package activities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

public class Activity2 {
    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;

    @BeforeClass
    public void setUp(){
        //Request Specifications
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2/user")
                .addHeader("Content-Type","application/json")
                .build();
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectBody("email", equalTo("justincase@mail.com"))
                .expectResponseTime(lessThanOrEqualTo(3000L))
                .build();

    }
    @Test (priority = 1)
    public void postRequest() throws IOException {
        //URL: https://petstore.swagger.io/v2/user
        // Import JSON file
        FileInputStream inputJSON = new FileInputStream("src/test/java/resources/userinfo.json");
        // Read JSON file as String
        String reqBody = new String(inputJSON.readAllBytes());
        //Save the response
        Response response = given().spec(requestSpec).body(reqBody).when().post();
        System.out.println(response.getBody().asPrettyString());

        inputJSON.close();
        //Assertions
        //response.then().body("code", equalTo(200));
        //response.then().body("message", equalTo("9902"));
        response.then().assertThat().body("code", equalTo(200),
                "message", equalTo("9902"));

    }
    @Test (priority = 2)
    public void getRequest(){
        //URL: https://petstore.swagger.io/v2/user/{username}
        //sent request, get response and assert
        Response response = given().spec(requestSpec).pathParam("username", "dummytest").
                when().get("/{username}");
        // Assertion
        response.then().body("id", equalTo(9902));
        response.then().body("username", equalTo("dummytest"));
        response.then().body("firstName", equalTo("Justin"));
        response.then().body("lastName", equalTo("Case"));
        response.then().body("email", equalTo("justincase@mail.com"));
        response.then().body("password", equalTo("password123"));
        response.then().body("phone", equalTo("9812763450"));

    }
    @Test(priority = 3)
    public void deleteRequest(){
        //URL: https://petstore.swagger.io/v2/user/{username}
        //sent request, get response and assert
        given().spec(requestSpec).pathParam("username", "dummytest").
                when().delete("/{username}").then().statusCode(200).log().ifError();

    }
}
