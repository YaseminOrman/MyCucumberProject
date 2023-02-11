package stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;

import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {
    LoginPage loginPage = new LoginPage();
    HomePage homePage=new HomePage();

    @When("user enters customer email and customer password")
    public void user_enters_customer_email_and_customer_password(DataTable dataTable) {
   /*     //1.Get data as List of String
       List<String > customerData = dataTable.row(0);
        System.out.println("customerData = " + customerData);
       String email = dataTable.row(1).get(0);
       String password =dataTable.row(1).get(1);

       loginPage.username.sendKeys(email);
       loginPage.password.sendKeys(password);
       loginPage.loginButton.click();*/

       //2.Get data as Lis<Map<String,String>>
       List<Map<String,String>> customerData= dataTable.asMaps(String.class,String.class);
       for(Map<String,String> w:customerData){
           loginPage.username.sendKeys(w.get("username"));
           loginPage.password.sendKeys(w.get("password"));
           loginPage.loginButton.click();
       }


    }
    @Then("verify application login is successful")
    public void verify_application_login_is_successful() {
        Assert.assertTrue(homePage.userId.isDisplayed());
    }

    @Then("verify the next page url contains login keyword")
    public void verifyTheNextPageUrlContainsLoginKeyword() {
        Assert.assertTrue(false);
    }
}
