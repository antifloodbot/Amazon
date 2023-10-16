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
        Configuration.browserCapabilities.setCapability("chrome.switches", Arrays.asList("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:102.0) Gecko/20100101 Firefox/102.0"));
        Selenide.open(BASE_URL);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterTest
    public void close() {
        Selenide.closeWebDriver();
    }
}