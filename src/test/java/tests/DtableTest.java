package tests;

import base.TestBase;
import com.codeborne.selenide.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.codeborne.selenide.CollectionCondition.exactTexts;
import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class DtableTest extends TestBase {
    @Before
    public void openPage() {
        open( "/tabulka.php");
    }



    private Object highLight(SelenideElement row) {
        return ((JavascriptExecutor) this).executeScript("arguments[0].style.border='3px solid red'", row);
    }

    @Test
    public void itShouldHaveFlorian() {
        $x("//table").highlight(border("3px solid red"))
                            .findAll("td")
                            .shouldHave(sizeGreaterThan(1))
                            .filterBy(matchText("^Florian.*"))
                            .forEach(selenideElement -> System.out.println(selenideElement.getText().contains("Florian")));;
    }
    private HighlightOptions border(String s) {
        return null;
    }

    @Test
    public void itShouldScrollToLastElement() {
        $("table > tbody > tr:last-child").highlight();
    }

    @Test
    public void itShouldScrollToLastElementa() {
        $("tbody:nth-child(2) > tr:nth-child(23) > td:nth-child(2)").highlight();
    }


    @Test
    public void testFlorian() {
        $("table")
                .findAll("td")
                .shouldHave(sizeGreaterThan(1))
                .filterBy(matchText("^Florian.*"))
                .forEach(selenideElement -> System.out.println(selenideElement.getText().contains("Florian")));;
    }
    @Test
    public void testFloriang() {
//        $("table")
//                .findAll("td")
//                .shouldHave(sizeGreaterThan(1))
//                .forEach(selenideElement -> System.out.println(selenideElement.getText().contains("Florian")));
        $x("//table//td[text()='Florian']").highlight()
                .findAll(By.xpath("//table//td[text()='Florian']"));
    }


//       $(By.cssSelector("table")).shouldHave(text("Florian"));

//table//td[text()='Florian']


    @Test
    public void testFloriangg() {
        $x("//table//td[text()='Florian']").highlight()
                .findAll(By.xpath("//table//td[text()='Florian']"));
    }

    @Test
    public void testFlorianhh() {
    $("tr")
            .highlight();
//            .findAll("td[2]")
//            .shouldHave(sizeGreaterThan(1))
//            .filterBy(matchText("^Florian.*"))
//            .forEach(selenideElement -> System.out.println(selenideElement.getText()));
    }

    @Test
    public void itShouldHaveFloriann() {
        ElementsCollection rows = $$("#table tbody tr");
        $x("//table//td[text()='Florian']").highlight();

        for (SelenideElement row : rows) {
            if (row.getText().contains("Florian")){
                highLight(row);
//                row.shouldHave(Condition.attribute("style", "border: 3px solid red;"));
            }
        }

    }

    @Test
    public void itShouldHaveFloriannn() {
        ElementsCollection rows = $$("#table tbody tr");
        $x("//table//td[text()='Florian']").highlight();

        for (SelenideElement row : rows) {
            if (row.getText().contains("Florian")){
                row.highlight();
            }
        }
    }

    @Test
    public void itShouldHaveFloriannnn() {
        ElementsCollection rows = $$("#table tbody tr");
        $x("//table//td[text()='Florian']").highlight();

        for (SelenideElement row : rows) {
            if (row.getText().contains("Florian")){
                row.shouldBe(visible).scrollTo().highlight();
            }
        }
    }

    @Test
    public void itShouldHaveFloriannm() {
        ElementsCollection rows = $$("#table tbody tr");
        $x("//table//td[text()='Florian']").scrollTo().highlight();

////        for (SelenideElement row : rows) {
////            if (row.getText().contains("Florian")){
////                row.scrollTo().highlight();
////            }
//        }
    }


    @Test
    public void tableTestAi() {
        ElementsCollection rows = $$("#table tbody tr");
        
        for (SelenideElement row : rows) {
            if (row.getText().contains("Florian")){
//                highLight(row);
                row.shouldHave(Condition.attribute("style", "border: 3px solid red;"));
            }
        }
    }

    @Test
    public void tableTestFlorian() {
        ElementsCollection rows = $$("#table tbody tr");

        for (SelenideElement row : rows) {
            if (row.getText().contains("Florian")){
                String script = "arguments[0].setAttribute('class', 'highlight')";
                ((JavascriptExecutor) getWebDriver()).executeScript(script, row);
                row.shouldHave(Condition.cssClass("highlight"));
            }
        }
    }

    @Test
    public void tableTest() {
        ElementsCollection rows = $$("#table tbody tr");

        for (SelenideElement row : rows) {
            if (row.getText().contains("Florian")){
                String script = "arguments[0].setAttribute('class', 'highlight')";
                ((JavascriptExecutor) getWebDriver()).executeScript(script, row);
                row.shouldHave(Condition.cssClass("highlight"));
            }
        }
    }

    //    @Test
//    public void tableTest() {
//        $$(By.xpath("//table//tbody//tr"));
//
//        for (WebElement row : rows) {
//            if (row.getText().contains("Florian")){
//                ((JavascriptExecutor) driver).executeScript("arguments[0].style.border='3px solid red'", row);
//            }
//        }
//    }

    @Test
    public void LastElement() {
        $("table > tbody > tr:last-child").scrollIntoView(true);
    }

    ElementsCollection getRows() {
        return $$("table tbody tr");
    }

    private String getElementBorder(WebElement elem)
    {
        return (String) ((JavascriptExecutor)this).executeScript("return arguments[0].style.border", elem);
    }

}