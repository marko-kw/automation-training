package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PingAuthPage {

    private WebDriver driver;

    public PingAuthPage(WebDriver driver) {
        this.driver = driver;
    };

    @FindBy(css =".form #email")
    public WebElement emailInput;

    @FindBy(css = ".form #password")
    public WebElement passwordInput;

    @FindBy(css = ".form #submit-button")
    public WebElement loginSubmitButton;

};

