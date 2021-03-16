package manager;

import org.openqa.selenium.WebDriver;
import pages.*;

public class PageFactoryManager {
    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public GiftVouchersPage getGiftVouchersPage() {
        return new GiftVouchersPage(driver);
    }

    public HelpPage getHelpPage() {
        return new HelpPage(driver);
    }

    public MenPage getMenPage() {
        return new MenPage(driver);
    }

    public MobileAppsPage getMobileAppsPage() {
        return new MobileAppsPage(driver);
    }

    public SignInPage getSignInPage() {
        return new SignInPage(driver);
    }

    public FaceBookPage getFacebookPage() {
        return new FaceBookPage(driver);
    }
}
