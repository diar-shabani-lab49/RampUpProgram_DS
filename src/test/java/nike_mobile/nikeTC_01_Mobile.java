package nike_mobile;

import annotationFolder.nikeMobile_Base;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class nikeTC_01_Mobile extends nikeMobile_Base {

    @Test
    public void testOne() throws InterruptedException {
        nikeMobile_Base.driver.get("https://www.nike.com/");
        try {
            QAFExtendedWebElement element = nikeMobile_Base.driver.findElement(By.xpath("//*[@id='MobileMenuButton']"));
            WebDriverWait wait = new WebDriverWait(driver,15);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
        }catch(Exception exp){
            System.out.println("Cause is : "+ exp.getCause());
            System.out.println("Message is : "+ exp.getMessage());
            exp.printStackTrace();
        }
        try {
            QAFExtendedWebElement element = (QAFExtendedWebElement) nikeMobile_Base.driver.findElements(By.xpath("//*[@class='pre-link-label headline-3']")).get(1);
            WebDriverWait wait = new WebDriverWait(driver,15);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
        }catch(Exception exp){
            System.out.println("Cause is : "+ exp.getCause());
            System.out.println("Message is : "+ exp.getMessage());
            exp.printStackTrace();
        }
        try {
            QAFExtendedWebElement element = (QAFExtendedWebElement) nikeMobile_Base.driver.findElements(By.xpath("//*[@class='pre-link-label pre-text-color-secondary']")).get(0);
            WebDriverWait wait = new WebDriverWait(driver,15);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
        }catch(Exception exp){
            System.out.println("Cause is : "+ exp.getCause());
            System.out.println("Message is : "+ exp.getMessage());
            exp.printStackTrace();
        }
        try {
            Thread.sleep(8000);
            QAFExtendedWebElement element = nikeMobile_Base.driver.findElement(By.xpath("//a[@aria-label='Category for Basketball']"));
            WebDriverWait wait = new WebDriverWait(driver,15);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
        }catch(Exception exp){
            System.out.println("Cause is : "+ exp.getCause());
            System.out.println("Message is : "+ exp.getMessage());
            exp.printStackTrace();

        }
        Thread.sleep(2000);
        try {
            QAFExtendedWebElement element = nikeMobile_Base.driver.findElement(By.xpath("//img[@alt='Kyrie 7 Basketball Shoes']"));
            WebDriverWait wait = new WebDriverWait(driver,15);
            wait.until(ExpectedConditions.visibilityOf(element));
            element.click();
        }catch(Exception exp){
            System.out.println("Cause is : "+ exp.getCause());
            System.out.println("Message is : "+ exp.getMessage());
            exp.printStackTrace();

        }
}
}
