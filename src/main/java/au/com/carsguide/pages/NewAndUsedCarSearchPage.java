package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewAndUsedCarSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    public NewAndUsedCarSearchPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='New & Used Car Search - carsguide']")
    WebElement newAndUsedCar;

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement anyMake;

    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement anyModel;

    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement anyLocation;

    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextCar;

    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement resultText;

    public String getTextNewAndUsedCar() {
        String message = getTextFromElement(newAndUsedCar);
        log.info("Getting text from:" + newAndUsedCar.toString());
        return message;
    }

    public void selectAnyMake(String make) {
        selectByVisibleTextFromDropDown(anyMake, make);
        log.info("Select from dropdown:" + anyMake.toString());
    }

    public void selectAnyModel(String model) {
//        selectByVisibleTextFromDropDown(anyModel, model);
        selectByValueFromDropDown(anyModel, model);
        log.info("Select from dropdown:" + anyModel.toString());
    }

    public void selectAnyLocation(String location) {
        selectByVisibleTextFromDropDown(anyLocation, location);
        log.info("Select from dropdown:" + anyLocation.toString());
    }

    public void selectPrice(String price1) {
        selectByVisibleTextFromDropDown(price, price1);
        log.info("Select from dropdown:" + price.toString());
    }

    public void clickONFindMyNextCar() {
        clickOnElement(findMyNextCar);
        log.info("Clicking on:" + findMyNextCar.toString());
    }

    public void verifyTheResult(String expected) {
        log.info("Verify the result :" + resultText.toString());
        String actualMessage1 = getTextFromElement(resultText);
        String expectedMessage1 = expected;
    }
}