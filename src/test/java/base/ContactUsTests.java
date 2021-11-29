package base;

import org.testng.annotations.Test;
import pages.ContactFormThankYouPage;
import pages.ContactUsPage;

import static org.testng.Assert.assertEquals;

public class ContactUsTests extends BaseTests {

    @Test
    public void testSubmitContactUsForm() {
        ContactUsPage contactUsPage = homePage.clickContactMenu();
        contactUsPage.setFirstNameField("María");
        contactUsPage.setLastNameField("Gómez");
        contactUsPage.setEmailField("test@gmail.com");
        contactUsPage.setCommentsField("Text");
        ContactFormThankYouPage contactFormThankYouPage = contactUsPage.clickSubmitButton();
        String message = contactFormThankYouPage.getMessage();
        assertEquals(message, "Thank You for your Message!");
    }
}
