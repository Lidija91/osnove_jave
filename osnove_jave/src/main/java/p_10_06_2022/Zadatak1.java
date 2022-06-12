package p_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://cms.demo.katalon.com/my-account/";

        driver.get(url);
        WebElement rememberMe = driver.findElement(By.xpath("//*[@name='rememberme']"));
        rememberMe.click();


    }
}
