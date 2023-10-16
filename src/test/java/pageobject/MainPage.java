package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    SelenideElement loginButton = $x("//span[@id='nav-link-accountList-nav-line-1']");

    @Step("Open login form")
    public LoginPage clickLoginButton() {
        loginButton.shouldBe(Condition.visible).click();
        return new LoginPage();
    }
}