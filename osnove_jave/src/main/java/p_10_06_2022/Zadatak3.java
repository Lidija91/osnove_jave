package p_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

public class Zadatak3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://www.ebay.com/";
        driver.get(url);
        driver.navigate().to(url);

        Select allCategory = new Select(driver.findElement(By.name("_sacat")));
        List<WebElement> sveOp = allCategory.getOptions();

        Random r = new Random();
        int next = r.nextInt(sveOp.size());

        allCategory.selectByIndex(next);

        driver.quit();




    }
}
