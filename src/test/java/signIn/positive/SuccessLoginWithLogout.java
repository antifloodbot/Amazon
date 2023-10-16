package signIn.positive;

import utils.InitialDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import logic.MainPage;
import utils.TestDataReader;

public class SuccessLoginWithLogout extends InitialDriver {

    @Test
    @Description("Test check success logout")
    @Owner("Kostia")
    public void successLogout() {
        String actualLoggedOutText = new MainPage()
                .clickLoginButton()
                .clickContinueButton()
                .clickSignInButton()
                .clickLogoutButton()
                .getTextAfterLogOut();

        String expectedErrorMessage = TestDataReader.get("SUCCESS_LOGOUT_MESSAGE");
        Assert.assertEquals(actualLoggedOutText, expectedErrorMessage);
    }
}