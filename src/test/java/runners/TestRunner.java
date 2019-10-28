package runners;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.BeforeClass;
import utilities.AttachmentsUtils;
import utilities.SelenoidWebDriverProvider;


@CucumberOptions(features = "src/test/resources/features", glue = "stepdefs")
public class TestRunner extends AbstractTestNGCucumberTests {
    // private AttachmentsUtils attachmentsUtils = new AttachmentsUtils();

    @BeforeClass
    public static void setupTimeout() {
        //Configuration.remote = "http://localhost:4444/wd/hub";
        //  Configuration.browser = "chrome";
        Configuration.timeout = 10000;
        //Configuration.assertionMode = Configuration.assertionMode.SOFT;
        //JsonParseUtils jsonParse = new JsonParseUtils();
        //jsonParse.jsonParseUtils();
        //Configuration.baseUrl = jsonParse.baseUrl ;
        Configuration.browser = SelenoidWebDriverProvider.class.getName();
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(false));
    }

   /*
    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            attachmentsUtils.makeScreenShot();
        }
    }
   */
}
