package signIn.negative;

import utils.InitialDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import logic.MainPage;
import utils.TestDataReader;

public class InvalidPassword extends InitialDriver {

    @Test
    @Description("Test check validation for invalid password")
    @Owner("Kostia")
    public void invalidPassword() {
        String actualErrorMessage = new MainPage()
                .clickLoginButton()
                .clickContinueButton()
                .getErrorMessageAfterInvalidPassword();

        String expectedErrorMessage = TestDataReader.get("INVALID_PASSWORD_MESSAGE");
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
}
