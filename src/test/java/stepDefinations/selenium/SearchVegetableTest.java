package stepDefinations.selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchVegetableTest {

    @When("^search for (.+) vegetable$")
    public void search_for_vegetable(String vegetable){

        System.out.println("search_for_vegetable_;"+vegetable);
    }

    @Then("^verify vegetable (.+) is showing$")
    public void verify_vegetable_is_showing(String vegetable) {
        System.out.println("verify_vegetable_is_showing-: "+vegetable);

    }

    @And("^click on add quantity$")
    public void click_on_add_quantity(){

        System.out.println("click_on_add_quantity");
    }
}
