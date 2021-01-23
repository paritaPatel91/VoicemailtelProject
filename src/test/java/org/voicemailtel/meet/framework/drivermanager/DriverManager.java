package org.voicemailtel.meet.framework.drivermanager;

import com.sun.xml.internal.ws.server.DefaultResourceInjector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.voicemailtel.meet.framework.config.AppConfig;
import org.voicemailtel.meet.framework.utils.Constants;

public class DriverManager {
    private WebDriver driver;

    private static DriverManager manager;

    private DriverManager() {
        //to check browser we looking at
        if (((String) AppConfig.getProperties("browser.name")).equalsIgnoreCase(Constants.CHROME)) {
            System.setProperty(Constants.CHROME_KEY, (String) AppConfig.getProperties("chrome.driver.location"));
            //we can enhance this to add more capabilities
            driver = new ChromeDriver();

        } else if (((String) AppConfig.getProperties("browser.name")).equalsIgnoreCase(Constants.FIREFOX)) {
            System.setProperty(Constants.FIREFOX_KEY, (String) AppConfig.getProperties("firefox.driver.location"));
            driver = new FirefoxDriver();

        } else if (((String) AppConfig.getProperties("browser.name")).equalsIgnoreCase(Constants.EDGE)) {
            System.setProperty(Constants.EDGE_KEY, (String) AppConfig.getProperties("edge.driver.location"));
            driver = new EdgeDriver();

        } else if (((String) AppConfig.getProperties("browser.name")).equalsIgnoreCase(Constants.OPERA)) {
            System.setProperty(Constants.OPERA_KEY, (String) AppConfig.getProperties("opera.driver.location"));

            driver = new OperaDriver();
        } else{
            System.setProperty(Constants.CHROME_KEY, (String) AppConfig.getProperties("chrome.driver.location"));
            driver = new ChromeDriver();

        }
    }

    public static WebDriver getDriver() {
        if (manager == null) {
            manager = new DriverManager();
        }
        return manager.driver;
    }


}