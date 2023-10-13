package pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    SelenideElement loginButton = $x("//span[@id='nav-link-accountList-nav-line-1']");

    public LoginPage clickLoginButton() {
        loginButton.click();
        return new LoginPage();
    }
}