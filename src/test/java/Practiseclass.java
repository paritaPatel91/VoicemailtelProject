import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Practiseclass {

    private WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Parita Patel\\Desktop\\WebDrivers\\chromedriver.exe");
        driver=new ChromeDriver();
    }

    @Test
    public void testdata() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://meet.voicemailtel.com/dashboard/schedule");

        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.xpath( "//button[@id='scheduleAMeeting']"))).click().build().perform();
        Thread.sleep(2000);
        actions.moveToElement(driver.findElement(By.xpath(" \"/html/body/app-root/div/div/app-dashboard/div/div/div[2]/div[2]/app-schedule-meeting/div/form/div[1]/nz-tree-select/div\")"))).click().build().perform();
        Thread.sleep(2000);
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }


}
