package org.voicemailtel.meet.framework.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.voicemailtel.meet.framework.drivermanager.DriverManager;
import org.voicemailtel.meet.framework.pages.JoinMeeting;

import java.util.concurrent.TimeUnit;

public class JoinMeetingTest {

    private WebDriver driver = DriverManager.getDriver();

    @BeforeSuite
    public void setUp() {
        driver.get("https://meet.voicemailtel.com");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();



       //This one add when there is cookie present
       // e.g.wait.until(ExpectedConditions.presenceOfElementLocated(By.id("truste-consent-button"))).click();
    }
    //With valid moderator's email id

    @Test
    public void TC_6_1() throws InterruptedException {
        JoinMeeting signIn = new JoinMeeting(driver);
        signIn.getSignInMenu().click();
        signIn.enterRegisteredEmail("rosyjames1299@gmail.com")
                .enteredREgisteredPassword("Rosy12345$")
                .getSignInOrangeButton().click();
        signIn.enteredModeratorEmail("geet.saxena83@gmail.com")
                .enteredUserName("Rosy James")
                .entererdRoomPassword("1234")
                .getClickOnJoinMeetingButton()
                .click();
      //  Assert.assertEquals(signIn.getJoinmettingHeader().getText(),"Join Meeting");

// With invalid Moderator's email id

    }
    @Test
    public void TC_6_2(){
        JoinMeeting signIn = new JoinMeeting(driver);
        signIn.getSignInMenu().click();
        signIn.enterRegisteredEmail("rosyjames1299@gmail.com")
                .enteredREgisteredPassword("Rosy12345$")
                .getSignInOrangeButton().click();
        signIn.enteredModeratorEmail("geet.saxena@gmail.com")
                .enteredUserName("Rosy James")
                .entererdRoomPassword("1234")
                .getClickOnJoinMeetingButton()
                .click();
    }
// With valid Room's id
    @Test
    public void TC_6_3(){
        JoinMeeting signIn = new JoinMeeting(driver);
        signIn.getSignInMenu().click();
        signIn.enterRegisteredEmail("rosyjames1299@gmail.com")
                .enteredREgisteredPassword("Rosy12345$")
                .getSignInOrangeButton().click();
        signIn.enteredModeratorEmail("154241769")
                .enteredUserName("Rosy James")
                .entererdRoomPassword("1234")
                .getClickOnJoinMeetingButton()
                .click();
    }
  //  With invalid Room's id
    @Test
    public void TC_6_4(){
        JoinMeeting signIn = new JoinMeeting(driver);
        signIn.getSignInMenu().click();
        signIn.enterRegisteredEmail("rosyjames1299@gmail.com")
                .enteredREgisteredPassword("Rosy12345$")
                .getSignInOrangeButton().click();
        signIn.enteredModeratorEmail("154241")
                .enteredUserName("Rosy James")
                .entererdRoomPassword("1234")
                .getClickOnJoinMeetingButton()
                .click();
    }
    // with Invalid user name (BUG)
    @Test
    public void TC_6_5(){
        JoinMeeting signIn = new JoinMeeting(driver);
        signIn.getSignInMenu().click();
        signIn.enterRegisteredEmail("rosyjames1299@gmail.com")
                .enteredREgisteredPassword("Rosy12345$")
                .getSignInOrangeButton().click();
        signIn.enteredModeratorEmail("154241769")
                .enteredUserName("sonu mistry")
                .entererdRoomPassword("1234")
                .getClickOnJoinMeetingButton()
                .click();
    }
    // Invalid Room password(Bug)

    @Test
    public void TC_6_6(){
        JoinMeeting signIn = new JoinMeeting(driver);
        signIn.getSignInMenu().click();
        signIn.enterRegisteredEmail("rosyjames1299@gmail.com")
                .enteredREgisteredPassword("Rosy12345$")
                .getSignInOrangeButton().click();
        signIn.enteredModeratorEmail("154241769")
                .enteredUserName("Rosy James")
                .entererdRoomPassword("8907")
                .getClickOnJoinMeetingButton()
                .click();
    }
    // With All Invalid data
    @Test
    public void TC_6_7(){
        JoinMeeting signIn = new JoinMeeting(driver);
        signIn.getSignInMenu().click();
        signIn.enterRegisteredEmail("rosyjames1299@gmail.com")
                .enteredREgisteredPassword("Rosy12345$")
                .getSignInOrangeButton().click();
        signIn.enteredModeratorEmail("geet83@gmail.com")
                .enteredUserName("rose jamn")
                .entererdRoomPassword("14")
                .getClickOnJoinMeetingButton()
                .click();
    }
    //With all blank fields
    @Test
    public void TC_6_8(){
        JoinMeeting signIn = new JoinMeeting(driver);
        signIn.getSignInMenu().click();
        signIn.enterRegisteredEmail("paritacpatel67@gmail.com")
                .enteredREgisteredPassword("Pp10031991$")
                .getSignInOrangeButton().click();
        signIn.enteredModeratorEmail("")
                .enteredUserName("")
                .entererdRoomPassword("")
                .getClickOnJoinMeetingButton()
                .click();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();

    }



}
