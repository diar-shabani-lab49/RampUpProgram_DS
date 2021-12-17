package hookFolder;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.Before;
import io.cucumber.java.After;

import java.io.IOException;

public class nikeHook {
    public static WebDriver driver;
    public static ExtentReports reports;
    public static ExtentTest logger;

    @Before
    //method to declare and define a chromedriver
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();//latest version of browser downloaded to local cache, can also do manual setup with desired chrome update

        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        driver = new ChromeDriver(options);
    }

    @After
    public void quitSession() throws IOException{
        driver.quit();
    }



}
