package reusuable_Methods;

import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import com.relevantcodes.extentreports.ExtentReports;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class reusableMethods {


    public static WebDriver getDriver()
    {
        WebDriverManager.chromedriver().setup();//latest version of browser downloaded to local cache, can also do manual setup with desired chrome update

        ChromeOptions options=new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("incognito");
        WebDriver driver = new ChromeDriver(options);
        return driver;
    }

}
