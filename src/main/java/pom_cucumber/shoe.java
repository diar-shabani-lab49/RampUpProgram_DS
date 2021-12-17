package pom_cucumber;

import annotationFolder.nike_annotation;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class shoe {

    private WebDriver driver;
    ExtentTest logger;
    public shoe(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        logger = nike_annotation.logger;
    }

    @FindBy (xpath = "//*[@class='css-b8rwz8 tooltip-component-container']")
    List<WebElement> colorways;

    @FindBy (xpath = "//label[@class='css-xf3ahq']")
    List<WebElement> sizes;

    @FindBy (xpath = "//button[@aria-label='Add to Bag']")
    WebElement addtobag;

    @FindBy (xpath ="//button[@data-test='qa-cart-checkout']")
    WebElement checkoutBtn;

    public void clickColorWay(int num)
    {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfAllElements(colorways));
        try{
            colorways.get(num).click();
        } catch (Exception error) {
            System.out.println("Unable to click on " + num);
        }
    }

    public void navigateToShoe()
    {
        driver.navigate().to("https://www.nike.com/t/kyrie-7-basketball-shoes-nNMZ3b/DC9122-001");
    }

    public void selectSize()
    {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfAllElements(sizes));
        try{
            sizes.get(1).click();
        } catch (Exception error) {
            System.out.println("Unable to click on sizes");
        }
    }

    public void addToBag()
    {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(addtobag));
        try{
            addtobag.click();
        } catch (Exception error) {
            System.out.println("Unable to click on addtobag");
        }
    }

    public void viewCart()
    {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(checkoutBtn));
        try{
            checkoutBtn.click();
        } catch (Exception error) {
            System.out.println("Unable to click on addtobag");
        }
    }


}
