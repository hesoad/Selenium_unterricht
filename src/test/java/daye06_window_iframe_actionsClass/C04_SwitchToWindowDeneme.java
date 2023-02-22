package daye06_window_iframe_actionsClass;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04_SwitchToWindowDeneme extends TestBase {

    @Test
    public void test01(){
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        driver.get("https://the-internet.herokuapp.com/windows");
        //● Sayfadaki textin “Opening a new window” olduğunu doğrulayın.

        WebElement ilksayfayazielementi= driver.findElement(By.tagName("h3"));
        String expectedYazi="Opening a new window";
        String actualYazi= ilksayfayazielementi.getText();
        Assert.assertEquals(expectedYazi,actualYazi);
        //● Sayfa başlığının(title) “The Internet” olduğunu doğrulayın.
        String expectedTitle="The Internet";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
        bekle(2);
        String ilkSayfaWhd= driver.getWindowHandle();
        //● Click Here butonuna basın.


    }

}
