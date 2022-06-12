package p_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Zadatak4 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String password = "ITBootcamp2021!";
        String demoqa = "https://demoqa.com/login";
        driver.manage().window().maximize();
        driver.get(demoqa);
        driver
                .findElement(By.id("userName"))
                .sendKeys("itbootcamp");
        driver.findElement(By.xpath("//*[@placeholder='Password']"))
                .sendKeys(password);
        driver.findElement(By.xpath("//form[@id='userForm']/div/div/button[1]"))
                .click();

        Thread.sleep(5000);

        if (elementExist(driver, By.xpath("//button[text()='Log out']")))
        {driver.findElement(By.xpath("//button[text()='Log out']"))
                .click();}
        else System.out.println("Neuspesan log in");

        driver.quit();



    }

    private static boolean elementExist(WebDriver driver, By by) {
        boolean elementExist = true;
        try {
            driver.findElement(by);
        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;
    }
}
