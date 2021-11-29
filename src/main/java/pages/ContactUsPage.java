package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactUsPage {

    private final WebDriver driver;

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    //Elementos de ContactUsPage (consultas)
    private final By firstNameField = By.name("first_name");
    private final By lastNameField = By.name("last_name");
    private final By emailField = By.name("email");
    private final By commentsField = By.name("message");
    private final By submitButton = By.cssSelector("#form_buttons .contact_button[value=\"SUBMIT\"]");

    // Acciones sobre ContactUsPage
    public void setFirstNameField(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void setLastNameField(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void setEmailField(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void setCommentsField(String comments) {
        driver.findElement(commentsField).sendKeys(comments);
    }

    public ContactFormThankYouPage clickSubmitButton() {
        driver.findElement(submitButton).click();
        return new ContactFormThankYouPage(driver);
    }
}
