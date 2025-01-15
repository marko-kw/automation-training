package steps;

import org.openqa.selenium.WebDriver;
import pages.PingAuthPage;

public class PingAuthSteps{
    private PingAuthPage pingAuthPage;

    private WebDriver driver;


    public PingAuthSteps(WebDriver driver) {
        pingAuthPage = new PingAuthPage(driver);
        this.driver = driver;
    }

    public boolean isUrlContains(String substring) {
        return driver.getCurrentUrl().contains(substring);
    }


    public void inputEmail(String email) {
        driver.findElement(pingAuthPage.emailInput).sendKeys(email);
    }

    public void inputPassword(String password) {
        driver.findElement(pingAuthPage.passwordInput).sendKeys(password);
    }

    public void clickLogIn() {
        driver.findElement(pingAuthPage.loginSubmitButton).click();
    }
}
