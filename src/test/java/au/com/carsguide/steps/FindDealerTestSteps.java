package au.com.carsguide.steps;

import au.com.carsguide.pages.CarsDealershipPage;
import au.com.carsguide.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FindDealerTestSteps {

    @Given("^I am on car guide homepage$")
    public void iAmOnCarGuideHomepage() {
    }
    @When("^I mouse hover on “buy\\+sell” link$")
    public void iMouseHoverOnBuySellLink() {
        new HomePage().mouseOverToBuySell();
    }

    @And("^I click Find a Dealer$")
        public void iClickFindADealer() {
            new CarsDealershipPage().clickOnFindDealer();
        }
    @And("^I navigate to 'Find a dealer'$")
    public void iNavigateToFindADealer() {
//        String expectedMessage = "car-dealers";
//        String actualMessage = new CarsDealershipPage().getTextCarDealerShip();
//        Assert.assertEquals(expectedMessage, actualMessage, "car-dealers");
    }


    @Then("^I should see the dealers name \"([^\"]*)\" on page$")
    public void iShouldSeeTheDealersNameOnPage(String dealersName ) throws InterruptedException {
        new CarsDealershipPage().findDealerName(dealersName);
    }



}


    






