package daye03_xpath_ccSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import java.time.Duration;

public class C05_RelativeLocators {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html\n");
        WebElement berlinElementi = driver.findElement(By.xpath("//*[@*='pid7_thumb']"));
        WebElement nycElementi = driver.findElement(By.xpath("//*[@*='pid3_thumb']"));
        WebElement bostonElementi = driver.findElement(By.xpath("//*[@*='pid6_thumb']"));
        WebElement seilorElementi = driver.findElement(By.xpath("//*[@*='pid11_thumb']"));

        /*
        selenium 4 ile yeni gelen bir ozellik
        olur da bir elementi locate edemezseniz 2 sey ile o elementi locate edebilirsiniz
        1- etrafinda bir web element (sag ,sol ustunde, altinda veya yakininda )
        2-locate edemedginiz webelemente ait bir ozelligi (value, attributte )kullaniriz
         */

        WebElement berlin1= driver.findElement(RelativeLocator.with(By.tagName("img")).below(nycElementi));
        System.out.println("Berlin1 id :"+berlin1.getAttribute("id"));


        WebElement berlin2= driver.findElement(RelativeLocator.with(By.tagName("img")).toRightOf(bostonElementi));
        System.out.println("Berlin2 id :"+berlin2.getAttribute("id"));

        WebElement berlin3= driver.findElement(RelativeLocator.with(By.tagName("img")).above(seilorElementi));
        System.out.println("Berlin3 id :"+berlin3.getAttribute("id"));

        driver.close();
    }
}
