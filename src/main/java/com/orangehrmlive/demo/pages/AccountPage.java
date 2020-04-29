package com.orangehrmlive.demo.pages;

import com.cucumber.listener.Reporter;
import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {


    private static final Logger log = LogManager.getLogger(AccountPage.class.getName());


    @FindBy(id = "welcome")
    WebElement _welcomeAdminText;

    @FindBy(css = "a.panelTrigger")
    WebElement _welcomeAdmin;

    @FindBy(linkText = "Logout")
    WebElement _logoutLink;

    @FindBy(xpath = "//b[contains(text(),'PIM')]")
    WebElement _pimButton;

    @FindBy(linkText = "Add Employee")
    WebElement _addEmployeeBtn;

    @FindBy(xpath = "//h1[contains(text(),'Add Employee')]")
    WebElement _adEmployeeText;

    public void clickOnPimBtn() {
        Reporter.addStepLog("Clicking on pim button : " + _pimButton.toString());
        clickOnElement(_pimButton);
        log.info("Clicking on pim button : " + _pimButton.toString());
    }

    public void clickOnAddEmployeeBtn() {
        Reporter.addStepLog("Clicking on pim button : " + _addEmployeeBtn.toString());
        clickOnElement(_addEmployeeBtn);
        log.info("Clicking on pim button : " + _addEmployeeBtn.toString());
    }


    public void clickOnWelcomeAdmin() {
        waitUntilElementToBeClickable(_welcomeAdmin, 20);
        Reporter.addStepLog("Clicking on Welcome Admin " + _welcomeAdmin.toString() + "<br>");
        clickOnElement(_welcomeAdmin);
        log.info("Clicking on Welcome Admin " + _welcomeAdmin.toString());
    }

    public void clickOnLogoutLink() {
        waitUntilElementToBeClickable(_logoutLink, 20);
        Reporter.addStepLog("Clicking on Logout button " + _logoutLink.toString() + "<br>");
        clickOnElement(_logoutLink);
        log.info("Clicking on Logout button " + _logoutLink.toString());
    }
    // verify welcomeAdminText

    public String welcomeAdminTexverify() {
        waitUntilElementToBeClickable(_welcomeAdminText, 20);
        return getTextFromElement(_welcomeAdminText);
    }

    //verify message for the account page
    public String verifyEmployeeIdext() {
        return getTextFromElement(_adEmployeeText);
    }

}

