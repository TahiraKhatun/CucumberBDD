package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.signIn_page;

public class signIn extends Config {
    signIn_page signIn = new signIn_page(driver);
    @Given("I am at TalentTEK home page")
    public void iAmAtTalentTEKHomePage() {
        String exp = "Sign In";
        Assert.assertEquals(driver.getTitle(),exp);
    }

       @And("I click on Create New Account button")
    public void iClickOnCreateNewAccountButton() {
        signIn.clickCreateNewAccountButton();
    }

    @And("I enter student  email address")
    public void iEnterStudentEmailAddress() {
        signIn.enterStudentEmailAddress("Tahirakhatun411@gmail.com");

    }
        @And("I enter student password")
        public void iEnterStudentPassword() {
            signIn.enterStudentPass("Rahaman12");
        }


    @And("I enter student  email address as {string}")
    public void iEnterStudentEmailAddressAs(String email)
    {
    signIn.enterStudentEmailAddress(email);
    }
    @And("I enter student password as {string}")
    public void iEnterStudentPasswordAs(String password) {
        signIn.enterStudentPass(password);
    }

    @When("I click log in button")
    public void iClickLogInButton() {
        signIn.clickLogin();
    }


}
