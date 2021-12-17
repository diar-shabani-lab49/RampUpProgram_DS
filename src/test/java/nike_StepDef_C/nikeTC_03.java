package nike_StepDef_C;

import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pom_cucumber.base;
import pom_cucumber.bballShoes;
import pom_cucumber.shoe;
import reusuable_Methods.reusableMethods;

public class nikeTC_03 {

    public WebDriver driver = reusableMethods.getDriver();

    private shoe shoes= base.theShoe(driver);

    @Given("User is now on {string}")
    public void user_is_now_on(String string) {
        shoes.navigateToShoe();
    }
    @Then("User selects color wave option {int}")
    public void user_selects_color_wave_option(Integer int1) {
        shoes.clickColorWay(int1);
    }
    @Then("User selects size {string}")
    public void user_selects_size(String string) {
       shoes.selectSize();
    }
    @Then("User selects Add to Bag button")
    public void user_selects_add_to_bag_button() {
        shoes.addToBag();
    }
    @Then("User clicks checkout from View Bag popup")
    public void user_clicks_checkout_from_view_bag_popup() {
        shoes.viewCart();
    }
}
