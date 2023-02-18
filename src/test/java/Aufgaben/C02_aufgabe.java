package Aufgaben;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_aufgabe {
    /* ...Exercise4...
    Navigate to  https://testpages.herokuapp.com/styled/index.html
    Click on  Calculater under Micro Apps
    Type any number in the first input
    Type any number in the second input
    Click on Calculate
    Get the result
    Print the result
     */
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // Navigate to  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        //Click on  Calculater under Micro Apps

        driver.findElement(By.id("calculatetest")).click();
        //Type any number in the first input

        WebElement toplama1= driver.findElement(By.id("number1"));

        toplama1.sendKeys("15");
        //Type any number in the second input

        WebElement toplama2= driver.findElement(By.id("number2"));

        toplama2.sendKeys("45");

        //Click on Calculate

        driver.findElement(By.id("calculate")).click();


        WebElement sonuc= driver.findElement(By.xpath("//span[@id='answer']"));
        sonuc.getText();

        Thread.sleep(3000);
        driver.close();


    }
}
