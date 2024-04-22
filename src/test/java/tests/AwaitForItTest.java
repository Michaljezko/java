package tests;

import base.TestBase;
import com.codeborne.selenide.Condition;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AwaitForItTest extends TestBase {

    @Before
    public void openPage() {
        open( "/waitforit.php");
    }

    @Test
    public void waitForInputText(){
        String expectedText = "dary !!!";
        $(By.id("startWaitForText")).click();
        $(By.id("waitForTextInput")).shouldHave(Condition.value(expectedText));
    }

    @Test
    public void waitForClass() {
        $(By.id("startWaitForProperty")).click();
        $(byId("waitForProperty")).shouldHave(cssClass("error"));
    }

    @Test
    public void waitForDisabled() {
        $(By.id("startWaitForProperty")).click();
        $(By.id("startWaitForProperty")).shouldNotBe(enabled);
    }

    @Test
    public void itShouldDisplayResponseTimeMessage() {
        $(By.id("startWaitForText")).click();
        $(By.cssSelector("div.current-wait-time")).shouldHave(text("Response time"));

    }
}
