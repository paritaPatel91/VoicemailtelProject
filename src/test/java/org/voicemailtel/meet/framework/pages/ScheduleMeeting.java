//package org.voicemailtel.meet.framework.pages;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class ScheduleMeeting {
//
//    private WebDriver driver;
//    private WebDriverWait wait;
//
//    @FindBy(xpath = "//a[@class='mat-focus-indicator meetings-menu-item mat-menu-item ng-star-inserted']")
//    private WebElement signInMenu;
//
//
//    @FindBy(id = "mat-input-13")
//    private WebElement registeredEmail;
//
//    @FindBy(id = "mat-input-14")
//    private WebElement registerdPassword;
//
//    @FindBy(xpath = "//button[@class='submit-button orange-button full-width']")
//    private WebElement signInOrangeButton;
//
//
//    @FindBy(xpath = "//button[@id='scheduleAMeeting']")
//    private WebElement scheduleMeetingHeader;
//
//    @FindBy(xpath = "/html/body/app-root/div/div/app-dashboard/div/div/div[2]/div[2]/app-schedule-meeting/div/form/div[1]/nz-tree-select/div")
//    private WebElement selectGroup;
//
//    @FindBy(xpath = "//*[@class=\"ant-select-tree-switcher ant-select-tree-switcher_close ng-star-inserted\"]")
//    private WebElement selectCreatedGroup;
//
//    @FindBy(id = "mat-input-19")
//    private WebElement subjectName;
//
//    @FindBy(id = "password")
//    private WebElement roomPassword;
//
//    @FindBy(id = "mat-input-21")
//    private WebElement startDateAndTime;
//
//    @FindBy(xpath = "//div[@class=\"mat-form-field-infix ng-tns-c76-24\"]")
//    private WebElement timeZone;
//
////    @FindBy(xpath = "//*[contains(text(),'GMT-11:00) Midway Island, Samoa')]")
////    private WebElement CentralAmericaTimeZone;
//
//    @FindBy(xpath = "//div[@class='mat-select-value ng-tns-c104-12']")
//    private WebElement duration;
//
//    @FindBy(id = "mat-option-76")
//    private WebElement durationOfTheMeeting;
//
////    @FindBy(xpath = "//div[@class='mat-checkbox-inner-container']")
////    private WebElement reccuringButton;
//
//
//    @FindBy(xpath = "//span[contains(text(),'Save')]")
//    private WebElement saveButton;
//
//    public ScheduleMeeting(WebDriver driver) {
//        this.driver = driver;
//        wait = new WebDriverWait(driver, 20);
//        PageFactory.initElements(driver, this);
//    }
//
//
//    public WebDriver getDriver() {
//        return driver;
//    }
//
//    public WebElement getSignInMenu() {
//        return signInMenu;
//    }
//
//    public WebElement getRegisteredEmail() {
//        return registeredEmail;
//    }
//
//    public WebElement getRegisterdPassword() {
//        return registerdPassword;
//    }
//
//    public WebElement getSignInOrangeButton() {
//        return signInOrangeButton;
//    }
//
//    public WebElement getScheduleMeetingHeader() {
//        return scheduleMeetingHeader;
//    }
//
//    public WebElement getSelectGroup() {
//        return selectGroup;
//    }
//
//    public WebElement getSelectCreatedGroup() {
//        return selectCreatedGroup;
//    }
//
//    public WebElement getSubjectName() {
//        return subjectName;
//    }
//
//    public WebElement getRoomPassword() {
//        return roomPassword;
//    }
//
//    public WebElement getTimeZone() {
//        return timeZone;
//    }
//
////    public WebElement getCentralAmericaTimeZone() {
////        return CentralAmericaTimeZone;
////    }
//
//    public WebElement getDurationOfTheMeeting() {
//        return durationOfTheMeeting;
//    }
//
//    public WebElement getStartDateAndTime() {
//        return startDateAndTime;
//    }
//
//    public WebElement getSaveButton() {
//        return saveButton;
//    }
//
//    public WebElement getDuration() {
//        return duration;
//    }
//
//    public ScheduleMeeting signInMenu() {
//        this.signInMenu.click();
//        return new ScheduleMeeting(driver);
//    }
//
//    public ScheduleMeeting enterRegisteredEmail(String email) {
//        this.registeredEmail.sendKeys(email);
//        return this;
//    }
//
//    public ScheduleMeeting enteredREgisteredPassword(String password) {
//        this.registerdPassword.sendKeys(password);
//        return this;
//    }
//
//    public ScheduleMeeting signInOrangeBtn() {
//        this.signInOrangeButton.click();
//        return new ScheduleMeeting(driver);
//
//    }
//
//    public ScheduleMeeting meetingHeader() {
//        this.scheduleMeetingHeader.click();
//        return new ScheduleMeeting(driver);
//    }
//
//    public ScheduleMeeting selectGroup() {
//        this.selectCreatedGroup.click();
//        this.selectCreatedGroup = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class=\"ant-select-tree-switcher ant-select-tree-switcher_close ng-star-inserted\"]")));
//        return new ScheduleMeeting(driver);
//    }
//
//    public ScheduleMeeting subjectName(String name) {
//        this.subjectName.sendKeys(name);
//        return this;
//    }
//
//    public ScheduleMeeting roomPassword(String password) {
//        this.roomPassword.sendKeys(password);
//        return this;
//    }
//
//    public ScheduleMeeting startDateAndTime() {
//        this.startDateAndTime.click();
//        return new ScheduleMeeting(driver);
//
////    } public ScheduleMeeting timeZone(){
////        this.CentralAmericaTimeZone.click();
////        return new ScheduleMeeting(driver);
//////    }
////        public ScheduleMeeting duration () {
////            this.durationOfTheMeeting.click();
////            return new ScheduleMeeting(driver);
////        }
////        public ScheduleMeeting clickOnSaveButton () {
////            this.saveButton.click();
////            return new ScheduleMeeting(driver);
////        }
////
//
//    }
//}