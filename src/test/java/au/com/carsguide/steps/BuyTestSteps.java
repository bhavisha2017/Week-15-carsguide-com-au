package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import au.com.carsguide.pages.UsedCarForSalePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BuyTestSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {

    }
    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseOverToBuySell();

    }
    @And("^I click 'Search Cars' link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCars();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
//        String expectedMessage = "New & Used Car Search - carsguide ";
//        String actualMessage = new NewAndUsedCarSearchPage().getTextNewAndUsedCar();
//        Assert.assertEquals(expectedMessage,actualMessage,"New & Used Car Search - carsguide");
    }
    @And("^I select make \"([^\"]*)\"$")
    public void iSelectMake(String anyMake)  {
          new NewAndUsedCarSearchPage().selectAnyMake(anyMake);
    }

    @And("^I select model \"([^\"]*)\"$")
    public void iSelectModel(String anyModel )  {
        new NewAndUsedCarSearchPage().selectAnyModel(anyModel);

    }

    @And("^I select location \"([^\"]*)\"$")
    public void iSelectLocation(String anyLocation)  {
        new NewAndUsedCarSearchPage().selectAnyLocation(anyLocation);
    }


    @And("^I select price \"([^\"]*)\"$")
    public void iSelectPrice(String price)  {
        new NewAndUsedCarSearchPage().selectPrice(price);

    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickONFindMyNextCar();
    }
    @Then("^I should see the make “(.+)” in results$")
    public void i_should_see_the_make_in_results(String anyMake)  {
    }


    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new UsedCarForSalePage().clickOnUsed();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
//        String expectedMessage = "Used Cars For Sale  ";
//        String actualMessage = new NewAndUsedCarSearchPage().getTextNewAndUsedCar();
//        Assert.assertEquals(expectedMessage,actualMessage,"Used Cars For Sale ");
    }

    @Then("^I should verify the result \"([^\"]*)\" in results$")
    public void iShouldVerifyTheResultInResults(String VerifyMessage)  {
        new NewAndUsedCarSearchPage().verifyTheResult(VerifyMessage);
    }


}
