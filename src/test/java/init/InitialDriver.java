package init;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class InitialDriver {

    private final String BASE_URL = "https://amazon.com";

    @BeforeTest
    public void setupWebDriver(){
        Configuration.browser = "chrome";
        Selenide.open(BASE_URL);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterTest
    public void close() {
        Selenide.closeWebDriver();
    }
}