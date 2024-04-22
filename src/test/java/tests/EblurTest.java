package tests;

import base.TestBase;
import com.codeborne.selenide.SelenideElement;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class EblurTest extends TestBase {

    @Before
    public void openPage() {
        open( "/waitforit.php");
    }

    @Test
    public void testBlure() {
        SelenideElement element = $(By.id("waitForBlur"));
        element.sendKeys("braňo ma nohy");
        executeJavaScript("arguments[0].dispatchEvent(new Event('blur'))", element);
    }

}
