package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.SearchResultsPage;

public class HrsSearchTest {
    private WebDriver driver;
    private HomePage homePage;
    private SearchResultsPage searchResultsPage;

    @BeforeClass
    public void setUp() {
        String projectDir = System.getProperty("user.dir");
        String chromeDriverPath = projectDir + "\\servers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        homePage = new HomePage(driver);
        searchResultsPage = new SearchResultsPage(driver);

        homePage.acceptCookiesAndSwitchLanguage();
    }

    @Test(priority = 1)
    public void searchHotelsInBarcelona() {
        homePage.searchHotels("Barcelona, Catalonia");
        searchResultsPage.sortByPrice();
        
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
