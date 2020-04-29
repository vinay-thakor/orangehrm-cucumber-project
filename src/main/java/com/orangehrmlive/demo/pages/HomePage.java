package com.orangehrmlive.demo.pages;

import com.cucumber.listener.Reporter;
import com.orangehrmlive.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    @FindBy(css = "input#txtUsername")
    WebElement _usernameField;
    @FindBy(css = "input#txtPassword")
    WebElement _passwordField;
    @FindBy(css = "input.button")
    WebElement _loginBtn;
    @FindBy(xpath = "//div[@id='logInPanelHeading']")
    WebElement _logPannelmessage;


    //methods performing actions on elements
    public void enterUsernameToField(String userName) {
        Reporter.addStepLog("Clicking and send text to " + userName + "username field " + _usernameField.toString() + "<br>");
        sendTextToElement(_usernameField, userName);
        log.info("Clicking and send text to " + userName + "username field " + _usernameField.toString());
    }

    public void enterPasswordToField(String password) {
        Reporter.addStepLog("Click and send password " + password + " to password field " + _passwordField.toString());
        sendTextToElement(_passwordField, password);
        log.info("Click and send password " + password + " to password field " + _passwordField.toString());
    }

    public void clickOnLoginBtn() {
        Reporter.addStepLog("Clicking on Login button :" + _loginBtn.toString() + "<br>");
        clickOnElement(_loginBtn);
        log.info("Clicking on Login button :" + _loginBtn.toString());
    }

    public String pannelMesg1() {
        Reporter.addStepLog("Login pannel message :" + _logPannelmessage.toString());
        log.info("Login pannel message :" + _logPannelmessage.toString());
        return getTextFromElement(_logPannelmessage);

    }

}