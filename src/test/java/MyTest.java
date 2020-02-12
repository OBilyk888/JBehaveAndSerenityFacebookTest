import org.testng.annotations.Test;
import stepDef.FacebookPageStepDef;
import stepDef.GooglePageStepDef;

public class MyTest {

    @Test
    public void facebookTest(){
        FacebookPageStepDef pageStepDef = new FacebookPageStepDef();
        pageStepDef.openFacebookSite();
        pageStepDef.loginToFacebook();
        pageStepDef.checkTheMessage();
    }

    @Test
    public void wayToFacebook(){

        GooglePageStepDef googlePageStepDef = new GooglePageStepDef();
        googlePageStepDef.navigateToGooglePage();
        googlePageStepDef.searchForFacebook();
        googlePageStepDef.verifyFacebook();

    }

  /*  public static void main(String[] args) {

        try {
            DataBase dataBase = new DataBase();
            FacebookUsers facebookUsers = new FacebookUsers();
            dataBase.getUsers(facebookUsers.login);
            System.out.println(facebookUsers.printData());


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/




  /* @BeforeSuite
    public void start() {
        BrowserFactory.getDriver();
    }

    @AfterSuite
    public void finish(){
        BrowserFactory.closeBrowser();
    }*/
    }

