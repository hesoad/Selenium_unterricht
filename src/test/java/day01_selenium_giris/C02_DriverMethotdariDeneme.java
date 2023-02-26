package day01_selenium_giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethotdariDeneme {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.bestbuy.com");
        Thread.sleep(3000);
        driver.close();
    }
}
