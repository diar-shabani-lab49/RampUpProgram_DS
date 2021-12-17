package pom_cucumber;

import annotationFolder.nike_annotation;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class base {

    private WebDriver driver;

    public base(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }//constructor for base class

    public static home nikeHomePage(WebDriver driver){
        home home = new home(driver);
        return home;
    }//Obj constructor for home

    public static bballShoes nikeBBallShoes(WebDriver driver)
    {
        bballShoes bshoes = new bballShoes(driver);
        return bshoes;
    }//Obj constructor for bballShoes

    public static shoe theShoe(WebDriver driver)
    {
        shoe shoepg = new shoe(driver);
        return shoepg;
    }//Obj constructor for shoe

}
