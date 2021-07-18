package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@type='search']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@aria-label='My Account']")
    private WebElement myAccountIcon;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    private WebElement signInButton;

    @FindBy(xpath = "//a[@id='men-floor']")
    private WebElement menMenuItem;

    @FindBy(xpath = "//section[@class='_1Rkc4-5']//a[contains(text(),'Gift vouchers')]")
    private WebElement giftVouchersLink;

    @FindBy(xpath = "//div[@class='_25L--Pi']//img[@alt='Ukraine']")
    private WebElement locationButton;

    @FindBy(xpath = "//select[@id='currency']")
    private WebElement currencyDropdown;

    @FindBy(xpath = "//option[@value='2']")
    private WebElement currencyDropDownItemUsd;

    @FindBy(xpath = "//button[contains(text(),'Update Preferences')]")
    private WebElement updatePreferencesButton;

    @FindBy(xpath = "//option[@value='2'][@selected]")
    private WebElement currencyDropDownItemUsdSelected;

    @FindBy(xpath = "//button[@data-id='0502a9b2-d1e8-4b34-9741-1141607c715e']")
    private WebElement accessoriesMenuItem;

    @FindBy(xpath = "//span[contains(text(),'Casio')]")
    private WebElement brandCasioMenuItem;

    @FindBy(xpath = "//span[@class='_30BqGyh']")
    private WebElement addToWishlistIcon;

    @FindBy(xpath = "//span[@type='heartUnfilled']")
    private WebElement wishListIcon;

    @FindBy(xpath = "//button[@class='toBagButton_OatoQ toBagButton_3wcKB']")
    private WebElement moveToBagButton;

    @FindBy(xpath = "//a[@aria-label='Facebook']")
    private WebElement faceBookIcon;

    @FindBy(xpath = "//a[@data-testid='help']")
    private WebElement helpLink;

    @FindBy(xpath = "//a[contains(text(),'Mobile and ASOS apps')]")
    private WebElement appsLinkInFooter;

    @FindBy(xpath = "//button[@data-testid='search-button-inline']")
    private WebElement searchButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void openHomePage(String url) {
        driver.get(url);
    }

    public void clickSearchField() {
        searchField.click();
    }

    public void enterTextToSearchField(final String searchText) {
        searchField.clear();
        searchField.sendKeys(searchText);
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    public void clickMyAccountIcon() {
        myAccountIcon.click();
    }

    public void clickSignInButton() {
        signInButton.click();
    }

    public void clickMenMenuItem() {
        menMenuItem.click();
    }

    public void clickGiftVouchersLink() {
        giftVouchersLink.click();
    }

    public void clickLocationButton() {
        locationButton.click();
    }

    public void clickCurrencyDropdown() {
        currencyDropdown.click();
    }

    public void clickCurrencyDropdownItemUsd() {
        currencyDropDownItemUsd.click();
    }

    public void clickUpdatePreferencesButton() {
        updatePreferencesButton.click();
    }

    public String getTextOfCurrencyDropDownSelected() {
        return currencyDropDownItemUsdSelected.getText();
    }

    public WebElement getAccessoriesMenuItem() {
        return accessoriesMenuItem;
    }

    public void clickAccessoriesMenuItem() {
        accessoriesMenuItem.click();
    }

    public void clickBrandCasioMenuItem() {
        brandCasioMenuItem.click();
    }

    public void clickAnyAddToWishListIcon() {
        addToWishlistIcon.click();
    }

    public void clickWishListIcon() {
        wishListIcon.click();
    }

    public String getTextOfMoveToBagButton() {
        return moveToBagButton.getText();
    }

    public void clickFacebookIcon() {
        faceBookIcon.click();
    }

    public void clickHelpLink() {
        helpLink.click();
    }

    public void clickAppsLink() {
        appsLinkInFooter.click();
    }

}
