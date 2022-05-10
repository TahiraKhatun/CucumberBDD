package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class signUp_page {


    public signUp_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    @FindBy(how = How.NAME, using = "firstName")
    public WebElement firstNameLoc;

    public void enterFirstName(String firstName) {
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(firstNameLoc));
        firstNameLoc.clear();
        firstNameLoc.sendKeys(firstName);
    }

    @FindBy(how = How.NAME, using = "lastName")
    public WebElement lastNameLoc;


    public void enterLastName(String lastName) {
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(lastNameLoc));
        lastNameLoc.clear();
        lastNameLoc.sendKeys(lastName);
    }
    @FindBy(how = How.NAME, using = "email")
     public WebElement emailLoc;

    public void enterEmail(String email) {
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(emailLoc));
        emailLoc.clear();
        emailLoc.sendKeys(email);
      }

      @FindBy(how = How.NAME, using = "password")
       public WebElement passLoc;
       public void enterPass(String password){
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf(passLoc));
        passLoc.clear();
        passLoc.sendKeys(password);
     }

    @FindBy(how = How.NAME, using = "confirmPassword")
    public WebElement confirmPasswordLoc;
    public void enterConfirmPass(String password){
        WebDriverWait wait = new WebDriverWait(Config.driver, 30);
        wait.until(ExpectedConditions.visibilityOf( confirmPasswordLoc));
        confirmPasswordLoc.clear();
        confirmPasswordLoc .sendKeys(password);

      }
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement submitLoc;

    public void submit() {
                submitLoc.click();

       }
     }