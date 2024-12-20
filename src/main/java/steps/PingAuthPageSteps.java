package steps;

import org.openqa.selenium.WebDriver;
import pages.PingAuthPage;

public class PingAuthSteps{
    private PingAuthPage pingAuthPage;

    private WebDriver driver;


    public PingAuthSteps(WebDriver driver) {
        this.driver = driver;
        pingAuthPage = new PingAuthSteps(driver);
    }

    public boolean isUrlContains(String substring) {
        return pingAuthPage.driver.getCurrentUrl().contains(substring);
    }


    public void inputEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogIn {
        driver.findElement(loginSubmitButton).click();
    }
}
