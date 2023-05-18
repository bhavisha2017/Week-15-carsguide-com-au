package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class CarsDealershipPage extends Utility {

    private static final Logger log = LogManager.getLogger(CarsDealershipPage.class.getName());

    public CarsDealershipPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(className = "dealerListing--name")
    List<WebElement> dealers;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Next']")
    WebElement nextButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Find a Car Dealership Near You']")
    WebElement carDealership;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Find a Dealer']")
    WebElement findDealer;

    public String getTextCarDealerShip() {
        String message1 = getTextFromElement(carDealership);
        log.info("Getting text from : " + carDealership.toString());
        return message1;
    }

    public void findDealerName(String dealersName) throws InterruptedException {

        for (int j = 1; j <= 135; j++) {
            Thread.sleep(3000);

            for (int i = 0; i < dealers.size(); i++) {
                String name = dealers.get(i).getText().toLowerCase();
                if (name.contains(dealersName.toLowerCase())) {
                    System.out.println("The Dealer " + dealersName + " is present on page no: " + j);
                    j = 136;
                    break;
                }
            }
            if (j != 136) {
                clickOnElement(nextButton);
            }
            PageFactory.initElements(driver, this);
        }
    }

    public void clickOnFindDealer() {
        clickOnElement(findDealer);
        log.info("Clicking on:" + findDealer);
    }

}
