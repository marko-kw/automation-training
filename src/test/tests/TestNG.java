
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import steps.HomepageSteps;
import steps.PingAuthSteps;
import utils.User;
import java.time.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG {

    private WebDriver driver;
    private HomepageSteps homePageSteps;
    private PingAuthSteps pingAuthSteps;

    @BeforeTest
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // Initialize step classes
        homePageSteps = new HomepageSteps(driver);
        pingAuthSteps = new PingAuthSteps(driver);

        // Navigate to the homepage
        driver.get("https://agenta.consumer-dev.kw.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // Click login button
        homePageSteps.clickLogIn();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
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

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

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
