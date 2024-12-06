package login;

// This is the page with the TESTS
// Still need the page with the STEPS (methods) that will reference the page class(es), for each page class
// EX: AgentPageSteps for AgentPage.java

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginAgentSite {

    public static void main(String[] args) {






        // System.out.println(marko.getUserEmail());

    }

    // Each method will be a test
    // each method will be called in Main method (above)
    // write the test methods below
    public static void navigateToHomepage(String [] args) {
        WebDriver driver = new ChromeDriver();

        AgentPage agentSite = new AgentPage();
        agentSite.setAgentSiteUrl("https://agenta.consumer-dev.kw.com/");
    }

    public static void clickTheLoginButton() {

    }

    public static void inputEmail() {
        PingAuthPage pingAuthPage = new PingAuthPage();
        driver.findElement(pingAuthPage.emailInput);
        User user = new User();
        user.setUserEmail("marko.delgadillo+qa1@kw.com");

    }

    public static void inputPassword() {
        user.setPw("blahblahblah1");
    }

    public static void clickPingLoginButton() {

    }

    public static void validateUserLoggedIn() {

    }
}
