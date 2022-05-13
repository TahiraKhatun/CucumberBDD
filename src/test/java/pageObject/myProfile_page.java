package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class myProfile_page {

    public myProfile_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }
@FindBy(how =How.XPATH,using ="//*[@id=\"profile_form\"]/legend")
    public WebElement textMessageLoc;
    public void verifyMessage(){
     String exp = "Welcome to TalentTek";
     String act =  textMessageLoc.getText();
     Assert.assertEquals(act,exp);
    }
}