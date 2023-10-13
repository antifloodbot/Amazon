package pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class LoggedOutPage {
    SelenideElement signInText = $x("//h1[normalize-space()='Sign in']");

    public String getTextAfterLogOut(){
        return signInText.getText();
    }
}
