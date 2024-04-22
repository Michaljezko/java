package tests;

import base.TestBase;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;

public class FthereAndBackTest extends TestBase {
    @Before
    public void openPage() {
        open( "/waitforit.php");
    }
    //bla bla bla
}
