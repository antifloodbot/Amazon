package testSuits;

import init.InitialDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.MainPage;

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

        Assert.assertEquals(actualLoggedOutText, "Sign in");
    }
}