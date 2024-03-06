package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utils.WebDriverUtils;
import Utils.XPathUtils;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookiesAndSwitchLanguage() {
        driver.get("https://www.hrs.de/");
        WebElement acceptCookiesButton = WebDriverUtils.fluentWaitForClickable(driver, By.xpath(XPathUtils.ACCEPT_COOKIES_BUTTON));
        acceptCookiesButton.click();
        
       
        // CHOOSE ENGLISH LANGUAGE
        WebElement navbarBars = WebDriverUtils.fluentWaitForClickable(driver, By.xpath(XPathUtils.NAV_BARS));
        navbarBars.click();

        WebElement settings = WebDriverUtils.fluentWaitForClickable(driver, By.xpath(XPathUtils.SETTINGS));;
        settings.click();

        WebElement englishLanguageOption = WebDriverUtils.fluentWaitForClickable(driver, By.xpath(XPathUtils.ENGLISH_LANGUAGE_OPTION));
        englishLanguageOption.click();
        
        // ASSERT THE PAGE TITLE
        String pageTitle = driver.getTitle();
        Assert.assertEquals(pageTitle, "HRS – The hotel portal | book 300,000 Hotels with the test Winner");
        
    }

    public void searchHotels(String location) {
    	
    	WebElement locationAddress = WebDriverUtils.fluentWaitForClickable(driver, By.xpath(XPathUtils.LOCATION));
    	locationAddress.click();
        WebElement destinationSearchInput = driver.findElement(By.id("DestinationSearchInput"));
        destinationSearchInput.click();
        destinationSearchInput.sendKeys(location);
        WebElement cataloniaElement = WebDriverUtils.fluentWaitForClickable(driver, By.xpath(XPathUtils.CATALONIAELEMENTS));;
        cataloniaElement.click();
        WebElement searchButton = WebDriverUtils.fluentWaitForClickable(driver, By.xpath(XPathUtils.SEARCH_BUTTON));;
        searchButton.click();
    }
}
