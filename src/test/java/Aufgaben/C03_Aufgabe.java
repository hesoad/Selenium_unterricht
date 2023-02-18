package Aufgaben;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_Aufgabe {
    public static void main(String[] args) throws InterruptedException {


         /*
    Navigate to website https://testpages.herokuapp.com/styled/index.html
    Under the ORIGINAL CONTENTS
    click on Alerts
    print the URL
    navigate back
    print the URL
    Click on Basic Ajax
    print the URL
    enter value 20 and ENTER
    and then verify Submitted Values is displayed open page
    close driver
     */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Navigate to website https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        //Under the ORIGINAL CONTENTS

        //    click on Alerts

        driver.findElement(By.xpath("//a[@id='alert']")).click();
        //print the URL

        driver.getCurrentUrl();

        //navigate back
        driver.navigate().back();

        //Click on Basic Ajax
        driver.findElement(By.xpath("//a[@id='basicajax']")).click();

       WebElement yazdir= driver.findElement(By.id("lteq30"));
       yazdir.sendKeys("20"+ Keys.ENTER);

       //and then verify Submitted Values is displayed open page
       WebElement gorunurMu= driver.findElement(By.id("Submitted Values"));
       if (gorunurMu.isDisplayed()){
           System.out.println("test passed");
       }else {
           System.out.println("test failed");
       }



        Thread.sleep(3000);
        driver.close();


    }
}
