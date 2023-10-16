package signIn.positive;

import utils.InitialDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import logic.MainPage;
import utils.TestDataReader;

public class SuccessLogin extends InitialDriver {

    @Test
    @Description("Test check success login")
    @Owner("Kostia")
    public void successLogin() {
        String actualGreetingText = new MainPage()
                .clickLoginButton()
                .clickContinueButton()
                .clickSignInButton()
                .saveGreetingText();

        String expectedErrorMessage = TestDataReader.get("SUCCESS_LOGIN_MESSAGE");
        Assert.assertEquals(actualGreetingText, expectedErrorMessage);
    }
}