package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Homepage;

public class HomepageSteps {

    private Homepage homepage;

    private WebDriver driver;

    public HomepageSteps(WebDriver driver){
        homepage = new Homepage(driver);
        this.driver = driver;
    }

    public void navigateToHomepage() {
        driver.get("https://agenta.consumer-dev.kw.com/");
    };

    public void clickLogIn() {
        driver.findElement(homepage.logInButton).click();
    };

    public void validateUserLoggedIn() {
        driver.findElement(homepage.userInitials).isDisplayed();

    };

}
