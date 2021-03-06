package steps.definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ContactFormThankYouPage;
import pages.ContactUsPage;
import pages.HomePage;
import pages.OurProductsPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class MyStepdefs {

    private WebDriver driver;
    protected HomePage homePage;

    @Given("I go to main page")
    public void iGoToMainPage() {
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        driver.get("http://webdriveruniversity.com/Page-Object-Model/index.html");
    }

    @When("I click on the Find Out More button")
    public void iClickOnTheFindOutMoreButton() throws InterruptedException {
        homePage.clickFindOutMoreButton();
    }

    @Then("I see the Welcome modal")
    public void iSeeAModal() {
        WebElement modal = homePage.findModal();
        assertTrue(modal.isDisplayed());
    }

    @When("I click on the Close button")
    public void iClickOnTheCloseButton() throws InterruptedException {
        homePage.closeModal();
    }

    @Then("I don't see the Welcome modal")
    public void iDoNotSeeAModal() {
        WebElement modal = homePage.findModal();
        assertFalse(modal.isDisplayed());
    }

    @When("I click on Our Products Menu")
    public void iClickOurProductsMenu() {
        homePage.clickOurProductsMenu();
    }

    @Then("I see the products")
    public void iSeeTheProducts() {
        OurProductsPage ourProducts = new OurProductsPage(driver);
        List<WebElement> products = ourProducts.findProducts();
        assertEquals(products.size(), 8);
    }

    @When("I click on a product")
    public void iClickOnAProduct() throws InterruptedException {
        OurProductsPage ourProducts = new OurProductsPage(driver);
        ourProducts.clickAProductLink();
        Thread.sleep(1000);
    }

    @Then("I see the offer modal")
    public void iSeeTheOfferModal() {
        OurProductsPage ourProducts = new OurProductsPage(driver);
        WebElement modal = ourProducts.findModal();
        assertTrue(modal.isDisplayed());
    }

    @When("I click on the Proceed button")
    public void iClickOnTheProceedButton() throws InterruptedException {
        OurProductsPage ourProducts = new OurProductsPage(driver);
        ourProducts.proceedModal();
        Thread.sleep(1000);
    }

    @Then("I don't see the offer modal")
    public void iDoNotSeeTheOfferModal() {
        OurProductsPage ourProducts = new OurProductsPage(driver);
        WebElement modal = ourProducts.findModal();
        assertFalse(modal.isDisplayed());
    }

    @When("I click on Our Contact Link")
    public void iClickOnOurContactLink() {
        homePage.clickContactMenu();
    }

    @When("I fill the form")
    public void iFillTheForm() {
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.setFirstNameField("Mar??a");
        contactUsPage.setLastNameField("G??mez");
        contactUsPage.setEmailField("test@gmail.com");
        contactUsPage.setCommentsField("Text");
    }

    @When("I click the submit button")
    public void iClickTheSubmitButton() {
        ContactUsPage contactUsPage = new ContactUsPage(driver);
        contactUsPage.clickSubmitButton();
    }

    @Then("a message is displayed")
    public void aMessageIsDisplayed() {
        ContactFormThankYouPage contactFormThankYouPage = new ContactFormThankYouPage(driver);
        String message = contactFormThankYouPage.getMessage();
        assertEquals(message, "Thank You for your Message!");
    }

    @After()
    public void quitBrowser() {
        driver.quit();
    }
}
