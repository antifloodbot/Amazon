package signIn.negative;

import utils.InitialDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import logic.MainPage;
import utils.TestDataReader;

public class InvalidUser extends InitialDriver {

    @Test
    @Description("Test check validation for invalid user")
    @Owner("Kostia")
    public void invalidUser(){
        String actualErrorMessage = new MainPage()
                .clickLoginButton()
                .getErrorMessageForInvalidLogin();

        String expectedErrorMessage = TestDataReader.get("INVALID_USER_MESSAGE");
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage);
    }
}