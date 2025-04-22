package Happy_Path_Patient_Web_and_MR.stepDefinitions;

import Happy_Path_Patient_Web_and_MR.DemoPageContainer;
import cap.utilities.TestDataUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;


public class SpiceJetSteps {

    private DemoPageContainer demoPageContainer;

    public SpiceJetSteps(DemoPageContainer demoPageContainer) {

        this.demoPageContainer = demoPageContainer;
    }


    @Given("As a user i should launch SpiceJet Website")
    public void asAUserIShouldLaunchSpiceJetWebsite() {
        demoPageContainer.spiceJetPage.visitWebsite();
    }

    @Then("I should validate SpiceJet URL {string} is valid")
    public void iShouldValidateSpiceJetURLIsValid(String strCurrentURL) {
        Assert.assertTrue(demoPageContainer.spiceJetPage.checkSpiceJetValidURL(TestDataUtil.getValue(strCurrentURL)));
    }

    @Given("As a user i should SpiceJet navigate to Create Account page")
    public void asAUserIShouldSpiceJetNavigateToCreateAccountPage() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.goToCreateAccountPage());
    }


    @And("I should not enter any data in SpiceJet input fields and Click on Create an Account button")
    public void iShouldNotEnterAnyDataInSpiceJetInputFieldsAndClickOnCreateAnAccountButton() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.clickSubmitButton());

    }

    @Then("I should check the SpiceJet mandatory fields {string} validation messages")
    public void iShouldCheckTheSpiceJetMandatoryFieldsValidationMessages(String strNoDataValidationMessages) {
        Assert.assertTrue(demoPageContainer.spiceJetPage.checkSpiceJetNoDataValidationMessages(TestDataUtil.getValue(strNoDataValidationMessages)));
    }

    @And("I should enter SpiceJet invalid data {string} in input fields and Click on Create an Account button")
    public void iShouldEnterSpiceJetInvalidDataInInputFieldsAndClickOnCreateAnAccountButton(String strInvalidTestData) {
        Assert.assertTrue(demoPageContainer.spiceJetPage.enterSpiceJetInvalidDataCreateAccountPage(TestDataUtil.getListOfValue(strInvalidTestData)));
    }

    @Then("I should check all SpiceJet invalid messages {string} are displayed")
    public void iShouldCheckAllSpiceJetInvalidMessagesAreDisplayed(String strInvalidDataValidationMessages) {
        Assert.assertTrue(demoPageContainer.spiceJetPage.checkInvalidDataSpicejetValidationMessages(TestDataUtil.getListOfValue(strInvalidDataValidationMessages)));
    }

    @And("I should enter SpiceJet valid data {string} in input fields and Click on Create an Account button")
    public void iShouldEnterSpiceJetValidDataInInputFieldsAndClickOnCreateAnAccountButton(String strDataValidationMessages) {
        Assert.assertTrue(demoPageContainer.spiceJetPage.enterValidDataCreateAccountPage(TestDataUtil.getListOfValue(strDataValidationMessages)));
    }

    @Then("I should check SpiceJet account is created successfully")
    public void iShouldCheckSpiceJetAccountIsCreatedSuccessfully() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.checkSpicejetAccountIsCreatedSuccessfully());
    }

    @Then("I should SpiceJet signout from the BestBuy Website")
    public void iShouldSpiceJetSignoutFromTheBestBuyWebsite() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.signoutFromSpicejet());
    }

    @Given("As a user i should navigate to Spicejet Sign In button")
    public void asAUserIShouldNavigateToSpicejetSignInButton() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.navigateToSpicejetSignInButton());
    }

    @When("I enter Spicejet UserName {string} and click Continue")
    public void iEnterSpicejetUserNameAndClickContinue(String strUserName) {
        Assert.assertTrue(demoPageContainer.spiceJetPage.enterSpicejetUserName(TestDataUtil.getValue(strUserName)));
    }

    @When("I select Use Spicejet Password {string} ,enter Password and click Continue")
    public void iSelectUseSpicejetPasswordEnterPasswordAndClickContinue(String strPassword) {
        Assert.assertTrue(demoPageContainer.spiceJetPage.enterSpicejetPassword(TestDataUtil.getValue(strPassword)));
    }

    @Then("I should check account Spicejet is logged in successfully")
    public void iShouldCheckAccountSpicejetIsLoggedInSuccessfully() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.navigateToSpicejetLoginButton());
    }

    @Given("As a user i should click on Flights Tab")
    public void asAUserIShouldClickOnFlightsTab() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.clickOnFlightsTab());
    }

    @When("I enter all flight details {string} in the Flights tab")
    public void iEnterAllFlightDetailsInTheFlightsTab(String strEnterWrongFlightDetails) {
        Assert.assertTrue(demoPageContainer.spiceJetPage.enterFlightDetailsInTheFlightsTab(TestDataUtil.getListOfValue(strEnterWrongFlightDetails)));
    }

    @And("I should click on Search Flight")
    public void iShouldClickOnSearchFlight() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.clickOnSearchFlight());
    }

    @Then("I should check Flight is not available for the entered datetime")
    public void iShouldCheckFlightIsNotAvailableForTheEnteredDatetime() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.checkFlightIsNotAvailableForTheEnteredDatetime());
    }

    @When("I enter all One Way flight details {string} in the Flights tab")
    public void iEnterAllOneWayFlightDetailsInTheFlightsTab(String strEnterOneWayFlightDetails) {
        Assert.assertTrue(demoPageContainer.spiceJetPage.enterOneWayFlightDetailsInTheFlightsTab(TestDataUtil.getListOfValue(strEnterOneWayFlightDetails)));
    }

    @And("I should check Flight is available and Click Continue")
    public void iShouldCheckFlightIsAvailableAndClickContinue() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.checkFlightIsAvailableAndClickContinue());
    }

    @And("I should enter contact Details {string} in Passengers Page")
    public void iShouldEnterContactDetailsInPassengersPage(String strPassengerContactDetails) {
        Assert.assertTrue(demoPageContainer.spiceJetPage.enterContactDetailsInPassengersPage(TestDataUtil.getListOfValue(strPassengerContactDetails)));
    }

    @And("I should click on Primary Passenger checkbox")
    public void iShouldClickOnPrimaryPassengerCheckbox() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.clickOnPrimaryPassengerCheckbox());
    }

    @And("I should click on Continue button in Trip Summary page")
    public void iShouldClickOnContinueButtonInTripSummaryPage() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.clickOnContinueButtonInTripSummaryPage());
    }

    @And("I should click on Continue button in Add Ons Trip Summary page")
    public void iShouldClickOnContinueButtonInAddOnsTripSummaryPage() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.clickOnContinueButtonInAddOnsTripSummaryPage());
    }

    @And("I should enter card details {string} in the page and Click Proceed to Pay")
    public void iShouldEnterCardDetailsInThePageAndClickProceedToPay(String strCardDetails) {
        Assert.assertTrue(demoPageContainer.spiceJetPage.enterCardDetailsInThePageAndClickProceedToPay(TestDataUtil.getListOfValue(strCardDetails)));
    }

    @Then("I should check flight booking is successfull")
    public void iShouldCheckFlightBookingIsSuccessfull() {
        Assert.assertTrue(demoPageContainer.spiceJetPage.checkFlightBookingIsSuccessfull());
    }

    @When("I enter all Two Way flight details {string} in the Flights tab")
    public void iEnterAllTwoWayFlightDetailsInTheFlightsTab(String strEnterTwoWayFlightDetails) {
        Assert.assertTrue(demoPageContainer.spiceJetPage.enterTwoWayFlightDetailsInTheFlightsTab(TestDataUtil.getListOfValue(strEnterTwoWayFlightDetails)));
    }
}
