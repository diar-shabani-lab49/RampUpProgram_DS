package annotationFolder;

import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebDriver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class nikeMobile_Base {

    public static QAFExtendedWebDriver driver;

    @BeforeTest
    public void setApiDemoApp() throws InterruptedException, MalformedURLException {

        try {
            ChromeOptions options = new ChromeOptions();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
            capabilities.setCapability(MobileCapabilityType.VERSION, "11");
            capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "sdk_gphone_x86_arm");
            capabilities.setCapability(MobileCapabilityType.UDID, "emulator-5554");
            capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
            capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "60");
            capabilities.setCapability(ChromeOptions.CAPABILITY,options);
            capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            WebDriver tdriver = new AndroidDriver<AndroidElement>(url, capabilities);
            driver=new QAFExtendedWebDriver(tdriver);
        } catch(Exception exp){
            System.out.println("Cause is : "+ exp.getCause());
            System.out.println("Message is : "+ exp.getMessage());
            exp.printStackTrace();
        }
    }

    @AfterTest
    public void end()
    {
       // driver.close();
       // driver.quit();
    }
}
