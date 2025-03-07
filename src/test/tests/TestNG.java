
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.PingAuthPage;
import steps.HomepageSteps;
import steps.PingAuthSteps;
import utils.User;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {

    private WebDriver driver;
    private Homepage homepage;
    private PingAuthPage pingAuthPage;
    private HomepageSteps homePageSteps;
    private PingAuthSteps pingAuthSteps;

    WebDriverWait wait;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        // Initialize step classes

        homepage = PageFactory.initElements(driver, Homepage.class);
        pingAuthPage = PageFactory.initElements(driver, PingAuthPage.class);

        homePageSteps = new HomepageSteps(driver);
        pingAuthSteps = new PingAuthSteps(driver);

        // Navigate to the homepage
        driver.get("https://agenta.consumer-dev.kw.com/");
        wait.until(ExpectedConditions.visibilityOf(homepage.logInButton));

        // Click login button
        homePageSteps.clickLogIn();
        wait.until(ExpectedConditions.visibilityOf(pingAuthPage.loginSubmitButton));
    }

    @Test(description = "This is my first test re-written using TestNG")
    public void test1() {
        String expectedURL = "https://auth.pingone.com/";

        // Validate URL
        Assert.assertTrue(driver.getCurrentUrl().toLowerCase().contains(expectedURL.toLowerCase()),
                "User is NOT in the Ping Auth page.");

        // Perform login
        pingAuthSteps.inputEmail(User.VALID_EMAIL);
        pingAuthSteps.inputPassword(User.VALID_PASSWORD);
        pingAuthSteps.clickLogIn();

        wait.until(ExpectedConditions.visibilityOf(homepage.userInitials));

        // Validate user is logged in
        homePageSteps.validateUserLoggedIn();

        System.out.println("Tests Completed Successfully");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
