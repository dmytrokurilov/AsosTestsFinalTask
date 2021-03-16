package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MobileAppsPage extends BasePage {

    @FindBy(xpath = "//h5[contains(text(),'iPhone / iPod Touch')]")
    private WebElement iphoneIpodTouch;

    @FindBy(xpath = "//h5[contains(text(),'iPad / iPad Mini')]")
    private WebElement ipadIpadMini;

    @FindBy(xpath = "//h5[contains(text(),'Android phone / tablet')]")
    private WebElement androidPhoneTablet;

    public MobileAppsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isIphoneIpodTouchTextVisible() {
        return iphoneIpodTouch.isDisplayed();
    }

    public boolean isIpadIpadMiniTextVisible() {
        return ipadIpadMini.isDisplayed();
    }

    public boolean isAndroidPhoneTabletVisible() {
        return androidPhoneTablet.isDisplayed();
    }


}
