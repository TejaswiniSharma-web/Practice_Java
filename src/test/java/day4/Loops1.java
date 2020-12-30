package day4;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.WeakHashMap;

public class Loops1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.wikipedia.org");
        List<WebElement> lang =driver.findElements(By.xpath("//select[@id='searchLanguage']/option"));
        System.out.println("Total length"+lang.size());
     for (int i =0;i <lang.size();i++) {
         System.out.println(lang.get(i).getText());
     }
        Thread.sleep(2000);
        driver.quit();

    }
}
