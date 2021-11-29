package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactFormThankYouPage {
    private final WebDriver driver;

    public ContactFormThankYouPage(WebDriver driver) {
        this.driver = driver;
    }

    //Elementos de ContactFormThankYouPage (consultas)
    private final By message = By.cssSelector("#contact_reply h1");

    // Acciones sobre ContactFormThankYouPage
    public String getMessage() {
        return driver.findElement(message).getText();
    }
}
