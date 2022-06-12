package p_09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://s.bootsnipp.com/iframe/oV91g");

        List<WebElement> pages = driver.findElements(By.xpath("//a[contains(@class,'page_link')]"));
        for (int i = 0; i < pages.size(); i++) {
            pages.get(i).click();
            Thread.sleep(1000);
        }
        driver.quit();


    }
}
