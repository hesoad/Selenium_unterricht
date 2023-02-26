package day01_selenium_giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_DriverMethodlariDeneme {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.ebay.com");

        System.out.println("Url: "+driver.getCurrentUrl());
        System.out.println("Baslik "+driver.getTitle());


        String actualSonucUrl= driver.getCurrentUrl();
        String expectedIcerik="ebay";

        if (actualSonucUrl.contains(expectedIcerik)){
            System.out.println("Tested passed");
        }else{
            System.out.println("Tested failed");
        }

        driver.close();
    }
}
