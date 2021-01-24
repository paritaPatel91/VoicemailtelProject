import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
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
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.get("https://meet.voicemailtel.com");


        driver.findElement(By.xpath("//a[@class='mat-focus-indicator meetings-menu-item mat-menu-item ng-star-inserted']")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("mat-input-13"))
                .sendKeys("rosyjames1299@gmail.com");
        // Thread.sleep(2000);

        driver.findElement(By.id("mat-input-14"))
                .sendKeys("Rosy12345$");
        //Thread.sleep(3000);

        WebElement element = driver.findElement(By.xpath("button[@class='submit-button orange-button full-width']"));
        Thread.sleep(2000);

        clickElementByJS(element,driver);


    }
    public static void clickElementByJS(WebElement element, WebDriver driver) {
        JavascriptExecutor js =((JavascriptExecutor) driver);
        js.executeScript("arguments[0].click();",element);

    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
    }


}
