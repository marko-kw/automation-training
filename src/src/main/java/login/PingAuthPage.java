package login;

// This is a PAGE class
// This is the page with the locators

import org.openqa.selenium.By;

public class PingAuthPage {

    public By emailInput = By.cssSelector("//*[@id='email']");
    public By pwInput = By.cssSelector("//*[@id='password']");

    private By pwInputFieldLocator = By.cssSelector("//*[@id='password']");

    private By pingLoginButtonLocator = By.cssSelector("(//a[contains(@class, 'ping-auth-login ')])[2]");
    // check for the other class in this element so that I don't use the index number
    //    PingAuthPage pingLogInButtonLocator = new PingAuthPage();
//        pingLogInButtonLocator.setPingLoginButtonLocator("//*[@id='submit-button']");

    private By x = By.cssSelector("//*[@id='email']");



    // locators go here <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


    public void setPwInputFieldLocator(String pwInputFieldLocator) {
        this.pwInputFieldLocator = pwInputFieldLocator;
    }

    public String getPwInputFieldLocator() {
        return this.pwInputFieldLocator;
    }

    public void setPingLoginButtonLocator(String pingLoginButtonLocator) {
        this.pingLoginButtonLocator = pingLoginButtonLocator;
    }

    public String getPingLoginButtonLocator() {
        return this.pingLoginButtonLocator;
    }

}
