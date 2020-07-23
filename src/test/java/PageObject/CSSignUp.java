package PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.ConfigReader;
import utilities.DriverUtil;

public class CSSignUp {

    public CSSignUp(){
        PageFactory.initElements(DriverUtil.getDriver(),this);
    }
    @FindBy(name ="name")
    WebElement name;
    @FindBy(name = "email")
    WebElement email;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(css = "[type='submit']")
    WebElement submit;

    public WebElement getName() {
        return name;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getSubmit() {
        return submit;
    }

    public void verifySignuoPage(){
        String expected= DriverUtil.getDriver().getCurrentUrl();
        Assert.assertEquals(expected,DriverUtil.getDriver().getCurrentUrl());
    }

    public void signupForm(){
        getName().sendKeys(ConfigReader.getProperty("username"));
        getEmail().sendKeys(ConfigReader.getProperty("email"));
        getPassword().sendKeys(ConfigReader.getProperty("password"));
        getSubmit().click();
    }
}
