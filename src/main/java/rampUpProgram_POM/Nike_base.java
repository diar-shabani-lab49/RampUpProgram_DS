package rampUpProgram_POM;

import annotationFolder.nike_annotation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Nike_base extends nike_annotation {

    public Nike_base() {
        PageFactory.initElements(driver,this);
    }//constructor for base class

    public static Nike_home nikeHomePage(){
        Nike_home home = new Nike_home();
        return home;
    }//Obj constructor for nikeHomePage

    public static Nike_bballShoes nikeBBallShoes()
    {
        Nike_bballShoes bshoes = new Nike_bballShoes();
        return bshoes;
    }

}
