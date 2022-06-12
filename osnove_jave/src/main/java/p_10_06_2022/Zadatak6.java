package p_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak6 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        String url = "file:///C:/Users/User/Downloads/Zadatak6.html";
        driver.get(url);
        WebElement showIn = driver.findElement(By.id("showInBtn"));
        for (int i = 0; i < 5; i++) {
            showIn.click();
            driver.findElement(By.id("id-" + i));
        }
        driver.quit();


    }
}
