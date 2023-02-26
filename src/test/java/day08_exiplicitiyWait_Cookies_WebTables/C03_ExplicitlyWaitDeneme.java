package day08_exiplicitiyWait_Cookies_WebTables;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class C03_ExplicitlyWaitDeneme {
@Test
    public void test(){
    //3. https://the-internet.herokuapp.com/dynamic_controls adresine gidin.
    WebDriverManager.chromedriver().setup();
    WebDriver driver= new ChromeDriver();
    driver.manage().window().maximize();

    driver.get("https://the-internet.herokuapp.com/dynamic_controls");


    //4. Textbox’in etkin olmadigini(enabled) dogrulayın
    WebElement textBox= driver.findElement(By.xpath("//input[@type='text']"));

    Assert.assertFalse(textBox.isEnabled());
//5. Enable butonuna tıklayın ve textbox etkin oluncaya kadar bekleyin

    WebElement enableElementi= driver.findElement(By.xpath("(//button[@type='button'])[2]"));
    enableElementi.click();
    // explicit wait ile bekleyeceksek
    // A- wait objesi olustur
    WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(40));

    wait.until(ExpectedConditions.elementToBeClickable(textBox));
    //6. “It’s enabled!” mesajinin goruntulendigini dogrulayın.

    WebElement itsEnabled= driver.findElement(By.xpath("//p[@id='message']"));

    Assert.assertTrue(itsEnabled.isDisplayed());
//7. Textbox’in etkin oldugunu(enabled) dogrulayın.
    Assert.assertTrue(textBox.isEnabled());
    driver.close();
}

}
