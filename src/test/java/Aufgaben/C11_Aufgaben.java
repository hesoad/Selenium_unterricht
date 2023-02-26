package Aufgaben;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import static utilities.TestBaseClass.driver;

public class C11_Aufgaben extends TestBase {
    @Test
    public void test01() throws InterruptedException {
        //1. Launch browser
        //2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        //3. Verify that home page is visible successfully
        String expectedUrl = "https://automationexercise.com/";
        String actualUrl= driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        //4. Click on 'Contact Us' button
        driver.findElement(By.xpath("//a[@href='/contact_us']")).click();
        //5. Verify 'GET IN TOUCH' is visible
        WebElement getinTouch= driver.findElement(By.xpath("//h2[.='Get In Touch']"));
        Assert.assertTrue(getinTouch.isDisplayed());
        //6. Enter name, email, subject and message
        Actions actions=new Actions(driver);
        WebElement name= driver.findElement(By.xpath("//input[@name='name']"));
        actions.click(name)
                .sendKeys("Ahmet")
                .sendKeys(Keys.TAB)
                .sendKeys("ahmet@gmail.com")
                .sendKeys(Keys.TAB)
                .sendKeys("subject")
                .sendKeys(Keys.TAB)
                .sendKeys("your message here").perform();
        //7. Upload file
        String dinamikDosyaYolu= System.getProperty("user.home")+"\\OneDrive\\Desktop\\TheDelta.docx";
        WebElement chooseFileButonu= driver.findElement(By.xpath("//input[@type='submit']"));
        chooseFileButonu.sendKeys(dinamikDosyaYolu);
        //8. Click 'Submit' button
        WebElement input = driver.findElement(By.xpath("//input[@name='submit']"));
        input.submit();

        //9. Click OK button
        driver.switchTo().alert().accept();
        //10. Verify success message 'Success! Your details have been submitted successfully.' is visible
        WebElement success= driver.findElement(By.xpath("//div[.='Success! Your details have been submitted successfully.']"));
        Assert.assertTrue(success.isDisplayed());

        //11. Click 'Home' button and verify that landed to home page successfully
        driver.findElement(By.xpath("//span[.=' Home']")).click();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}