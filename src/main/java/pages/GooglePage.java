package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePage extends PageObject {
    @FindBy(name = "q")
    private WebElement searchField;
    @FindBy(name = "btnK")
    private WebElement searchButton;
    @FindBy(xpath = "//a[@href=\"https://www.facebook.com/\"]")
    private WebElement linkLogIn;


    public void navigateToGooglePage(){
        getDriver().get("https://www.google.com/");
    }

    public void searchFacebook(){
        searchField.sendKeys("Facebook");
    }

    public void clickButton(){
        searchButton.submit();
    }

    public void clickOnTheLinkFacebook(){
        linkLogIn.click();
    }

    public String isUrl(){
        return getDriver().getCurrentUrl();
    }



}
