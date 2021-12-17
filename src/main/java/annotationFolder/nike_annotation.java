package annotationFolder;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.lang.reflect.Method;

public class nike_annotation {

    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;

    @BeforeSuite
    //method to declare and define a chromedriver
    public void setUp() throws IOException{
        WebDriverManager.chromedriver().setup();//latest version of browser downloaded to local cache, can also do manual setup with desired chrome update

        //Setting chrome options so it can instantiate in fullscreen and incognito
        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-fullscreen");
        options.addArguments("incognito");

        //instantiating driver~
        driver = new ChromeDriver(options);

        //setting path for extentreport
        reports = new ExtentReports("src/main/extentReports/nike_ExtentReports/ExtentReportResults.html",true);
    }//end of setDriver Method

    @BeforeMethod
    public void getTestName(Method testname){
        logger=reports.startTest(testname.getName());//logs method name for html logger
    }

    @AfterMethod
    public void endTest(){
        reports.endTest(logger);
    }

    @AfterSuite
    public void quitSession() throws IOException{
        reports.flush();
        driver.quit();
    }






}
