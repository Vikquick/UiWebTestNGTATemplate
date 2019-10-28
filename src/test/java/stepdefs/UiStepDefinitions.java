package stepdefs;

import com.codeborne.selenide.Condition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BBCNewsHomepage;
import pages.LocalWeatherpage;
import utilities.AttachmentsUtils;

import static com.codeborne.selenide.Selenide.*;

public class UiStepDefinitions {

    private BBCNewsHomepage bbcNewsHomepage = new BBCNewsHomepage();
    private LocalWeatherpage localWeatherpage = new LocalWeatherpage();
    private AttachmentsUtils attachmentsUtils = new AttachmentsUtils();

    @Given("^The user is in the BBC Homepage$")
    public void a_user_is_on_the_bbc_homepage() {
        open("https://www.bbc.com/news");
    }

    @When("The user selects Weather")
    public void theUserSelects() {
        bbcNewsHomepage.more.click();
        bbcNewsHomepage.weather.click();
        attachmentsUtils.makeScreenShot();
    }

    @Then("The local weather is displayed")
    public void theLocalWeatherIsDisplayed() {
        localWeatherpage.title.shouldBe(Condition.visible);
    }
}
