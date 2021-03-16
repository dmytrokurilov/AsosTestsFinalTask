package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftVouchersPage extends BasePage {

    @FindBy(xpath = "//div[@class='selectionItem-2kkXZ voucher-voucherStyleId-29Uma selected-3nCgY']")
    private WebElement orangeVoucherButton;

    @FindBy(xpath = "//label[@for='voucher-value-20']")
    private WebElement voucherTwentyPounds;

    @FindBy(xpath = "//button[@data-test-id='paySecurelyNow']")
    private WebElement paySecurelyNowButton;

    @FindBy(xpath = "//div[@id='voucher-toEmail-error-message']")
    private WebElement voucherToEmailErrorMessage;

    public GiftVouchersPage(WebDriver driver) {
        super(driver);
    }

    public void clickOrangeVoucherButton() {
        orangeVoucherButton.click();
    }

    public void clickVoucherTwentyPounds() {
        voucherTwentyPounds.click();
    }

    public void clickPaySecurelyNowButton() {
        paySecurelyNowButton.click();
    }

    public String getTextOfVoucherToEmailErrorMessage() {
        return voucherToEmailErrorMessage.getText();
    }

}
