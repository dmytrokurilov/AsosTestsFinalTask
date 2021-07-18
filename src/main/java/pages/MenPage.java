package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenPage extends BasePage {

    @FindBy(xpath = "//h2[@class='hero-title__text']//span[contains(text(), 'Fresh finds')]")
    private WebElement freshFindsButton;

    public MenPage(WebDriver driver) {
        super(driver);
    }

    public String getTextOfFreshFindsButton() {
        return freshFindsButton.getText();
    }

}
