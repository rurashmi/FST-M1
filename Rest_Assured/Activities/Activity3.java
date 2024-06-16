package activities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;

public class Activity3 {
    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;
    int petId;
    @BeforeClass
    public void setUp() {
        //Request Specifications
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2/pet")
                .addHeader("Content-Type", "application/json")
                .build();
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectBody("status", equalTo("alive"))
                .expectHeader("Content-Type", equalTo("application/json"))
                .expectResponseTime(lessThanOrEqualTo(3000L))
                .build();
    }
        @DataProvider
                public Object[][] petInfoProvider() {
            Object[][] testData = new Object[][]{
                    {77232, "Riley", "alive"},
                    {77233, "Hansel", "alive"}};
            return testData;
        }
        @Test(priority = 1)
    public void addPets(){
        String reqBody = "{\"id\": 77232, \"name\": \"Riley\", \"status\": \"alive\"}";
        Response response = given().spec(requestSpec).body(reqBody).when().post();
            reqBody = "{\"id\": 77233, \"name\": \"Hansel\", \"status\": \"alive\"}";
            response = given().spec(requestSpec).body(reqBody).when().post();
            // Assertions
            response.then().spec(responseSpec); // Use responseSpec
        }
        //Get request using data provider
        @Test(dataProvider = "petInfoProvider", priority = 2)
    public void getPetDetail(int id, String name, String status){
        Response response = given().spec(requestSpec).pathParam("petId", id).when().get("/{petId}");
            // Print response
            System.out.println(response.asPrettyString());
            // Assertions
            response.then()
                    .spec(responseSpec) // Use responseSpec
                    .body("name", equalTo(name),"status", equalTo("alive")); // Additional Assertion

        }
        //Delete request using data provider
    @Test(dataProvider = "petInfoProvider", priority = 3)
    public void deletePets(int id, String name, String status){
        Response response = given().spec(requestSpec).pathParam("petId", id).when().delete("/{petId}");
        // Assertions
        response.then().body("code", equalTo(200));
    }


}
