package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OurProductsPage {

    private final WebDriver driver;

    public OurProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Elementos de OurProductsPage (consultas)
    private final By products = By.cssSelector(".row a[href=\"#\"]");
    private final By findProductLink = By.cssSelector("#special-offers a");
    private final By findModalProceedButton = By.cssSelector("#myModal .modal-footer button:nth-child(1)");

    //Acciones sobre OurProductsPage
    public List<WebElement> findProducts() {
        return driver.findElements(products);
    }

    public void clickAProductLink() throws InterruptedException {
        driver.findElement(findProductLink).click();
    }

    public WebElement findModal() {
        return driver.findElement(By.id("myModal"));
    }

    public void proceedModal() throws InterruptedException {
        driver.findElement(findModalProceedButton).click();
    }
}
