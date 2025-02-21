package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
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
                pingAuthSteps.clickLogIn();
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