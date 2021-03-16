package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenPage extends BasePage {

    @FindBy(xpath = "//p[contains(text(),'SKINNY JEANS')]")
    private WebElement skinnyJeansButton;

    public MenPage(WebDriver driver) {
        super(driver);
    }

    public String getTextOfSkinnyJeansButton() {
        return skinnyJeansButton.getText();
    }

}
