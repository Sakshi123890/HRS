package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Utils.WebDriverUtils;
import Utils.XPathUtils;

public class SearchResultsPage {
    private WebDriver driver;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void sortByPrice() {
        WebElement priceButton = WebDriverUtils.fluentWaitForClickable(driver, By.xpath(XPathUtils.PRICE_BUTTON));
        priceButton.click();
        WebDriverUtils.moveToElementAndClick(driver, priceButton, 0, 10);
    }
}
