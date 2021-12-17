package nike_StepDef_C;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pom_cucumber.base;
import pom_cucumber.bballShoes;
import pom_cucumber.home;
import rampUpProgram_POM.Nike_base;
import rampUpProgram_POM.Nike_bballShoes;
import rampUpProgram_POM.Nike_home;
import reusuable_Methods.reusableMethods;

public class nikeTC_01 {

    public WebDriver driver = reusableMethods.getDriver();

    private home homepg = base.nikeHomePage(driver);
    private bballShoes shoes=base.nikeBBallShoes(driver);


    @Given("User is on Nike homePage")
    public void user_is_on_nike_home_page() {
        homepg.navigateToHome();

    }
    @Then("page title should be {string}")
    public void page_title_should_be(String title) throws InterruptedException {
        homepg.verifyHomeTitle(title);
    }
    @When("User hovers {string} tab on NavBar")
    public void user_hovers_tab_on_nav_bar(String string) throws InterruptedException {
        homepg.mouseHoverMenu();
    }
    @Then("User should be able to click {string} under {string} section from {string} dropdown UI")
    public void user_clicks_under_section_from_dropdown_ui(String string, String string2, String string3) {
        homepg.clickMensBasketBall();
    }   
    @Then("User is redirected to {string}")
    public void user_is_redirected_to(String string) throws InterruptedException {
        shoes.verifyTitle(string);
    }
}
