package com.nuvolar.step_definitions;

import com.nuvolar.POJO.PetStore;
import com.nuvolar.utilities.ConfigurationReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;


import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class PetStoreStepDefs {
    String baseURL = ConfigurationReader.get("apiURL");
    @Given("verify search function with JsonPath {string}")
    public void verifySearchFunctionWithJsonPath(String statusWord) {
        Response response = given().accept(ContentType.JSON)
                .and().queryParam("status",statusWord)
                .when().get(baseURL +"/pet/findByStatus");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json");

        JsonPath jsonPath = response.jsonPath();

        assertEquals(statusWord,jsonPath.getString("status[0]"));
    }

    @Then("verify search function with Contains {string}")
    public void verifySearchFunctionWithContains(String statusWord) {
        Response response = given().accept(ContentType.JSON)
                .and().queryParam("status",statusWord)
                .when().get(baseURL +"/pet/findByStatus");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json");

        assertTrue(response.body().asString().contains(statusWord));
    }

    @And("verify search function with HamcrestMatchers {string}")
    public void verifySearchFunctionWithHamcrestMatchers(String statusWord) {
        given().accept(ContentType.JSON)
                .and().queryParam("status",statusWord)
        .when()
                .get(baseURL +"/pet/findByStatus")
        .then()
                .statusCode(200)
                .and().assertThat().contentType("application/json")
                .and().assertThat().body("status[0]",equalTo(statusWord));
    }

    @And("verify search function with Path {string}")
    public void verifySearchFunctionWithPath(String statusWord) {
        Response response = given().accept(ContentType.JSON)
                .and().queryParam("status",statusWord)
                .when().get(baseURL +"/pet/findByStatus");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json");

        String actualStatus = response.path("status[0]");

        assertEquals(statusWord,actualStatus);
    }

    @And("verify search function with JsonToJava {string}")
    public void verifySearchFunctionWithJsonToJava(String statusWord) {
        Response response = given().accept(ContentType.JSON)
                .and().queryParam("status",statusWord)
                .when().get(baseURL +"/pet/findByStatus");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json");

        List<Map<String,Object>> responseBody = response.body().as(List.class);

        assertEquals(responseBody.get(0).get("status"),statusWord);
    }

    @And("verify search function with POJO {string}")
    public void verifySearchFunctionWithPOJO(String statusWord) {
        Response response = given().accept(ContentType.JSON)
                .and().queryParam("status",statusWord)
                .when().get(baseURL +"/pet/findByStatus");

        assertEquals(response.statusCode(),200);
        assertEquals(response.contentType(),"application/json");

        List<PetStore> petStores = response.getBody().as(List.class);

    }
}
