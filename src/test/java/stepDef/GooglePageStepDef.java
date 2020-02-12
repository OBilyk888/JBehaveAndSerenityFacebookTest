package stepDef;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import steps.GoogleSteps;

public class GooglePageStepDef extends PageObject {
    @Steps
    private GoogleSteps googleSteps;


    @Given("I am at the google page")
    public void navigateToGooglePage(){
        googleSteps.openGooglePage();
    }
    @When ("I search for and go to facebook")
    public void searchForFacebook(){
        googleSteps.searchForFacebookInTheGoogle();
    }
    @Then("Check that I am at the Facebook page")
    public void verifyFacebook(){
        googleSteps.verifyUrl();
    }



}
