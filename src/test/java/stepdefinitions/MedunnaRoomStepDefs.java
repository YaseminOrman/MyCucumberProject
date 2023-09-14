package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaHomePage;
import pages.MedunnaRoomPage;
import utilities.JSUtils;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class MedunnaRoomStepDefs {
    MedunnaHomePage medunnaHomePage = new MedunnaHomePage();
    MedunnaRoomPage medunnaRoomPage = new MedunnaRoomPage();
    @When("click on Items&Titles")
    public void click_on_items_titles() {
        ReusableMethods.waitFor(3);
    medunnaHomePage.itemsAndTitles.click();
    }
    @When("click on Room option")
    public void click_on_room_option() {
        ReusableMethods.waitFor(2);
     medunnaHomePage.roomOption.click();
    }
    @When("click on Create a new room button")
    public void click_on_create_a_new_room_button() {
        ReusableMethods.waitFor(2);
     medunnaRoomPage.createANewRoomButton.click();
    }
    @And("enter {string} room number input")
    public void enterRoomNumberInput(String roomNumber) {
        ReusableMethods.waitFor(2);
    medunnaRoomPage.roomNumberInput.sendKeys(roomNumber);
    }
    @When("select Suite option Room Type dropdown")
    public void select_suite_option_room_type_dropdown() {
        ReusableMethods.waitFor(2);
         new Select(medunnaRoomPage.roomTypeDropDown).selectByVisibleText("SUITE");
    }
    @When("click on Status checkbox")
    public void click_on_status_checkbox() {
        ReusableMethods.waitFor(1);
     medunnaRoomPage.statusCheckbox.click();
    }
    @When("enter {string} in Price input")
    public void enter_in_price_input(String price) {
        ReusableMethods.waitFor(1);
    medunnaRoomPage.priceInput.sendKeys(price);
    }
    @When("enter {string} in Description input")
    public void enter_in_description_input(String description) {
        ReusableMethods.waitFor(1);
    medunnaRoomPage.descriptionInput.sendKeys(description);
    }
    @When("click on Save button")
    public void click_on_save_button() {
        ReusableMethods.waitFor(2);
        JSUtils.clickElementByJS(medunnaRoomPage.saveSubmitButton);
    }
    @When("click on Created Date")
    public void click_on_created_date() {
        ReusableMethods.waitFor(3);
     medunnaRoomPage.createDate.click();
    }
    @Then("assert that room is created via {string}")
    public void assert_that_room_is_created_via(String roomNumber) {
        ReusableMethods.waitFor(3);
        int counter =0;
     for(WebElement w : medunnaRoomPage.roomNumberList){
         System.out.println(w.getText());
         if(w.getText().equals(roomNumber)){
             counter++;
             assertTrue(true);
             break;
         }
     }
        if(counter==0){
            assertTrue(false);
        }
    }


}
