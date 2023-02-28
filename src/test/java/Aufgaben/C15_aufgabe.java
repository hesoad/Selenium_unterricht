package Aufgaben;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C15_aufgabe extends TestBase {

    @Test
    public void test01(){

        //1) http://demo.guru99.com/test/guru99home/ sitesine gidiniz
        driver.get("http://demo.guru99.com/test/guru99home");
        //2) sayfadaki iframe sayısını bulunuz.
        List<WebElement>iframeList=driver.findElements(By.tagName("iframe"));
        System.out.println(iframeList.size());
        //3) ilk iframe'deki (Youtube) play butonuna tıklayınız.
        WebElement iframe=driver.findElement(By.xpath("//iframe[@width='560']"));
        driver.switchTo().frame(iframe);
        WebElement play = driver.findElement(By.xpath("//button[@aria-label='Oynat']"));
        play.click();

        //4) ilk iframe'den çıkıp ana sayfaya dönünüz
        driver.switchTo().parentFrame();
        //5) ikinci iframe'deki (Jmeter Made Easy) linke
        WebElement frame2=driver.findElement(By.cssSelector("#a077aa5e"));
        driver.switchTo().frame(frame2);
        driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']")).click();
        //(https://www.guru99.com/live-selenium-project.html) tıklayınız
        driver.switchTo().parentFrame();
    }

}
