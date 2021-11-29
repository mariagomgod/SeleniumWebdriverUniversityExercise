package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Elementos de Homepage (consulta)
    private final By findOutMoreButton = By.cssSelector("#button-find-out-more");
    private final By findModalCloseButton = By.cssSelector("#myModal .modal-footer button:nth-child(2)");

    private final By productsMenu = By.cssSelector(".container-fluid ul.nav.navbar-nav li a[href=\"products.html\"]");

    // Acciones sobre Homepage
    public void clickFindOutMoreButton() throws InterruptedException {
        driver.findElement(findOutMoreButton).click();
        Thread.sleep(1000);
    }

    public WebElement findModal() {
        return driver.findElement(By.id("myModal"));
    }

    public void closeModal() throws InterruptedException {
        driver.findElement(findModalCloseButton).click();
        Thread.sleep(1000);
    }

    public OurProductsPage clickOurProductsMenu() {
        driver.findElement(productsMenu).click();
        return new OurProductsPage(driver);
    }
}
