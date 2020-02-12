package steps;

import Default.DefaultSteps;
import net.thucydides.core.annotations.Step;

public class FacebookSteps extends DefaultSteps {

    @Step
    public void faceBookPage(){
        facebookPage.navigateToFacebookPage("https://www.facebook.com/login/");
    }

    @Step
    public void loginInFacebook(String login,String password){
        facebookPage.enterEmail(login);
        facebookPage.enterPassword(password);
        facebookPage.clickLogIn();
    }

    @Step
    public void  identifyError(){
        facebookPage.identifyErrorMessage();
    }
}
