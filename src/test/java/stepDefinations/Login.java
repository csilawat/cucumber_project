package stepDefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

    @Given("open Login window")
    public void open_login_window() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Open Login Window");
    }
    @When("enter valid user name and passwords")
    public void enter_valid_user_name_and_passwords() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("enter valid user name and passwords");
    }
    @Then("will land on Home page of Applications")
    public void will_land_on_home_page_of_applications() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("will land on Home page of Applications");
    }


    @When("enter valid user {string} and passwords {string}")
    public void enter_valid_user_and_passwords(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("username :-"+string+", password :-"+string2);
    }
    @Then("your name will be display as {string}")
    public void your_name_will_be_display_as(String string) {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("your name in Feature file is :-"+string);
    }


}
