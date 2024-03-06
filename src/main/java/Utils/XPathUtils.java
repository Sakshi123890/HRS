package Utils;

public class XPathUtils {
	
	public static final String ACCEPT_COOKIES_BUTTON = "//*[contains(text(),'Accept All Cookies')]";
    public static final String ENGLISH_LANGUAGE_OPTION = "//a[@href='/?language=en']/div[@class='Language_Text__o2bW9' and text()='English']";
    public static final String NAV_BARS  = "//img[contains(@class, 'Navbar_bars')]";
    public static final String SETTINGS  = "(//div[contains(@class, 'Setting')])[1]";
    public static final String LOCATION  = "//span[@title='Location, hotel, region, address, post code']";
    public static final String CATALONIAELEMENTS  = "(//*[contains(text(), 'Catalonia')])[2]";
    public static final String SEARCH_BUTTON  = "//span[contains(text(), 'Search hotels')]";
    
    

    // SearchResultsPage XPath
    public static final String PRICE_BUTTON = "//button[contains(@class, 'Chip_Normal') and span[contains(text(), 'Price')]]";
    
    

}
