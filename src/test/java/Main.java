import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/ACER/Desktop/styczen/index.html");
        System.out.println("adrs strony to " +  driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        WebElement pierwszyParagraf = driver.findElement(By.tagName("p"));
        String zawartosc = pierwszyParagraf.getText();

        System.out.println(zawartosc);
        driver.quit();

    }
}
