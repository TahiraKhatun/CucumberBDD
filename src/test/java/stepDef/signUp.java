package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import pageObject.signUp_page;

public class signUp extends Config {
    signUp_page  signUp = new signUp_page(driver);
    @And("I enter student information with valid email address")
    public void iEnterStudentInformationWithValidEmailAddress() {
        signUp.enterFirstName("Tahira");
        signUp.enterLastName("Khatun");
        signUp.enterEmail("Tahirakhatun411@gmail.com");
        signUp.enterPass("Rahaman12");
        signUp.enterConfirmPass("Rahaman12");
        signUp.submit();
    }
}
