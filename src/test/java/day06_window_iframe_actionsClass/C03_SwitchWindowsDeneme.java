package day06_window_iframe_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C03_SwitchWindowsDeneme extends TestBase {

    @Test
    public void test01(){
        driver.get("https://www.amazon.com");

        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isDisplayed());
        String amazonWHD= driver.getWindowHandle();
        bekle(2);

        // yeni bir tab olarak wisequarter.com'a gidin
        /* once yeni bir tab olusturup
           driver'i o sayfaya gecirmeliyiz (switch)
         */
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wisequarter.com");
        // url'in wisequarter icerdigini test edin

        String expectedIcerik="wisequarter";
        String actualUrl= driver.getCurrentUrl();

        Assert.assertTrue(actualUrl.contains(expectedIcerik));

        String wiseWHD= driver.getWindowHandle();
        // amazon'un acik oldugu tab'a geri donup
        driver.switchTo().window(amazonWHD);

        // Nutella icin arama yapin
        aramaKutusu.sendKeys("Nutella");
        // Sonuclarin Nutella icerdigini test edin
        String actualSoucYazis= driver
                .findElement(By.xpath("//*[@id=\"search\"]/span/div/h1"))
                .getText();
        expectedIcerik="Nutella";
        Assert.assertTrue(actualSoucYazis.contains(expectedIcerik));

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("youtube");
        // Url'in youtube icerdigini test edin
        expectedIcerik="youtube";
        actualUrl= driver.getCurrentUrl();
        Assert.assertTrue(expectedIcerik.contains(actualUrl));
        bekle(3);
        // wisequarter'in acik oldugu sayfaya donun
        driver.switchTo().window(wiseWHD);
        // Title'in Wise Quarter icerdigini test edin
        expectedIcerik="Wise Quarter";
        String actualTitle=driver.getCurrentUrl();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));
        bekle(3);


    }
}
