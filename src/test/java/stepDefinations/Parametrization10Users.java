package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/parameterizations.feature",glue = "stepDefinations")
public class Parametrization10Users extends AbstractTestNGCucumberTests {

// TODO Reusing this method from other steps files
   /* @Given("^open Login window$")
    public void open_login_window() throws Throwable {
    }*/

    @When("^login with username (.+) and password (.+)$")
    public void login_with_username_and_password(String username, String password) throws Throwable {
        System.out.println("username :-"+username+" and password :- "+password);
    }
    @Then("able to login")
    public void able_to_login() {
        System.out.println("able to login ");
    }

    // TODO Reusing this method from other steps files
/*    @And("^will land on Home page of Applications$")
    public void will_land_on_home_page_of_applications() throws Throwable {
        System.out.println("home page of applications opened");
    }*/


}
