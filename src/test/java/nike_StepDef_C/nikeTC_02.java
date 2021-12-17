package nike_StepDef_C;

import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pom_cucumber.base;
import pom_cucumber.bballShoes;
import pom_cucumber.home;
import reusuable_Methods.reusableMethods;

public class nikeTC_02 {

    public WebDriver driver = reusableMethods.getDriver();

    private bballShoes shoes=base.nikeBBallShoes(driver);

    @Given("User is on {string}")
    public void user_is_on(String string) {
        shoes.navigateToBballShoes();
    }
    @Then("User clicks {string} shoes")
    public void user_clicks_shoes(String string) {
        shoes.selectShoe(string);
    }
}
