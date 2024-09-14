package Base;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Base {
    protected   static WebDriver driver;
    public Properties property = new Properties();
    public static String host;


    public static void navigateURL(String url){
        driver.get(url);
    }
}
