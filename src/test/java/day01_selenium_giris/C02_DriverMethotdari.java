package daye01_selenium_giris;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethotdari {
    public static void main(String[] args) throws InterruptedException {
          /*
            jar dosyalarini yukleyerek Selenium'u kullanilir hale getirdik
            ancak her bir class'in hangi browser ile calismasini istiyorsak
            o browser ile ilgili driver'i class'da tanimlamamiz lazim
            browser ile ilgili tercihimiz dogrultusunda
            ilgili ayarlari yapmak icin Java'daki System class'indan
            setProperty() kullanilir
            method'a 2 parametre ekleyecegiz
            1.parametre herkes icin ayni : webdriver.chrome.driver
            2.parametre bu driver'in dosya yolu
              herkesin bilgisayarinda farkli olabilir
              windows bilgisayarlarda sonunda .exe yazilmalidir
              mac'lerde .exe olmaz
         */


        System.setProperty("webdriver.chrome.dirver","drivers/chromedriver_win32/chromedriver.exe");

        WebDriver driver= new ChromeDriver();

        driver.get("https://wisequarter.com");
        Thread.sleep(3000);
        driver.close();

    }
}
