package utils;

import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ChromeOptionsProvider {

    private static final List<String> USER_AGENTS = Arrays.asList(
            "Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.97 Safari/537.36 OPR/65.0.3467.48",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/605.1.15 (KHTML, like Gecko) Version/13.0.3 Safari/605.1.15",
            "Mozilla/5.0 (Windows NT 10.0; WOW64; Trident/7.0; rv:11.0) like Gecko",
            "Mozilla/5.0 (Windows NT 10.0; WOW64; rv:70.0) Gecko/20100101 Firefox/70.0",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10.14; rv:70.0) Gecko/20100101 Firefox/70.0",
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_6) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/118.0.0.0 Safari/537.36"
    );

    private static final List<String> CHROME_ARGUMENTS = Arrays.asList(
            "--no-sandbox",
            "--disable-dev-shm-usage",
            "--disable-blink-features=AutomationControlled",
            "--disable-features=AutomationControlled",
            "--ignore-certificate-errors"
    );

    private static String getRandomUserAgent() {
        int randomIndex = new Random().nextInt(USER_AGENTS.size());
        return USER_AGENTS.get(randomIndex);
    }

    public static ChromeOptions getChromeOptions() {
        ChromeOptions chromeOptions = new ChromeOptions();
        for (String arg : CHROME_ARGUMENTS) {
            chromeOptions.addArguments(arg);
        }
        chromeOptions.addArguments("--user-agent=" + getRandomUserAgent());
        return chromeOptions;
    }
}
