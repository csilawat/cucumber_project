package stepDefinations.selenium;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class baseSeleniumTest {

    @Given("^open browser and got to web$")
    public void open_browser_and_got_to_web(){

        System.out.println("open_browser_and_got_to_web");
    }


    @And("^Close the browser$")
    public void close_the_browser(){
        System.out.println("close_the_browser");
    }
}
