package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends BasePage {

    @FindBy(xpath = "//input[@name='Username']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@name='Password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@type='submit']")
    private WebElement signInButton;

    @FindBy(xpath = "//li[contains(text(),'Sorry, we cannot log you in right now')]")
    private WebElement loginErrorMessage;

    @FindBy(xpath = "//a[contains(text(),'New to ASOS?')]")
    private WebElement newToAsosHeader;

    @FindBy(xpath = "//input[@aria-label='Join ASOS']")
    private WebElement joinAsosButton;

    @FindBy(xpath = "//span[@id='Email-error']")
    private WebElement emailErrorAlert;

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    public void enterEmail(final String emailText) {
        emailField.clear();
        emailField.sendKeys(emailText);
    }

    public void enterPassword(final String passwordText) {
        passwordField.clear();
        passwordField.sendKeys(passwordText);
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public String getTextOfLoginErrorMessage() {
        return loginErrorMessage.getText();
    }

    public void clickNewToAsosHeader() {
        newToAsosHeader.click();
    }

    public void clickJoinASosButton() {
        joinAsosButton.click();
    }

    public String getTextOfEmailErrorAlert() {
        return emailErrorAlert.getText();
    }

}
