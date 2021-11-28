package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass // el método se va a ejecutar antes de todos los tests
    public void setUpTestSuite() {
        driver = new ChromeDriver(); // es nuestro navegador
        homePage = new HomePage(driver);
    }

    @BeforeMethod // el método se va a ejecutar antes de cada test
    public void setUp() {
        driver.get("http://webdriveruniversity.com/Page-Object-Model/index.html"); // vamos a ir a la web que queremos con el método get()
        driver.manage().window().maximize(); // maximiza la ventana de la web
    }

    @AfterClass // el método se va a ejecutar después todos los tests
    public void tearDown() {
        driver.quit(); // cerramos el navegador
    }
}
