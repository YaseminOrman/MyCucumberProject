package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class GridStepDefinitions {
    WebDriver driver;

    @Given("user is on the application_url using chrome")
    public void user_is_on_the_application_url_using_chrome() throws MalformedURLException {

        driver = new RemoteWebDriver(new URL("http://192.168.1.152:4444"),new ChromeOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://techproeducation.com/");
    }
    @Then("verify the page title contains {string}")
    public void verify_the_page_title_contains(String title) {

       Assert.assertTrue(driver.getTitle().contains(title));
    }
    @Then("close  application")
    public void close_application() {
       driver.quit();
    }


    @Given("user is on the application_url using firefox")
    public void userIsOnTheApplication_urlUsingFirefox() throws MalformedURLException {
        driver = new RemoteWebDriver(new URL("http://192.168.1.152:4444"),new FirefoxOptions());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://techproeducation.com/");
    }

}
