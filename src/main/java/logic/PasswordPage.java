package logic;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class PasswordPage {

    private final String VALID_PASSWORD = "+z9}m:^5V^j+XFh";
    private final String INVALID_PASSWORD = "qwerty12345";

    private SelenideElement passwordField = $x("//input[@id='ap_password']");
    private SelenideElement signInButton = $x("//input[@id='signInSubmit']");
    private SelenideElement errorMessage = $x("//span[@class='a-list-item']");

    public void enterValidPassword() {
        passwordField.setValue(VALID_PASSWORD);
    }

    public void enterInvalidPassword() {
        passwordField.setValue(INVALID_PASSWORD);
    }

    @Step("Enter invalid password and get an error message")
    public String getErrorMessageAfterInvalidPassword() {
        enterInvalidPassword();
        signInButton.shouldBe(Condition.visible).click();
        return errorMessage.getText();
    }


    @Step("Enter user password")
    public LoggedInPage clickSignInButton() {
        enterValidPassword();
        signInButton.shouldBe(Condition.visible).click();
        return new LoggedInPage();
    }
}