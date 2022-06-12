package p_09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        ArrayList<String> nizStranica = new ArrayList<>();
        nizStranica.add("https://google.com/");
        nizStranica.add("https://youtube.com/");
        nizStranica.add("https://ebay.com/");
        nizStranica.add("https://kupujemprodajem.com/");
        for (int i = 0; i < nizStranica.size(); i++) {

            driver.navigate().to(nizStranica.get(i));
            System.out.println(driver.getTitle());
        }
        driver.quit();




    }
}
