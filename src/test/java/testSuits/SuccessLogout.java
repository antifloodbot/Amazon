package testSuits;

import init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.MainPage;

public class SuccessLogout extends InitialDriver {
    @Test
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