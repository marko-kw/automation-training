package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.PingAuthPage;

public class PingAuthSteps{
    private PingAuthPage pingAuthPage;

    private WebDriver driver;


    public PingAuthSteps(WebDriver driver) {
//        pingAuthPage = new PingAuthPage(driver);
//        this.driver = driver;

        pingAuthPage = PageFactory.initElements(driver, PingAuthPage.class);
    }

    public boolean isUrlContains(String substring) {
        return driver.getCurrentUrl().contains(substring);
    }


    public void inputEmail(String email) {
        pingAuthPage.emailInput.sendKeys(email);
    }

    public void inputPassword(String password) {
        pingAuthPage.passwordInput.sendKeys(password);
    }

    public void clickLogIn() {
        pingAuthPage.loginSubmitButton.click();
    }
}
