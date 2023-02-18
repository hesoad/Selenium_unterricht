package Aufgaben;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_tekrarTesti {

/* ...Exercise3...
    go to url : https://www.techlistic.com/p/selenium-practice-form.html
    fill the firstname
    fill the lastname
    check the gender
    check the experience
    fill the date
    choose your profession -> Automation Tester
    choose your tool -> Selenium Webdriver
    choose your continent -> Antartica
    choose your command  -> Browser Commands
    click submit button
 */
public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get(" https://www.techlistic.com/p/selenium-practice-form.html");

    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hasan");
    driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Adiguzel");
    WebElement gender=driver.findElement(By.xpath("//b[text()='Gender']"));
    if (gender.isDisplayed()){
        System.out.println("test passed");
    }else{
        System.out.println("test failed");
    }
    WebElement experince=driver.findElement(By.xpath("//span[text()='Years of Experience']"));
    if (experince.isDisplayed()){
        System.out.println("test passed");
    }else{
        System.out.println("test failed");
    }
    driver.findElement(By.cssSelector("#datepicker")).sendKeys("17.01.2022");

    driver.findElement(By.xpath("//button[@id='ez-accept-all']")).click();
    //WebElement close1=driver.findElement(By.xpath("//span[@class='ns-nj6y4-e-16']"));

   // close1.click();
    driver.findElement(By.cssSelector("#profession-1")).click();

    driver.findElement(By.cssSelector("#tool-2")).click();

   WebElement antartica= driver.findElement(By.xpath("//select[@id='continents']"));
   antartica.sendKeys("Antartica");
   antartica.submit();





    
    




}





}
