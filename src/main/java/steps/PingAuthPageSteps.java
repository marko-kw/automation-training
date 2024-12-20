package steps;

import org.openqa.selenium.WebDriver;
import pages.PingAuthPage;

public class PingAuthSteps{
    private PingAuthPage pingAuthPage;

    public PingAuthSteps(WebDriver driver) {
        pingAuthPage = new PingAuthSteps(driver);
    }

    public boolean isUrlContains(String substring) {
        return pingAuthPage.driver.getCurrentUrl().contains(substring);
    }

    public void inputEmail(String email) {
        pingAuthPage.enterEmail(email)
    }

    public void inputPassword(String password) {
        pingAuthPage.enterPassword(password);
    }

    public void clickLogIn {
        pingAuthPage.clickLogin();
    }
}
