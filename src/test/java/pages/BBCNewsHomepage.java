package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BBCNewsHomepage {

    public SelenideElement more = $(By.linkText("More"));
    public  SelenideElement weather = $(By.linkText("Weather"));
}
