package com.bookit.step_definitions;

import com.bookit.pages.SignInPage;
import com.bookit.utilities.ConfigurationReader;
import com.bookit.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UIStepDefs {

    SignInPage signInPage = new SignInPage();

    @Given("User logs in with {string} and {string}")
    public void user_logs_in_with_and(String string, String string2) {
        Driver.get().get(ConfigurationReader.get("url")); // Driver class line 34 already calls for the browser type
        signInPage.email.sendKeys("email");
        signInPage.password.sendKeys("password");
        signInPage.signInButton.click();
    }

    @When("User navigates to mySelf page")
    public void user_navigates_to_mySelf_page() {

    }

    @Then("User gets the UI info")
    public void user_gets_the_UI_info() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
