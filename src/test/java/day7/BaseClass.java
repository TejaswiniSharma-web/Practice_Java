package day7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
    private static ChromeDriver driver;

    public static WebDriver openBrowser(String browserName){
    if (browserName.equalsIgnoreCase("chrome")){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();

    }else  if (browserName.equalsIgnoreCase("firefox")){
        WebDriverManager.firefoxdriver().setup();
        driver= new ChromeDriver();

    }
    return driver;
    }
}
