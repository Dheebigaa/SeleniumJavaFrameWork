package irctcOptions;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@Test
@CucumberOptions(
        features = "src/test/java/irctcfeature/IRCTCInvalid.feature",
        glue = "invalidStep"
      //dryRun = true
//        monochrome = true
//        format =pretty
  //     tags = "@SmokeTest"
        )

public class IRCTCTestRunner extends AbstractTestNGCucumberTests {

}
