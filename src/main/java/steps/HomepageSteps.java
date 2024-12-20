package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Homepage;

public class HomepageSteps {

    private Homepage homepage;

    public HomepageSteps(WebDriver driver){
        homepage = new Homepage(driver);
    }
    public void navigateToHomepage() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://agenta.consumer-dev.kw.com/");
    }

    public void clickLogIn() {
        homepage.clickTheLoginButton();
    }

    public void validateUserLoggedIn {
        homepage.validateUserLoggedIn();

    }

}
