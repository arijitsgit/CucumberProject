package stepdefinitions;

/*import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;*/

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import runners.TestRunner;


import static hooks.Hooks.driver;


public class stepdefs {

  //  WebDriver driver;



    @Given("^I launch the web browser$")
    public void i_launch_the_web_browser() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I launch the browser");
    }

    @Then("^I navigate to google search page$")
    public void i_navigate_to_google_search_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
      driver.get("https://www.google.com/");
    }

    @Then("^I navigate to google about page$")
    public void i_navigate_to_google_about_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[1]")).click();
    }

    @Then("I navigate to google store")
    public void i_navigate_to_google_store() {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/a[2]")).click();
    }

}
