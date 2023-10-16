package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    SelenideElement loginField = $x("//input[@id='ap_email']");
    SelenideElement continueButton = $x("//input[@id='continue']");

    public void enterLogin() {
        loginField.setValue("kostia.talamaniuk@ukr.net");
    }

    @Step("Enter user email")
    public PasswordPage clickContinueButton() {
        enterLogin();
        continueButton.shouldBe(Condition.visible).click();
        return new PasswordPage();
    }
}