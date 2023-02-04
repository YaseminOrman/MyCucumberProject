package stepdefinitions;

import io.cucumber.java.en.*;
import utilities.Driver;

public class DataTablesStepDefinitions {

    @Given("user is on {string}")
    public void user_is_on(String url) {
        Driver.getDriver().get(url);
    }
    @When("user clicks on New button")
    public void user_clicks_on_new_button() {

    }
    @When("user enters the first name in {string} input")
    public void user_enters_the_first_name_in_input(String string) {

    }
    @When("user enters the last name in {string} input")
    public void user_enters_the_last_name_in_input(String string) {

    }
    @When("user enters the position in {string} input")
    public void user_enters_the_position_in_input(String string) {

    }
    @When("user enters the office in {string} input")
    public void user_enters_the_office_in_input(String string) {

    }
    @When("user enters the extension in {string} input")
    public void user_enters_the_extension_in_input(String string) {

    }
    @When("user enters the start date in {string} input")
    public void user_enters_the_start_date_in_input(String string) {

    }
    @When("user enters the salary in {string} input")
    public void user_enters_the_salary_in_input(String string) {

    }
    @When("user clicks on create button")
    public void user_clicks_on_create_button() {
    }
    @When("user search for the first name {string}")
    public void user_search_for_the_first_name(String string) {

    }
    @Then("verify the name field contains the {string}")
    public void verify_the_name_field_contains_the(String string) {

    }

}
