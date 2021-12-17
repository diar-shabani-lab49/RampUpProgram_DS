package nike_runner_C;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src\\test\\java\\nike_Features_C"},
        glue ={"nike_StepDef_C" , "hookFolder"}
)


public class testRunner {
}
