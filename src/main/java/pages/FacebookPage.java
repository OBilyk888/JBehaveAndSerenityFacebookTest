package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookPage extends PageObject {
    @FindBy(id = "email")
    private  WebElement emailField;
    @FindBy(id = "pass")
    private WebElement passwordField;
    @FindBy(xpath = "//input[contains(@type,'submit')]")
    private WebElement buttonLogIn;
    @FindBy(xpath = "//div[contains(@role,'alert')]")
    private WebElement alertMessage;

   public FacebookPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void navigateToFacebookPage(String url){
        getDriver().get(url);
    }

    public void enterEmail(String login){
        emailField.sendKeys(login);
    }

    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void clickLogIn(){
        buttonLogIn.click();
    }

    public String identifyErrorMessage(){
        return alertMessage.getText();
    }

}
