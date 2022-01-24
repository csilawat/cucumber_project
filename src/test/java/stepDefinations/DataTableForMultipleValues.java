package stepDefinations;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.junit.runner.RunWith;

import java.util.List;

@CucumberOptions(features = "src/test/java/feature/DataTableForMultiplesValues.feature", glue = "stepDefinations")
public class DataTableForMultipleValues extends AbstractTestNGCucumberTests {

    @Given("^open signup page$")
    public void open_signup_page() throws Throwable {

    }

//    TODO  DataTable will store all details for Feature file as LIst of List
    @When("^click on signup button and fill following details$")
    public void click_on_signup_button_and_fill_following_details(DataTable table) throws Throwable {
   List<List<String>> dataTableList =  table.asLists();
   for (int i=0;i<dataTableList.size();i++) {

       System.out.println(i+" data printing start");
       for (String str : dataTableList.get(i)) {
           System.out.println(str);
       }
       System.out.println(i+" data completed");
   }
    }

    @Then("^click on create account button$")
    public void click_on_create_account_button() throws Throwable {
    }

    @And("^got success message$")
    public void got_success_message() throws Throwable {
    }


}
