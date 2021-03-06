package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.BrowserUtil;
import utilities.ConfigReader;
import utilities.DriverUtil;
import utilities.JSUtil;

public class CSHomePage {

    public CSHomePage(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }
    @FindBy(linkText = "Sign Up")
    WebElement signUpclick;

    public WebElement getSignUpclick() {
        return signUpclick;
    }

    public void verifyHomePage(){

        DriverUtil.getDriver().get(ConfigReader.getProperty("url"));
        JSUtil.pageLoadColplte();

        String expected="Codeshare - Share code in real-time with developers in your browser";
        Assert.assertEquals(expected,DriverUtil.getDriver().getTitle());
    }

    public void signup(){
        getSignUpclick().click();
        BrowserUtil.wait(3000);
    }
}
