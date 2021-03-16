package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manager.PageFactoryManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class DefinitionSteps {
    private static final long DEFAULT_TIMEOUT = 60;
    WebDriver driver;
    HomePage homePage;
    GiftVouchersPage giftVouchersPage;
    HelpPage helpPage;
    MenPage menPage;
    MobileAppsPage mobileAppsPage;
    SignInPage signInPage;
    FaceBookPage faceBookPage;
    PageFactoryManager pageFactoryManager;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @Given("User opens {string} page")
    public void userOpensHomePagePage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User clicks search field")
    public void userClicksSearchField() {
        homePage.clickSearchField();
    }

    @When("User makes search by keyword {string}")
    public void userMakesSearchByKeywordKeyword(final String keyword) {
        homePage.enterTextToSearchField(keyword);
    }

    @And("User clicks search button")
    public void userClicksSearchButton() {
        homePage.clickSearchButton();
    }

    @Then("User checks that url field contains {string}")
    public void userChecksThatUrlFieldContainsQuery(final String query) {
        assertTrue(driver.getCurrentUrl().contains(query));
    }

    @When("User clicks My account icon")
    public void userClicksMyAccountIcon() {
        homePage.clickMyAccountIcon();
    }

    @And("User checks visibility Sign In button")
    public void userChecksVisibilitySignInButton() {
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getSignInButton());
    }

    @And("User clicks Sign In button")
    public void userClicksSignInButton() {
        homePage.clickSignInButton();
    }


    @And("User enters {string} email")
    public void userEntersEmailTextEmail(final String email) {
        signInPage = pageFactoryManager.getSignInPage();
        signInPage.enterEmail(email);
    }


    @And("User enters {string} password")
    public void userEntersPasswordPassword(final String password) {
        signInPage.enterPassword(password);
    }

    @And("User clicks second Sign In button")
    public void userClicksSecondSignInButton() {
        signInPage.clickSignInButton();
    }


    @Then("User checks that Login error message {string} is displayed")
    public void userChecksThatLoginErrorMessageErrorMessageIsDisplayed(final String expectedText) {
        assertEquals(signInPage.getTextOfLoginErrorMessage(), expectedText);
    }

    @When("User clicks men menu item")
    public void userClicksMenMenuItem() {
        homePage.clickMenMenuItem();
    }

    @And("User waits men page opens")
    public void userWaitsMenPageOpens() {
        menPage = pageFactoryManager.getMenPage();
        menPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @And("User checks visibility Accessories menu item")
    public void userChecksVisibilityAccessoriesMenuItem() {
        homePage.waitVisibilityOfElement(DEFAULT_TIMEOUT, homePage.getAccessoriesMenuItem());
    }

    @And("User clicks Accessories menu item")
    public void userClicksAccessoriesMenuItem() {
        homePage.clickAccessoriesMenuItem();
    }

    @And("User clicks brand casio menu item")
    public void userClicksBrandCasioMenuItem() {
        homePage.clickBrandCasioMenuItem();
    }

    @And("User adds any item to wishlist")
    public void userAddsAnyItemToWishlist() {
        homePage.clickAnyAddToWishListIcon();
    }

    @And("User clicks wishlist icon")
    public void userClicksWishlistIcon() {
        homePage.clickWishListIcon();
    }

    @Then("User checks that on wishlist page {string} is displayed")
    public void userChecksThatOnWishlistPageMoveToBagButtonIsDisplayed(final String expectedText) {
        assertEquals(homePage.getTextOfMoveToBagButton(), expectedText);
    }

    @When("User clicks location button")
    public void userClicksLocationButton() {
        homePage.clickLocationButton();
    }

    @And("User clicks Currency dropdown")
    public void userClicksCurrencyDropdown() {
        homePage.clickCurrencyDropdown();
    }

    @And("User clicks Currency dropdown item USD")
    public void userClicksCurrencyDropdownItemUSD() {
        homePage.clickCurrencyDropdownItemUsd();
    }

    @And("User clicks Update preferences button")
    public void userClicksUpdatePreferencesButton() {
        homePage.clickUpdatePreferencesButton();
    }

    @And("User clicks location button second time")
    public void userClicksLocationButtonSecondTime() {
        homePage.clickLocationButton();
    }

    @And("User clicks Currency dropdown second time")
    public void userClicksCurrencyDropdownSecondTime() {
        homePage.clickCurrencyDropdown();
    }

    @Then("user checks that selected currency text {string}")
    public void userChecksThatSelectedCurrencyTextCurrencyText(final String expectedCurrency) {
        assertEquals(homePage.getTextOfCurrencyDropDownSelected(), expectedCurrency);
    }

    @When("User clicks Gift vouchers link")
    public void userClicksGiftVouchersLink() {
        homePage.clickGiftVouchersLink();
    }

    @And("User clicks Orange voucher button")
    public void userClicksOrangeVoucherButton() {
        giftVouchersPage = pageFactoryManager.getGiftVouchersPage();
        giftVouchersPage.clickOrangeVoucherButton();
    }

    @And("User clicks Voucher twenty pounds button")
    public void userClicksVoucherTwentyPoundsButton() {
        giftVouchersPage.clickVoucherTwentyPounds();
    }

    @And("User clicks Pay securely now button")
    public void userClicksPaySecurelyNowButton() {
        giftVouchersPage.clickPaySecurelyNowButton();
    }

    @Then("User checks that {string} text is displayed")
    public void userChecksThatAlertTextIsDisplayed(final String expectedText) {
        assertEquals(giftVouchersPage.getTextOfVoucherToEmailErrorMessage(), expectedText);
    }

    @When("User clicks Men page")
    public void userClicksMenPage() {
        homePage.clickMenMenuItem();
    }

    @Then("User checks that element {string} is present on page")
    public void userChecksThatElementSkinnyJeansButtonIsPresentOnPage(final String expectedText) {
        menPage = pageFactoryManager.getMenPage();
        assertEquals(menPage.getTextOfSkinnyJeansButton(), expectedText);
    }

    @And("User clicks New to ASOS header button")
    public void userClicksNewToASOSHeaderButton() {
        signInPage = pageFactoryManager.getSignInPage();
        signInPage.clickNewToAsosHeader();
    }

    @And("User clicks Join ASOS button")
    public void userClicksJoinASOSButton() {
        signInPage.clickJoinASosButton();
    }

    @Then("User checks that Email error message {string} is displayed")
    public void userChecksThatEmailErrorMessageErrorMessageIsDisplayed(final String expectedText) {
        assertEquals(signInPage.getTextOfEmailErrorAlert(), expectedText);
    }

    @When("User clicks Facebook icon")
    public void userClicksFacebookIcon() {
        homePage.clickFacebookIcon();
    }

    @And("User waits page loading")
    public void userWaitsPageLoading() {
        faceBookPage = pageFactoryManager.getFacebookPage();
        faceBookPage.waitForPageLoadComplete(DEFAULT_TIMEOUT);
    }

    @Then("User checks opened {string}")
    public void userChecksOpenedFacebookUrl(final String url) {
        assertTrue(driver.getCurrentUrl().contains(url));
    }

    @When("User clicks Help link")
    public void userClicksHelpLink() {
        homePage.clickHelpLink();
    }

    @And("User clicks contacts button")
    public void userClicksContactsButton() {
        helpPage = pageFactoryManager.getHelpPage();
        helpPage.clickContactUsButton();
    }

    @Then("User checks the {string} link text")
    public void userChecksTheChatNowLinkLinkText(final String expectedText) {
        assertEquals(helpPage.getTextOfChatNowLink(), expectedText);
    }

    @When("User clicks mobile apps link")
    public void userClicksMobileAppsLink() {
        homePage.clickAppsLink();
    }


    @And("User checks visibility of link for iphone")
    public void userChecksVisibilityOfLinkForIphone() {
        mobileAppsPage = pageFactoryManager.getMobileAppsPage();
        assertTrue(mobileAppsPage.isIphoneIpodTouchTextVisible());
    }

    @And("User checks visibility of link for iPad")
    public void userChecksVisibilityOfLinkForIPad() {
        assertTrue(mobileAppsPage.isIpadIpadMiniTextVisible());
    }

    @And("User checks visibility of link for android")
    public void userChecksVisibilityOfLinkForAndroid() {
        assertTrue(mobileAppsPage.isAndroidPhoneTabletVisible());
    }

    @Then("User checks that current url contains {string}")
    public void userChecksThatCurrentUrlContainsPartUrl(final String url) {
        assertTrue(driver.getCurrentUrl().contains(url));
    }

    @After
    public void tearDown() {
        driver.close();
    }
}






