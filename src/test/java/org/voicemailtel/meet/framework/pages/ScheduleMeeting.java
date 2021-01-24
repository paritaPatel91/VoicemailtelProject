package org.voicemailtel.meet.framework.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScheduleMeeting {

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//a[@class='mat-focus-indicator meetings-menu-item mat-menu-item ng-star-inserted']")
    private WebElement signInMenu;


    @FindBy(id = "mat-input-13")
    private WebElement registeredEmail;

    @FindBy(id = "mat-input-14")
    private WebElement registerdPassword;

    @FindBy(xpath = "//button[@class='submit-button orange-button full-width']")
    private WebElement signInOrangeButton;


    @FindBy(xpath = "//button[@id='scheduleAMeeting']")
    private WebElement scheduleMeetingbutton;

    @FindBy(xpath = "//*[@class='ng-tns-c128-5 ant-select-arrow ng-star-inserted']")
    private WebElement selectGroupMenu;

    @FindBy(xpath = "//*[@class='ant-select-tree-switcher ng-star-inserted ant-select-tree-switcher_close']")
    private WebElement selectCreatedGroup1;


    @FindBy(xpath = "//*[@class='ant-select-tree-switcher ant-select-tree-switcher_close ng-star-inserted']")
    private WebElement selectCreatedGroup2;

    @FindBy(id = "mat-input-4")
    private WebElement subjectName;

    @FindBy(id = "password")
    private WebElement roomPassword;

    @FindBy(xpath = "//span[contains(text(),'Save')]")
    private WebElement saveButton;

    public ScheduleMeeting(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
        PageFactory.initElements(driver, this);
    }


    public WebDriver getDriver() {
        return driver;
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

    public WebElement getScheduleMeetingbutton() {
        return scheduleMeetingbutton;
    }

    public WebElement getSelectGroupMenu() {
        return selectGroupMenu;
    }

    public WebElement getSelectCreatedGroup1() {
        return selectCreatedGroup1;
    }

    public WebElement getSelectCreatedGroup2() {
        return selectCreatedGroup2;
    }

    public WebElement getSaveButton() {
        return saveButton;
    }

    public WebElement getSubjectName() {
        return subjectName;
    }

    public WebElement getRoomPassword() {
        return roomPassword;
    }




    public ScheduleMeeting signInMenu() {
        this.signInMenu.click();
        return new ScheduleMeeting(driver);
    }

    public ScheduleMeeting enterRegisteredEmail(String email) {
        this.registeredEmail.sendKeys(email);
        return this;
    }

    public ScheduleMeeting enteredREgisteredPassword(String password) {
        this.registerdPassword.sendKeys(password);
        return this;
    }

    public ScheduleMeeting signInOrangeBtn() {
        this.signInOrangeButton.click();
        return new ScheduleMeeting(driver);

    }

    public ScheduleMeeting scheduleMeetingButton() {
        this.scheduleMeetingbutton.click();
        this.scheduleMeetingbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='scheduleAMeeting']")));
        return new ScheduleMeeting(driver);
    }

    public ScheduleMeeting selectGroupMenu() {
        this.selectGroupMenu.click();
        this.selectGroupMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ng-tns-c128-5 ant-select-arrow ng-star-inserted']")));
        return new ScheduleMeeting(driver);
    }

    public ScheduleMeeting selectCreateGroup1() {
        this.selectGroupMenu.click();
        this.selectGroupMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ant-select-tree-switcher ng-star-inserted ant-select-tree-switcher_close']")));
        return new ScheduleMeeting(driver);
    }
    public ScheduleMeeting selectCreateGroup2() {
        this.selectGroupMenu.click();
        this.selectGroupMenu = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='ant-select-tree-switcher ant-select-tree-switcher_close ng-star-inserted']")));
        return new ScheduleMeeting(driver);
    }

    public ScheduleMeeting subjectName(String name) {
        this.subjectName.sendKeys(name);
        return this;
    }

    public ScheduleMeeting roomPassword(String password) {
        this.roomPassword.sendKeys(password);
        return this;
    }


        public ScheduleMeeting clickOnSaveButton () {
            this.saveButton.click();
            return new ScheduleMeeting(driver);
        }


    }
