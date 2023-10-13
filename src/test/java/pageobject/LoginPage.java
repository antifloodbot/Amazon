package pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    SelenideElement loginField = $x("//input[@id='ap_email']");
    SelenideElement continueButton = $x("//input[@id='continue']");

    public void enterLogin() {
        loginField.setValue("kostia.talamaniuk@ukr.net");
    }

    public PasswordPage clickContinueButton() {
        enterLogin();
        continueButton.click();
        return new PasswordPage();
    }
}