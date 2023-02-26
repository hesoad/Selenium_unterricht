package day01_selenium_giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C05_DriverNavigateMethodlari {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");

        driver.get("https://www.wisequarter.com");

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().to("https://www.youtube.com");

        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.quit();
    }
}
