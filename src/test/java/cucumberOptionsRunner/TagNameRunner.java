package cucumberOptionsRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/feature/tagName.feature", glue = "stepDefinations",
        tags = "@Reg and @Smoke")
/*
 TODO* use tags = "@Smoke or @Reg or @Sanity" to run all test with those tag
 TODO* use tags = "@Smoke" to run all test with @Smoke tag
 TODO* use tags = "@Smoke and @Reg" to run all test which contain both tag like (@Smoke #Reg)
 TODO* use tags = " not @Smoke" to  not run all test with @Smoke tag (skip @Smoke tag test case )
  */
public class TagNameRunner extends AbstractTestNGCucumberTests {
}
