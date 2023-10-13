package pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoggedInPage {

    SelenideElement greetingText = $x("//span[@id='nav-link-accountList-nav-line-1']");

    public String saveGreetingText() {
        return greetingText.getText();
    }
}
