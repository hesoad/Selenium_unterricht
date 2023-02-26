package day08_exiplicitiyWait_Cookies_WebTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import java.util.List;

public class C05_WebtablesDeneme extends TestBase {
@Test
    public void test01(){

    //1."https://www.amazon.com" adresine gidin
    driver.get("https://www.amazon.com");
    Actions actions=new Actions(driver);
    actions.sendKeys(Keys.END).perform();

    //3.Web table tum body’sini yazdirin
    WebElement tumBody= driver.findElement(By.xpath("//tbody"));
    System.out.println(tumBody.getText());
    //4.Web table’daki satir sayisinin 10 oldugunu test edin
    List<WebElement>satirSayisiElementi=driver.findElements(By.xpath("//tbody/tr"));
//5.Tum satirlari yazdirin
    for (WebElement eachSatir:satirSayisiElementi) {

        System.out.println(eachSatir.getText());

    }


}
}
