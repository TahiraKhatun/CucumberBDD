package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class signIn_page {



    public signIn_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }


    @FindBy(how = How.LINK_TEXT, using = "Create New Account")
    public WebElement clickCreateNewAccountFromSignInPage;


    public void clickCreateNewAccountButton() {
        clickCreateNewAccountFromSignInPage.click();
    }

    }