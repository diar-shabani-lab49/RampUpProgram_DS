package pom_cucumber;

import annotationFolder.nike_annotation;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class bballShoes{

    private WebDriver driver;
    ExtentTest logger;
    public bballShoes(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
        logger = nike_annotation.logger;
    }

    //productGrid on the basketball shoes Page
    @FindBy(xpath = "//*[@class='product-card__body']")
    List<WebElement> productCards;

    public void navigateToBballShoes() {
        driver.navigate().to("https://www.nike.com/w/mens-basketball-shoes-3glsmznik1zy7ok");
    }

    public void selectShoe(String shoe)
    {
        System.out.println(productCards.size());
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOfAllElements(productCards));
        try{
            for(WebElement card: productCards)
            {
                if(card.getText().contains(shoe))
                {
                    System.out.println("clicking "+ shoe);
                    card.click();
                    break;
                }
            }
        } catch (Exception error) {
            System.out.println("Unable to click on " + shoe);
        }
    }

    public void verifyTitle(String title)
    {
        String expectedTitle=title;
        if(driver.getTitle().equals(expectedTitle))
            System.out.println("expectedTitle ("+expectedTitle+") matches driver title ("+driver.getTitle());
        else
            System.out.println("expectedTitle ("+expectedTitle+") does not match driver title ("+driver.getTitle()+")");
    }



}
