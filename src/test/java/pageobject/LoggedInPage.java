package pageobject;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Actions;

import static com.codeborne.selenide.Selenide.$x;

public class LoggedInPage {

    SelenideElement greetingText = $x("//span[@id='nav-link-accountList-nav-line-1']");
    SelenideElement accountArea = $x("//span[@class='nav-line-2 ']");
    SelenideElement logOutButton = $x("//span[normalize-space()='Sign Out']");

    public String saveGreetingText() {
        return greetingText.getText();
    }

    public LoggedOutPage clickLogoutButton() {
        Actions actions = new Actions(Selenide.webdriver().driver().getWebDriver());
        actions.moveToElement(accountArea).perform();
        logOutButton.click();
        return new LoggedOutPage();
    }
}