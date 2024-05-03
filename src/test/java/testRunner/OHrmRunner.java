package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/OHrmDataDriven.feature",
                 glue="stepDef",
                 publish=true)




public class OHrmRunner {

}
