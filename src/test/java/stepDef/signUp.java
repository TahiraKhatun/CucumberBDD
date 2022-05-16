package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.signUp_page;

public class signUp extends Config {
    signUp_page  signUp = new signUp_page(driver);
    @And("I enter student information with valid email address")
    public void iEnterStudentInformationWithValidEmailAddress() {
        signUp.enterFirstName("Tahira");
        signUp.enterLastName("Khatun");
        signUp.enterEmail("Tahirakhatun101@gmail.com");
        signUp.enterPass("Rahaman12");
        signUp.enterConfirmPass("Rahaman12");



    }

    @And("I enter student dob")
    public void iEnterStudentDob() {
        signUp.day();
    }

    @And("I enter student gender as male")
    public void iEnterStudentGenderAsMale() {
        signUp.selectRadiobutton("Male");
    }

    @And("I agree with from")
    public void iAgreeWithFrom() {
        signUp.checkBox();
    }

    @When("I click Create My  Account button")
    public void iClickCreateMyAccountButton() {
        signUp.submit();
    }

    @Then("I should be able to get my student id")
    public void iShouldBeAbleToGetMyStudentId() {
        signUp.verifyMess();
    }
}
