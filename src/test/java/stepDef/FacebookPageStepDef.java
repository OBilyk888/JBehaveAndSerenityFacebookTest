package stepDef;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import steps.FacebookSteps;

public class FacebookPageStepDef extends PageObject {

  @Steps
    private FacebookSteps facebookSteps;

  @Given("I am the Facebook page")
    public void openFacebookSite(){
    facebookSteps.faceBookPage();
  }

  @When("I try to log in to Facebook with badLogin and badPassword")
  public void loginToFacebook(){
    facebookSteps.loginInFacebook("badlogin","badpassword");
  }

  @Then("I identify message with error")
  public void checkTheMessage(){
    facebookSteps.identifyError();
  }




}
