package stepDefinations;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before("@Reg")
    public void beforeTest(){
        System.out.println("before test from hook");
    }

    @After("@Reg")
    public void afterTest(){
        System.out.println("After test from Hooks");
    }
}
