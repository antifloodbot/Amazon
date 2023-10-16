package testSuits;

import init.InitialDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.MainPage;

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

        Assert.assertEquals(actualGreetingText, "Hello, Kosta");
    }
}