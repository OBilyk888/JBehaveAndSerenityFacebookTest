package steps;

import Default.DefaultSteps;
import net.thucydides.core.annotations.Step;

public class GoogleSteps extends DefaultSteps {
    @Step
    public void openGooglePage(){
        googlePage.navigateToGooglePage();
    }

    @Step
    public void searchForFacebookInTheGoogle(){
        googlePage.searchFacebook();
        googlePage.clickButton();
        googlePage.clickOnTheLinkFacebook();
    }

    @Step
    public void verifyUrl(){
        googlePage.isUrl();
    }
}
