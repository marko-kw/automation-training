package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.HomepageSteps;
import steps.PingAuthSteps;
import utils.User;

import java.time.Duration;

@test
public class Tests {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/marko.delgadillo/Documents/chromedriver-mac-arm64");

        WebDriver driver = new ChromeDriver();
        HomepageSteps homepageSteps = new HomepageSteps(driver);
        PingAuthSteps pingAuthSteps = new PingAuthSteps(driver);

        // Test Case: Valid Login

        try {
            // Steps
            homepageSteps.navigateToHomepage();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            homepageSteps.clickLogIn();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            if (pingAuthSteps.isUrlContains("https://auth.pingone.com/")) {
                System.out.println("User is in Ping Auth page.");
                pingAuthSteps.inputEmail(User.VALID_EMAIL);
                pingAuthSteps.inputPassword(User.VALID_PASSWORD);
                pingAuthSteps.clickLogin();
            } else {
                System.out.println("User is NOT in the Ping Auth page.");
            }

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            homepageSteps.validateUserLoggedIn();


            System.out.println("Tests Completed Successfully");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}