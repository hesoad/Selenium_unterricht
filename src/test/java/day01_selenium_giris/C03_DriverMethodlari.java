package day01_selenium_giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Amazon anasayfaya gidin gitti
        driver.get("https://www.amazon.com");
        // ginizsayfadaki tittle  ve url yi yazdirin
        System.out.println("URL: "+ driver.getCurrentUrl());
        System.out.println("Baslik: "+ driver.getTitle());

        // amazon ana sayfaya gittiginizi test edin

        // Test expectet result ile actual result in karsilastirilmasidir
        String expectetIcerik="amazon";
        String actualUrl= driver.getCurrentUrl();

        if(actualUrl.equals(expectetIcerik)){// amamzon aanasyafaya gitti isek
            System.out.println("Test passed");

        } else {
            System.out.println("test failed");
        }

    }
}
