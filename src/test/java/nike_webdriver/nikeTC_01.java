package nike_webdriver;

import annotationFolder.nike_annotation;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import rampUpProgram_POM.Nike_base;
import rampUpProgram_POM.Nike_bballShoes;
import rampUpProgram_POM.Nike_home;

public class nikeTC_01 extends nike_annotation {


    //Scenario: As a user I want to navigate to mens basketball shoes so that I can select a shoe I want to purchase
    @Test
    public void goToShoes () throws InterruptedException  {
        Nike_home home = Nike_base.nikeHomePage();
        home.navigateToHome();//given Nike homepage
        home.mouseHoverMenu();//When hovering Men, UI for dropdown menu is visible
        home.clickMensBasketBall();//Then click on Mens basketball shoes

        //Then verify page redirect
        String expectedTitle="Men's Basketball Shoes. Nike.com";
        if(driver.getTitle().equals(expectedTitle))
            logger.log(LogStatus.PASS,"actual title: "+ driver.getTitle() +", matches expected title: "+expectedTitle);
        else
            logger.log(LogStatus.FAIL,"actual title: "+ driver.getTitle() +", doesn't match expected title: "+expectedTitle);
        Thread.sleep(1000);
    }

}
