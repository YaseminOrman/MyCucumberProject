package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinition {
     GooglePage googlePage=new GooglePage();
    @Given("user is on the google home page")
    public void user_is_on_the_google_home_page() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));
    }
    @When("user search for iPhone")
    public void user_search_for_i_phone() {
       googlePage.searchBox.sendKeys("iPhone"+ Keys.ENTER);
    }
    @Then("verify page title contains iPhone")
    public void verify_page_title_contains_i_phone() {
       Assert.assertTrue(Driver.getDriver().getTitle().contains("iPhone"));
    }
    @Then("close the page")
    public void close_the_page() {
        Driver.closeDriver();
    }
    @When("user search for TeaPot")
    public void user_search_for_tea_pot() {
       googlePage.searchBox.sendKeys("TeaPot"+Keys.ENTER);
    }
    @Then("verify page title contains TeaPot")
    public void verify_page_title_contains_tea_pot() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("TeaPot"));
    }




}
