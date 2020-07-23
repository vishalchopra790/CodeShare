package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.DriverUtil;
import utilities.JSUtil;

public class CSProfile {

    public CSProfile(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }
    @FindBy(css = ".dropdown")
    WebElement verifyUser;

    public WebElement getVerifyUser() {
        return verifyUser;
    }

    public void verifyUser(){

        JSUtil.pageLoadColplte();
        String expected= ConfigReader.getProperty("username");
        Assert.assertEquals(getVerifyUser().getText(),expected);

    }
}
