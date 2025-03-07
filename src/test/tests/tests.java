package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.PingAuthPage;
import steps.HomepageSteps;
import steps.PingAuthSteps;
import utils.User;

import java.time.Duration;


public class tests {

    @Test(description = "This is my first test")
    public void test1() {
//        System.setProperty("webdriver.chrome.driver", "/Users/marko.delgadillo/KW-Automation-Practice/automation-training/src/test/drivers/chromedriver");
        WebDriver driver;

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        Homepage homepage = new Homepage(driver);
        PingAuthPage pingAuthPage = new PingAuthPage(driver);
        HomepageSteps homepageSteps = new HomepageSteps(driver);
        PingAuthSteps pingAuthSteps = new PingAuthSteps(driver);

        // Test Case: Valid Login

        try {
            // Steps
            homepageSteps.navigateToHomepage();
            wait.until(ExpectedConditions.visibilityOf(homepage.logInButton));
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            homepageSteps.clickLogIn();
            wait.until(ExpectedConditions.visibilityOf(pingAuthPage.loginSubmitButton));
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            if (pingAuthSteps.isUrlContains("https://auth.pingone.com/")) {
                System.out.println("User is in Ping Auth page.");
                pingAuthSteps.inputEmail(User.VALID_EMAIL);
                pingAuthSteps.inputPassword(User.VALID_PASSWORD);
                pingAuthSteps.clickLogIn();
            } else {
                System.out.println("User is NOT in the Ping Auth page.");
            }

            wait.until(ExpectedConditions.visibilityOf(homepage.userInitials));
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            homepageSteps.validateUserLoggedIn();


            System.out.println("Tests Completed Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}