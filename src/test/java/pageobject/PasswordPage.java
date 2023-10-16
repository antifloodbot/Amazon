package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class PasswordPage {

    SelenideElement passwordField = $x("//input[@id='ap_password']");
    SelenideElement signInButton = $x("//input[@id='signInSubmit']");

    public void enterPassword() {
        passwordField.setValue("+z9}m:^5V^j+XFh");
    }

    @Step("Enter user password")
    public LoggedInPage clickSignInButton() {
        enterPassword();
        signInButton.shouldBe(Condition.visible).click();
        return new LoggedInPage();
    }
}