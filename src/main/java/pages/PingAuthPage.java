package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.By;

public class PingAuthPage {

    private By emailInput = By.cssSelector(".form #email");
    private By passwordInput = By.cssSelector(".form #password");
    private By loginSubmitButton = By.cssSelector(".form #submit-button");

    public PingAuthPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(loginSubmitButton).click();
    }

}

