package com.orangehrmlive.demo.cucumber.stepdefs;

import com.orangehrmlive.demo.pages.AccountPage;
import com.orangehrmlive.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on Home  page$")
    public void iAmOnHomePage() {
    }

    @When("^I enter username  \"([^\"]*)\"$")
    public void iEnterUsername(String userName)  {
        new HomePage().enterUsernameToField(userName);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new HomePage().enterPasswordToField(password);

    }

    @And("^I click on login link$")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginBtn();
    }

    @Then("^I should login successfully$")
    public void iShouldLoginSuccessfully() {
        new AccountPage().welcomeAdminTexverify();
    }

    @And("^I click on welcome admin link and logout link$")
    public void iClickOnWelcomeAdminLinkAndLogoutLink() {
        new AccountPage().clickOnWelcomeAdmin();
        new AccountPage().clickOnLogoutLink();

    }

    @Then("^I should see login pannel \"([^\"]*)\"$")
    public void iShouldSeeLoginPannel(String pannelMessage)  {
        Assert.assertEquals(new HomePage().pannelMesg1(),"LOGIN Panel");
    }

    @And("^I click on Pin button$")
    public void iClickOnPinButton() {
    }

    @And("^I click on add employee buton$")
    public void iClickOnAddEmployeeButon() {
    }

    @Then("^I should see employee id \"([^\"]*)\"$")
    public void iShouldSeeEmployeeId(String emplyeeT)  {
        Assert.assertEquals( new AccountPage().verifyEmployeeIdext(),"Add Employee");

    }
}
