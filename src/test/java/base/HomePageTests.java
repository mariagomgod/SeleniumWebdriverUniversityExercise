package base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class HomePageTests extends BaseTests {

    @Test
    public void testClickAButtonAModalAppears() throws InterruptedException {
        homePage.clickFindOutMoreButton();
        WebElement modal = homePage.findModal();
        assertTrue(modal.isDisplayed());
        homePage.closeModal();
        modal = homePage.findModal();
        assertFalse(modal.isDisplayed());
    }
}
