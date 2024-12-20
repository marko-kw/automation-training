package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.By;


public class Homepage {
    private WebDriver driver;

    private By logInButton = By.cssSelector(".Agent-page-header-end .ping-auth-login.AgentNavigationItem-text-decoration");
    private By userInitials = By.cssSelector(".Agent-page-header-end .avatar-initials")

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

        public void clickTheLoginButton() {
            driver.findElement(logInButton).click();

    }

        public void validateUserLoggedIn(WebDriver driver) {
            driver.findElement(userInitials).isDisplayed();
    }
}

