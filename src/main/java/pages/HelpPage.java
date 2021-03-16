package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HelpPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Contact us now')]")
    private WebElement contactUsButton;

    @FindBy(xpath = "//div[@class='CardListAnchorItem_textWrapper']")
    private WebElement chatNowLink;

    public HelpPage(WebDriver driver) {
        super(driver);
    }

    public void clickContactUsButton() {
        contactUsButton.click();
    }

    public String getTextOfChatNowLink() {
        return chatNowLink.getText();
    }


}
