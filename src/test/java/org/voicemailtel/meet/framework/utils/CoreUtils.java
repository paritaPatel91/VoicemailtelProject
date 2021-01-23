package org.voicemailtel.meet.framework.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.voicemailtel.meet.framework.config.AppConfig;
import org.voicemailtel.meet.framework.drivermanager.DriverManager;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CoreUtils {

    private static void createDirs(Path path){
        if(! Files.exists(path)){
            try {
                Files.createDirectories(path);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
    }
    public static String captureScreemShort(String testcaseName , StatusEnum statusEnum) {
        createDirs(Paths.get(AppConfig.getProperties("screenshort.base.dir")));
        WebDriver driver = DriverManager.getDriver();
        String fileName = null;

        if (StatusEnum.PASS == statusEnum) {
            createDirs(Paths.get(AppConfig.getProperties("pass.dir")));
             fileName = generateFileName(testcaseName);
            File memoryFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                Files.copy(memoryFile.toPath(), Paths.get(AppConfig.getProperties("pass.dir"), fileName));
            } catch (IOException exception) {
                exception.printStackTrace();
            }

        }

        if (StatusEnum.FAIL == statusEnum) {
            createDirs(Paths.get(AppConfig.getProperties("fail.dir")));
             fileName = generateFileName(testcaseName);
            File memoryFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                Files.copy(memoryFile.toPath(), Paths.get(AppConfig.getProperties("fail.dir"), fileName));
            } catch (IOException exception) {
                exception.printStackTrace();
            }

        }
        return fileName;
    }
    public static String generateFileName(String testCaseName){
        String pattern = AppConfig.getProperties("pattern");
        String[] s = pattern.split("_");

        SimpleDateFormat dateFormat = new SimpleDateFormat(s[1]);

        return testCaseName +"_"+dateFormat.format(new Date())+AppConfig.getProperties("extension");


    }

}
