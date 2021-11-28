package steps.definitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

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

    @After()
    public void quitBrowser() {
        driver.quit();
    }
}
