package p_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();


        String demoqa = "https://demoqa.com/modal-dialogs";
        driver.manage().window().maximize();
        driver.get(demoqa);

        driver.findElement(By.xpath("//*[@id='showLargeModal']"))
                .click();

        Thread.sleep(2000);

        if (elementExist(driver, By.xpath("//*[@id='showLargeModal']"))) {
            driver.findElement(By.xpath("//*[@id='example-modal-sizes-title-lg']"));
            System.out.println("Dijalog postoji");
        } else System.out.println("Dijalog ne postoji");

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
