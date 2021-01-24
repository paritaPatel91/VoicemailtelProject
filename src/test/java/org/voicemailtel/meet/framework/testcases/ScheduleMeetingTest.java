package org.voicemailtel.meet.framework.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.voicemailtel.meet.framework.drivermanager.DriverManager;
import org.voicemailtel.meet.framework.pages.JoinMeeting;
import org.voicemailtel.meet.framework.pages.ScheduleMeeting;


import java.util.concurrent.TimeUnit;

public class ScheduleMeetingTest {
    private WebDriver driver = DriverManager.getDriver();

    @BeforeSuite
    public void setUp() {
        driver.get("https://meet.voicemailtel.com");

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        }

    @Test
    public void TC_7_1() throws InterruptedException {
       ScheduleMeeting scheduleMeeting = new ScheduleMeeting(driver);
        scheduleMeeting.getSignInMenu().click();
        scheduleMeeting.enterRegisteredEmail("rosyjames1299@gmail.com")
                .enteredREgisteredPassword("Rosy12345$")
                .getSignInOrangeButton().click();

        Thread.sleep(2000);

        scheduleMeeting.getScheduleMeetingbutton().click();

        Thread.sleep(2000);
        scheduleMeeting.getSelectGroupMenu().click();

       Thread.sleep(2000);
        scheduleMeeting.getSelectCreatedGroup1().click();

        Thread.sleep(2000);

        scheduleMeeting.getSelectCreatedGroup2().click();

        Thread.sleep(2000);

        scheduleMeeting.subjectName("Automation").roomPassword("12345").getSaveButton().click();
        Thread.sleep(2000);

    }
    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();

    }
}



