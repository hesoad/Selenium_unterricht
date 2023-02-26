package day08_exiplicitiyWait_Cookies_WebTables;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C04_CookiesDeneme extends TestBase {

    @Test
    public void test01(){
        //1- Amazon anasayfaya gidin

        driver.get("https://www.amazon.com");

        //2- tum cookie’leri listeleyin
        Set<Cookie>cookiesSeti=driver.manage().getCookies();
        int siraNo=1;
        for (Cookie each:cookiesSeti) {
            System.out.println(siraNo + " " + each.toString());
            siraNo++;
        }
            //3- Sayfadaki cookies sayisinin 5’den buyuk oldugunu test edin
            Assert.assertTrue(cookiesSeti.size()>5);
            //4- ismi i18n-prefs olan cookie degerinin USD oldugunu test edin
            String actualValue=driver.manage().getCookieNamed("i18n-prefs").getValue();
            String ecpectedValue="USD";

            Assert.assertEquals(ecpectedValue,actualValue);


        //5- ismi “en sevdigim cookie” ve degeri “cikolatali” olan bir cookie olusturun ve sayfaya ekleyin

        Cookie benimCookie= new Cookie("En sevdigim cookie","cikolatali");
        driver.manage().addCookie(benimCookie);

        cookiesSeti=driver.manage().getCookies();
        siraNo=1;
        for (Cookie each :cookiesSeti) {
            System.out.println(siraNo + " " + each.toString());
            siraNo++;
        }
        //6- eklediginiz cookie’nin sayfaya eklendigini test edin

       actualValue=driver.manage().getCookieNamed("En sevdigim cookie").getValue();

       ecpectedValue= "cikolatali";
       Assert.assertEquals(ecpectedValue,actualValue);

        //7- ismi skin olan cookie’yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");
        cookiesSeti=driver.manage().getCookies();
        for (Cookie each:cookiesSeti) {
            Assert.assertFalse(each.getName().equals("skin"));

        }
        siraNo=1;
        for (Cookie each :cookiesSeti) {
            System.out.println(siraNo + " " + each.toString());
            siraNo++;
        }
        //8- tum cookie’leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();
        cookiesSeti=driver.manage().getCookies();
        Assert.assertTrue(cookiesSeti.size()==0);

    }
}
