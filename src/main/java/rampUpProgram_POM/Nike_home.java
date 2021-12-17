package rampUpProgram_POM;

import annotationFolder.nike_annotation;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nike_home extends nike_annotation {

    ExtentTest logger;
    public Nike_home()
    {
        PageFactory.initElements(driver,this);
        logger = nike_annotation.logger;
    }

    //menDropDown menu
    @FindBy(xpath = "//a[@aria-label='Men'][@role='menu']")
    WebElement menDropDown;

    //basketball shoes btn redirect
    @FindBy(xpath = "//a[@role='menuitem' and @aria-label='main-menu, Men, Shoes, Basketball']")
    WebElement basketballshoes_drpdown;

    //void method to navigate to nike home page
    public void navigateToHome() {
        driver.navigate().to("https://nike.com");
    }//end of navigateToHome method

    //method to hover over Men in order to view the dropdown UI
    public void mouseHoverMenu(){
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(menDropDown));
        Actions actions = new Actions(driver);
        try{
            System.out.println("hovering on menDropDown");
            actions.moveToElement(menDropDown).perform();
            logger.log(LogStatus.PASS,"hovering on menDropDown");
        }
        catch (Exception err){
            System.out.println("Unable to hover on menDropDown");
            logger.log(LogStatus.FAIL,"unable to hover on menDropDown"+"\n error msg+ err" );
        }
    }//end of mouseHoverMenu method

    //method to verify nike home page title
    public void verifyHomeTitle(String expected) throws InterruptedException {
        String expectedTitle=expected;
        if(driver.getTitle().equals(expectedTitle))
            logger.log(LogStatus.PASS,"actual title: "+ driver.getTitle() +", matches expected title: "+expectedTitle);
        else
            logger.log(LogStatus.FAIL,"actual title: "+ driver.getTitle() +", doesn't match expected title: "+expectedTitle);
        Thread.sleep(1000);
    }

    //method to click on mensBasketball which will redirect.
    public void clickMensBasketBall()
    {
        WebDriverWait wait = new WebDriverWait(driver,15);
        wait.until(ExpectedConditions.visibilityOf(basketballshoes_drpdown));
        try{
            System.out.println("clicking basketballshoes_drpdown");
            basketballshoes_drpdown.click();
            logger.log(LogStatus.PASS,"successfully clicked basketballshoes_drpdown");
        } catch (Exception error)
        {
            System.out.println("Unable to click on basketballshoes_drpdown");
            logger.log(LogStatus.FAIL,"unable to click basketballshoes_drpdown");
        }
    }



}
