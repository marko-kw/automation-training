package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.By;

public class PingAuthPage {

    private WebDriver driver;

    public PingAuthPage(WebDriver driver) {
        this.driver = driver;
    };

    private By emailInput = By.cssSelector(".form #email");
    private By passwordInput = By.cssSelector(".form #password");
    private By loginSubmitButton = By.cssSelector(".form #submit-button");




};

