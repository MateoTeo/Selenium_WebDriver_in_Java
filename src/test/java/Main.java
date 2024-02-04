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
        WebElement paragraf = driver.findElement(By.tagName("p"));
        // String zawartosc = pierwszyParagraf.getText();
        // System.out.println(zawartosc);

        List<WebElement> listaP = driver.findElements(By.tagName("p")); // znalezienie wszystkich paragrafów
        for (WebElement i:listaP) {
            System.out.println("element listy: " + i.getText());
        }

        WebElement pierwszyParagraf = driver.findElement(By.name("pierwszyParagraf"));
        System.out.println("Odnajdywanie po atrybucie name: " + pierwszyParagraf.getText());

        WebElement drugiParagraf = driver.findElement(By.id("drugiParagraf"));
        System.out.println("Odnajdywanie po atrybucie id: " + drugiParagraf.getText());

        WebElement trzeciParagraf = driver.findElement(By.className("new"));
        System.out.println("Odnajdywanie po atrybucie klasie: " + trzeciParagraf.getText());

        // xpath
        WebElement poXpath = driver.findElement(By.xpath("/html/body/h4"));
        System.out.println(poXpath.getText());

        WebElement podXpathDwa = driver.findElement(By.xpath("//h5[@class='xpath']"));
        System.out.println(podXpathDwa.getText());



        driver.quit();

    }
}
