package base;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.OurProductsPage;

import java.util.List;

import static org.testng.Assert.*;

public class OurProductsTests extends BaseTests {

    @Test
    public void testClickAProductLinkAModalAppears() throws InterruptedException {
        OurProductsPage ourProducts = homePage.clickOurProductsMenu();
        List<WebElement> products = ourProducts.findProducts();
        assertEquals(products.size(), 8);
        ourProducts.clickAProductLink();
        Thread.sleep(2000);
        WebElement modal = ourProducts.findModal();
        assertTrue(modal.isDisplayed());
        ourProducts.proceedModal();
        Thread.sleep(2000);
        modal = ourProducts.findModal();
        assertFalse(modal.isDisplayed());
    }
}
