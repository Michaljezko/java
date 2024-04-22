package tests;

import base.TestBase;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BwaitForMinionsTest extends TestBase {
    @Before
    public void openPage() {
        open( "/minions.php");
    }

    @Test
    public void waitForMinions(){
       $(By.cssSelector("input")).sendKeys("7");
       $(By.cssSelector("button")).click();
       $(By.className("minions")).findAll("li")
                .shouldHave(size(7));
    }
}
