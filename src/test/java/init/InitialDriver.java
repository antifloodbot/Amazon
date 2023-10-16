package init;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;

public class InitialDriver {

    private final String BASE_URL = "https://amazon.com";

    @BeforeTest
    public void setupWebDriver(){
        Configuration.browser = "chrome";
        Configuration.browserCapabilities.setCapability("chrome.switches", Arrays.asList("--user-agent=Chrome/51.0.2704.103"));
        Selenide.open(BASE_URL);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterTest
    public void close() {
        Selenide.closeWebDriver();
    }
}