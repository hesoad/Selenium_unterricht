package Aufgaben;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C09_Aufgaben extends TestBase {
    // 1. Launch browser
    @Test
    public void test01() {
        //  2. Navigate to url 'http://automationexercise.com'
        driver.get("http://automationexercise.com");
        // 3. Verify that home page is visible successfully
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("automationexercise"));
        // 4. Click on 'Signup / Login' button
        driver.findElement(By.xpath("//a[@href='/login']")).click();
        // 5. Verify 'New User Signup!' is visible
        WebElement usersihnup = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
        Assert.assertTrue(usersihnup.isDisplayed());
        // 6. Enter name and email address
        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("hasan" + Keys.ENTER);
        driver.findElement(By.xpath("(//input[@placeholder='Email Address'])[2]")).sendKeys("hasan1234@gmail.com" + Keys.ENTER);
        // 7. Click 'Signup' button
        // 8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        WebElement enter = driver.findElement(By.xpath("(//h2[@class='title text-center'])[1]"));
        WebElement isimKutusu=driver.findElement(By.xpath("//input[@id='id_gender2']"));
        Actions actions= new Actions(driver);
        Faker faker= new Faker();
        String fakeEmailAdress=faker.internet().emailAddress();
        // 9. Fill details: Title, Name, Email, Password, Date of birth
        actions.click(isimKutusu)
                .sendKeys(faker.name().name())
                .sendKeys(Keys.TAB)
                .sendKeys(fakeEmailAdress)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password())
                .sendKeys(Keys.TAB)
                .sendKeys("Januar")
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().fullAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().country())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().state())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().city())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.address().zipCode())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.phoneNumber().phoneNumber())
                .sendKeys(Keys.ENTER).perform();
    }

}
