package p_09_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Zadatak5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://s.bootsnipp.com/iframe/z80en";
        driver.navigate().to(url);
        List <WebElement> kolona = driver.findElements(By.xpath("//*[@id='lorem']/table/tbody/tr/td[1]"));
        for (int i = 0; i < kolona.size(); i++) {
          String text = kolona.get(i).getText();
          Thread.sleep(1000);
            System.out.println(text);
        }
//        za red:
//        List<WebElement> red = driver.findElements(By.xpath("//*[@id='lorem']/table/tbody/tr[1]/td"));
//        for (int i = 0; i < red.size(); i++) {
//            String text = red.get(i).getText();
//            Thread.sleep(1000);
//            System.out.println(text);
//        }

        driver.quit();



    }
}
