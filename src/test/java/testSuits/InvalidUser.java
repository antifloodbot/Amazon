package testSuits;

import init.InitialDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageobject.MainPage;

public class InvalidUser extends InitialDriver {

    @Test
    @Description("Test check validation for invalid user")
    @Owner("Kostia")
    public void invalidUser(){
        String actualErrorMessage = new MainPage()
                .clickLoginButton()
                .getErrorMessageForInvalidLogin();

        Assert.assertEquals(actualErrorMessage, "We cannot find an account with that email address");
    }
}