package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

import static base.Config.driver;

public class signUp_page {


    public signUp_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    @FindBy(how = How.NAME, using = "firstName")
    public WebElement firstNameLoc;

    public void enterFirstName(String firstName) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(firstNameLoc));
        firstNameLoc.clear();
        firstNameLoc.sendKeys(firstName);
    }

    @FindBy(how = How.NAME, using = "lastName")
    public WebElement lastNameLoc;


    public void enterLastName(String lastName) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(lastNameLoc));
        lastNameLoc.clear();
        lastNameLoc.sendKeys(lastName);
    }
    @FindBy(how = How.NAME, using = "email")
     public WebElement emailLoc;

    public void enterEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(emailLoc));
        emailLoc.clear();
        emailLoc.sendKeys(email);
      }

      @FindBy(how = How.NAME, using = "password")
       public WebElement passLoc;
       public void enterPass(String password){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(passLoc));
        passLoc.clear();
        passLoc.sendKeys(password);
     }

    @FindBy(how = How.NAME, using = "confirmPassword")
    public WebElement confirmPasswordLoc;
    public void enterConfirmPass(String password){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf( confirmPasswordLoc));
        confirmPasswordLoc.clear();
        confirmPasswordLoc .sendKeys(password);

      }
       public void day() {

           WebElement month = driver.findElement(By.name("month"));
           Select sel = new Select(month);
           sel.selectByVisibleText("Oct");

           WebElement day = driver.findElement(By.name("day"));
           Select num = new Select(day);
           num.selectByValue("31");

           WebElement year = driver.findElement(By.name("year"));
           Select ye = new Select(year);
           ye.selectByIndex(5);
       }

       public void selectRadiobutton(String gender) {
           List<WebElement> radio_label = driver.findElements(By.cssSelector(".radio-inline"));
           for (WebElement e : radio_label) {
               System.out.println(e.getText());
               if(e.getText().equalsIgnoreCase(gender)){
                   e.findElement(By.tagName("input")).click();
               }
           }
       }
       @FindBy(how = How.CSS,using="input[type='checkbox']")
       public WebElement checkBoxLoc;

       public void checkBox(){
        checkBoxLoc.click();
      }
       @FindBy(how = How.XPATH, using = "//button[@type='submit']")
       public WebElement submitLoc;

       public void submit() {
                submitLoc.click();

       }
       @FindBy(how = How.XPATH, using = "//div[@class='alert alert-success']")
       public WebElement successMass;

      public void verifyMess(){
         String aa = successMass.getText();
                 System.out.println( aa);
      }
     }
