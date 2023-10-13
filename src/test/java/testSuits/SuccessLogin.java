package testSuits;

import init.InitialDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.MainPage;

public class SuccessLogin extends InitialDriver {

    @Test
    public void successLogin() {
        String actualGreetingText = new MainPage()
                .clickLoginButton()
                .clickContinueButton()
                .clickSignInButton()
                .saveGreetingText();

        Assert.assertEquals(actualGreetingText, "Hello, Kosta");
    }
}
