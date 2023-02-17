package daye04_JunitFrameWork;

import org.junit.Assert;
import org.junit.Test;

public class C01_Assertons_deneme {

     /*
        JUnit testlerin passed veya failed olduguna
        kodlari calistirirken sorun olusup olusmamasina gore karar verir
     */
    String str="Ali";
    String str2="ali";
    @Test
    public void test01(){
        // str1'in str2'e esit oldugunu test edin
        Assert.assertEquals("karsilastirilan degerler farkli "+str,str2);

    }
    @Test
    public void test02(){
        Assert.assertTrue(str.contains("a"));

    }
    @Test
    public void test03(){
        // str2'nin c harfini icermedigini test edin
        Assert.assertFalse(str2.contains("a"));


    }
}
