package testSuits;

import init.InitialDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.MainPage;

public class InvalidPassword extends InitialDriver {

    @Test
    @Description("Test check validation for invalid password")
    @Owner("Kostia")
    public void invalidPassword() {
        String actualErrorMessage = new MainPage()
                .clickLoginButton()
                .clickContinueButton()
                .getErrorMessageAfterInvalidPassword();

        Assert.assertEquals(actualErrorMessage, "Your password is incorrect");
    }
}
