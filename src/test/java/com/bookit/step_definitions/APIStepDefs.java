package com.bookit.step_definitions;

import com.bookit.utilities.BookITUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class APIStepDefs {

    String token;
    String emailGlobal;
    String passwordGlobal;

    @When("User logs in BookIT API using {string} and {string}")
    public void user_logs_in_BookIT_API_using_and(String email, String password) {

       token = BookITUtils.generateToken(email, password);
       emailGlobal = email;
       passwordGlobal = password;
    }

    @Then("User gets API information")
    public void user_gets_API_information() {



    }
}