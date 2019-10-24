package utilities;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class AttachmentsUtils {

    public void makeScreenShot() {
        byte[] screenShot = ((TakesScreenshot) WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
        Allure.getLifecycle().addAttachment("Page screenshot", "image/png", "png", screenShot);
    }
}
