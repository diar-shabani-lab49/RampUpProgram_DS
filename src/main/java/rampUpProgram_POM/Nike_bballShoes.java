package rampUpProgram_POM;

import annotationFolder.nike_annotation;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Nike_bballShoes extends nike_annotation {

    ExtentTest logger;
    public Nike_bballShoes()
    {
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
                    logger.log(LogStatus.PASS,"successfully clicked " + shoe);
                    break;
                }
            }
        } catch (Exception error) {
            System.out.println("Unable to click on " + shoe);
            logger.log(LogStatus.FAIL, "unable to click " + shoe);
        }
    }

    public void verifyTitle(String title)
    {
        String expectedTitle=title;
        if(driver.getTitle().equals(expectedTitle))
            logger.log(LogStatus.PASS,"actual title: "+ driver.getTitle() +", matches expected title: "+expectedTitle);
        else
            logger.log(LogStatus.FAIL,"actual title: "+ driver.getTitle() +", doesn't match expected title: "+expectedTitle);
    }



}
