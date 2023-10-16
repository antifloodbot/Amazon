package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    SelenideElement loginButton = $x("//span[@id='nav-link-accountList-nav-line-1']");

    @Step("Clicking on login button on the Main Page")
    public LoginPage clickLoginButton() {
        loginButton.click();
        return new LoginPage();
    }
}