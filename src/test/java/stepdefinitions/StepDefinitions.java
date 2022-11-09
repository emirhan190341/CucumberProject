package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.ro.Si;
import org.openqa.selenium.Keys;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;

public class StepDefinitions {




    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    SignInPage signInPage = new SignInPage();
    GmiBankPage gmiBankPage = new GmiBankPage();
    AccountSettings accountSettings = new AccountSettings();

    @Given("Go to GMIBank website")
    public void go_to_gmi_bank_website() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @Given("Navigate to registration page")
    public void navigate_to_registration_page() {
        homePage.clickDropDownMenu();
        homePage.clickRegisterButton();
    }

    @Then("Click on SSN textbook")
    public void click_on_ssn_textbook() {
        registrationPage.setSsnTextBoxClick();
    }

    @Then("Provide the SNN of the applicant")
    public void provide_the_snn_of_the_applicant() {
        registrationPage.SsnTextBoxSend();
    }

    @Then("I should not see the error message")
    public void i_should_not_see_the_error_message() {
        registrationPage.validTextControl();

    }

    @Then("Provide the wrong  {string} of the applicant")
    public void provide_the_wrong_of_the_applicant(String ssnName) {
        registrationPage.SsnTextBoxSendWrong(ssnName + Keys.TAB);
    }

    @Then("I should see the error message")
    public void i_should_see_the_error_message() {
        registrationPage.invalidTextControl();
    }


    //

    @Then("Click on Password textbook")
    public void click_on_password_textbook() {
        registrationPage.clickPasswordBox();
    }

    @Then("Enter the {string}")
    public void enter_the(String password) {
        registrationPage.passwordSend(password);
    }

    @Then("Assert the test")
    public void assert_the_test() {
        registrationPage.passwordStrengthHasNElement(4);
    }


    @Then("Click Sign In")
    public void click_sign_in() {
        homePage.clickDropDownMenu();
        registrationPage.clickSignIn();

    }

    @Then("Fill {string} and {string}")
    public void fill_and(String username, String password) {
        signInPage.sendUsername(username);
        signInPage.sendPassword(password);

    }


    @Then("Click on sign in button")
    public void click_on_sign_in_button() {
        signInPage.clickSignInButton();
    }

    @Then("Click on Team35 GmiBankProject")
    public void click_on_team35_gmi_bank_project() {
        gmiBankPage.clickAccountMenu();
    }

    @Then("Click on User Info")
    public void click_on_user_info() {
        gmiBankPage.clickUserInfo();
    }

    @Then("Verify your firstname")
    public void verify_your_firstname() {
        accountSettings.firstNameAssertion();
    }

    @Then("Verify your lastname")
    public void verify_your_lastname() {
        accountSettings.lastNameAssertion();
    }

    @Then("Verify your email")
    public void verify_your_email() {
        accountSettings.emailAssertion();
    }

    @Then("Verify your language")
    public void verify_your_language() {
        accountSettings.englishAssertion();
    }
    //

    @Then("Click on language's dropdown arrow")
    public void click_on_language_s_dropdown_arrow() {
        accountSettings.clickLanguageDropDown();

    }
    @Then("Change your language")
    public void change_your_language() {
        accountSettings.selectLanguageDropDown();
    }
    @Then("Click on save button")
    public void click_on_save_button() {
        accountSettings.clickSaveButton();
    }
    @Then("Verify it has changed")
    public void verify_it_has_changed() {
        accountSettings.hasChanged();
    }

    @Then("Click on First Name text box")
    public void click_on_first_name_text_box() {
        accountSettings.clickFirstNameBox();
    }
    @Then("Change your firstname with test data")
    public void change_your_firstname_with_test_data() {
        accountSettings.changeFirstNameData();
    }
    @Then("Verify firstname has changed")
    public void verify_firstname_has_changed() {
        accountSettings.firstNameHasChanged();

    }







}
