package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PingAuthPage {

    private WebDriver driver;

    public PingAuthPage(WebDriver driver) {
        this.driver = driver;
    };

    public By emailInput = By.cssSelector(".form #email");
    public By passwordInput = By.cssSelector(".form #password");
    public By loginSubmitButton = By.cssSelector(".form #submit-button");


};

