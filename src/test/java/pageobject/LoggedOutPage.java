package pageobject;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$x;

public class LoggedOutPage {
    SelenideElement signInText = $x("//h1[normalize-space()='Sign in']");

    @Step("Getting text after log out")
    public String getTextAfterLogOut(){
        return signInText.getText();
    }
}