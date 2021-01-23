package org.voicemailtel.meet.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JoinMeeting {
    private WebDriver driver;
    // private WebDriverWait wait;

    @FindBy(xpath = "//a[@class='mat-focus-indicator meetings-menu-item mat-menu-item ng-star-inserted']")
    private WebElement signInMenu;


    @FindBy(id = "mat-input-13")
    private WebElement registeredEmail;

    @FindBy(id = "mat-input-14")
    private WebElement registerdPassword;

    @FindBy(xpath = "//button[@class='submit-button orange-button full-width']")
    private WebElement signInOrangeButton;


    @FindBy(xpath = "//div[@class='google-signin-text']")
    private WebElement signInGoogleButton;

    @FindBy(xpath = "//h1[contains(text(),'Join Meeting')]")
    private WebElement joinmettingHeader;

    @FindBy(id = "mat-input-15")
    private WebElement enterModeratorEmail;

    @FindBy(id = "mat-input-16")
    private WebElement enterEmployeeName;

    @FindBy(id = "mat-input-18")
    private WebElement roomPassword;

    @FindBy(xpath = "//div[@class='submit-button-join-icon-holder']")
    private WebElement clickOnJoinMeetingButton;

    public JoinMeeting(WebDriver driver) {
        this.driver = driver;
        // wait = new WebDriverWait(driver,10);
        PageFactory.initElements(driver, this);
    }

    public WebElement getSignInMenu() {
        return signInMenu;
    }

    public WebElement getRegisteredEmail() {
        return registeredEmail;
    }

    public WebElement getRegisterdPassword() {
        return registerdPassword;
    }

    public WebElement getSignInOrangeButton() {
        return signInOrangeButton;
    }

    public WebElement getSignInGoogleButton() {
        return signInGoogleButton;
    }

    public WebElement getJoinmettingHeader() {
        return joinmettingHeader;
    }

    public WebElement getEnterModeratorEmail() {
        return enterModeratorEmail;
    }

    public WebElement getEnterEmployeeName() {
        return enterEmployeeName;
    }

    public WebElement getRoomPassword() {
        return roomPassword;
    }

    public WebElement getClickOnJoinMeetingButton() {
        return clickOnJoinMeetingButton;
    }

    public JoinMeeting signInMenu() {
        this.signInMenu.click();
        return new JoinMeeting(driver);
    }

    public JoinMeeting enterRegisteredEmail(String email) {
        this.registeredEmail.sendKeys(email);
        return this;
    }

    public JoinMeeting enteredREgisteredPassword(String password) {
        this.registerdPassword.sendKeys(password);
        return this;
    }

    public JoinMeeting signInOrangeBtn() {
        this.signInOrangeButton.click();
        return new JoinMeeting(driver);

    }

    public JoinMeeting signInGooglebtn() {
        this.signInGoogleButton.click();
        return new JoinMeeting(driver);
    }

    public JoinMeeting enteredModeratorEmail(String email) {
        this.enterModeratorEmail.sendKeys(email);
        return this;
    }

    public JoinMeeting enteredUserName(String name) {
        this.enterEmployeeName.sendKeys(name);
        return this;
    }

    public JoinMeeting entererdRoomPassword(String password) {
        this.roomPassword.sendKeys(password);
        return this;
    }

    public JoinMeeting clickOnJoinMeetingBTn() {
        this.clickOnJoinMeetingButton.click();
        return new JoinMeeting(driver);
    }


}







