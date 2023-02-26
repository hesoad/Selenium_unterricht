package day01_selenium_giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_DriverManageMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Max size: "+ driver.manage().window().getSize());
        System.out.println("Max position  "+driver.manage().window().getPosition());


        driver.manage().window().fullscreen();
        System.out.println("fulscreen size: "+ driver.manage().window().getSize());
        System.out.println("fullscren position"+driver.manage().window().getPosition());

        driver.quit();


    }
}
