package nike_webdriver;

import annotationFolder.nike_annotation;
import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import rampUpProgram_POM.Nike_base;
import rampUpProgram_POM.Nike_bballShoes;

public class nikeTC_02 extends nike_annotation {

    @Test
    public void clickKyrie () throws InterruptedException {
        Nike_bballShoes ball = Nike_base.nikeBBallShoes();
        ball.selectShoe("Kyrie 7");
        Thread.sleep(1000);
    }

}
