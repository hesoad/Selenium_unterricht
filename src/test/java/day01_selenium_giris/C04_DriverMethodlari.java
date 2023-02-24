package daye01_selenium_giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_DriverMethodlari {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver_win32/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com");
        System.out.println(driver.getWindowHandle());
        //CDwindow-9494CE5A5300DD594BCE7243DD3C25B1
        //getwidowHandle selenium tarafindan her driver sayfasi icin
        // uretilen unique handle degerini dondurur
        //getWindowHandles() ise test sirasinda birden fazla sayfa acilmissa hepsinin handle degerini dondurur

        System.out.println(driver.getPageSource());
        //


        String expectedIcerik="ATVPDKIKX0DER";
        String actualIcerik= driver.getPageSource();

        if (actualIcerik.contains(expectedIcerik)){
            System.out.println("Test passed");

        }else{
            System.out.println("test failed");
        }
        driver.quit();
    }
}
