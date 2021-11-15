package com.bookit.step_definitions;

import com.bookit.utilities.DBUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class HR_DB_Steps {

    List<Map<String, Object>> queryResult;
    @When("User send a query {string} to {string} database")
    public void user_send_a_query_to_database(String query, String db) {
        queryResult = DBUtils.getQueryResultMap(query);
    }

    @Then("Result should be written to console")
    public void result_should_be_written_to_console() {
        for (Map<String, Object> map : queryResult) {
            System.out.println(map.toString());
        }
    }
}
