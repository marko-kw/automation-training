package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.Homepage;

public class HomepageSteps {

    private Homepage homepage;

    private WebDriver driver;

    public HomepageSteps(WebDriver driver){

        homepage = PageFactory.initElements(driver, Homepage.class);
    }

    public void navigateToHomepage() {
        driver.get("https://agenta.consumer-dev.kw.com/");
    };

    public void clickLogIn() {
        homepage.logInButton.click();
    };

    public void validateUserLoggedIn() {
        homepage.userInitials.isDisplayed();

    };

}
