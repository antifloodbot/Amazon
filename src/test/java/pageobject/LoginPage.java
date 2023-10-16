package pageobject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {

    private String VALID_USER = "kostia.talamaniuk@ukr.net";
    private String INVALID_USER = "kostia.talamaniuk@ukr.nett";

    private SelenideElement loginField = $x("//input[@id='ap_email']");
    private SelenideElement continueButton = $x("//input[@id='continue']");
    private SelenideElement errorMessage = $x("//ul[@class='a-unordered-list a-nostyle a-vertical a-spacing-none']//li");

    private void enterValidLogin() {
        loginField.setValue(VALID_USER);
    }

    private void enterInvalidLogin(){
        loginField.setValue(INVALID_USER);
    }

    @Step("Enter valid user email")
    public PasswordPage clickContinueButton() {
        enterValidLogin();
        continueButton.shouldBe(Condition.visible).click();
        return new PasswordPage();
    }

    @Step("Enter invalid user email and get error message")
    public String getErrorMessageForInvalidLogin() {
        enterInvalidLogin();
        continueButton.shouldBe(Condition.visible).click();
        return errorMessage.getText();
    }
}