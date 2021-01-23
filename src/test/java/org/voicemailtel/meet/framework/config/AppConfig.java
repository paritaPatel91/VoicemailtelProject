package org.voicemailtel.meet.framework.config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class AppConfig {

    private static AppConfig instance;

    //To read the properties of file;

    private Properties properties;

    private AppConfig() {
        Path path = Paths.get("src/test/resources/framework.properties");
        try {
            FileInputStream stream = new FileInputStream(path.toFile());
            properties = new Properties();
            properties.load(stream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }

    }

    public static String getProperties(String key) {
        if (instance==null){
            instance = new AppConfig();
        }
        return instance.properties.getProperty(key);
        }

    }





