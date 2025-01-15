package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Homepage {
    private WebDriver driver;

    public Homepage(WebDriver driver){
        this.driver = driver;
    };

    public By logInButton = By.cssSelector(".Agent-page-header-end .ping-auth-login.AgentNavigationItem-text-decoration");
    public By userInitials = By.cssSelector(".Agent-page-header-end .avatar-initials");

};

