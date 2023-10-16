package init;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.Random;

public class InitialDriver {

    private final String BASE_URL = "https://amazon.com";

    @BeforeClass
    public void setupWebDriver(){
        Configuration.browser = "chrome";
        Configuration.timeout = 10000;

        ChromeOptions options = getChromeOptions();
        Configuration.browserCapabilities = options;

        Selenide.open(BASE_URL);
        WebDriverRunner.getWebDriver().manage().window().maximize();
    }

    @AfterClass
    public void close() {
        Selenide.closeWebDriver();
    }

    public static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.addArguments("--disable-blink-features=AutomationControlled");
        chromeOptions.addArguments("--disable-features=AutomationControlled");
        chromeOptions.addArguments("--user-agent='" + getRandomUserAgent().userAgentName + "'");
        chromeOptions.addArguments("--ignore-certificate-errors");
        return chromeOptions;
    }
    public static UserAgentEnum getRandomUserAgent() {
        UserAgentEnum[] agents = UserAgentEnum.values();
        int randomIndex = new Random().nextInt(agents.length);
        return agents[randomIndex];
    }
}