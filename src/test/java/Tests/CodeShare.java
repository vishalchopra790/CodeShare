package Tests;

import org.testng.annotations.Test;
import utilities.Base;

public class CodeShare extends Base {
    @Test(groups = {"regression"})
    public void e2E(){
        pages.csHomePage.verifyHomePage();
        pages.csHomePage.signup();
        pages.csSignUp.verifySignuoPage();
        pages.csSignUp.signupForm();
        pages.csProfile.verifyUser();
    }
}
