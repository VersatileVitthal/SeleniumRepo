package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/*Single scenario : tags="@Mobile"
 * Multiple scenario: tags= "@Mobile or @Bestseller"
 * To skip any scenario: "not @Mobile"
 * To skip multiple scenario: @ignore
 * To run all scenarios: @All
 * 
 * 
 * 
 * 
 * 
 */

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Amazon.feature",
                     glue="stepDef",
                     tags="@All",
                      publish=true)

public class AmazonRunner {

	
}
