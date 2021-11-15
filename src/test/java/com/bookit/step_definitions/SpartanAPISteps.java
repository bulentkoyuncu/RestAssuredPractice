package com.bookit.step_definitions;

import com.POJO.Spartan;
import com.bookit.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class SpartanAPISteps {


    Response response;

    @When("User sends a GET request to spartan API with {string} id number")
    public void user_sends_a_GET_request_to_spartan_API_with_id_number(String idstring) {
        baseURI = ConfigurationReader.get("spartanURI");

        int intID = Integer.parseInt(idstring);

        response = given().accept(ContentType.JSON)
                .and().pathParam("id", intID)
                .when().get("/api/spartans/{id}")
                .then().statusCode(200)
                .log().all()
                .extract().response();


    }

    @Then("At the response body {string} name should be verfied")
    public void at_the_response_body_name_should_be_verfied(String name) {

        //De serialize --> JSON to POJO (java custom class)
        //2 different way to do this
        //1.using as() method
        //we convert json response to spartan object with the help of jackson
        //as() method uses jackson to de serialize(converting JSON to Java class)
        Spartan spartan15 = response.as(Spartan.class);
        System.out.println(spartan15);
        System.out.println("spartan15.getId() = " + spartan15.getSPARTANid());
        System.out.println("spartan15.getGender() = " + spartan15.getGender());
        Assert.assertEquals(name,spartan15.getName());


        //second way of deserialize json to java
        //2.using JsonPath to deserialize to custom class
        JsonPath jsonPath = response.jsonPath();

        Spartan s15 = jsonPath.getObject("", Spartan.class);

        System.out.println("With JASONPATH Method----------------------------");
        System.out.println(s15);
        System.out.println("s15.getName() = " + s15.getName());
        System.out.println("s15.getPhone() = " + s15.getPhone());
        Assert.assertEquals(name,s15.getName());

    }
}
