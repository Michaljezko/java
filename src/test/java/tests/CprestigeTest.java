package tests;

import base.TestBase;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CprestigeTest extends TestBase {
    @Before
    public void openPage() {
        open( "/prestige.php");
    }

    @Test
    public void testPrestige(){
        $(By.cssSelector("img")).click();
        $(By.cssSelector("img")).should(disappear).should(appear);
    }
}
