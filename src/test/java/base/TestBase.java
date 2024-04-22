package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

    static {
        Configuration.baseUrl = "http://localhost/";
        Configuration.timeout = 5000;
        Configuration.pollingInterval = 100;
//        Configuration.headless = true;
        Configuration.holdBrowserOpen = true;
        Configuration.browser = "firefox";
//        Configuration.browserSize = "1820x1080";
        Configuration.clickViaJs = true;
        Configuration.reportsFolder = "src/test/resources/reportaze";
    }

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriverr.exe");
    }

    @After
    public void tearDown () {
    }
























//    public String getBASE_URL() {
//        return BASE_URL;
//    }
//    private final String BASE_URL = "http://localhost";
//    public WebDriver driver;
//
//    @Before
//    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriverr.exe");
//        driver = new ChromeDriver();
//        WebDriverRunner.setWebDriver(driver);
//        driver.manage().window().maximize();
//    }

//    @After
//    public void tearDown () {
//        if (this.driver != null) {
//            this.driver.quit();
//        }
//    }

}