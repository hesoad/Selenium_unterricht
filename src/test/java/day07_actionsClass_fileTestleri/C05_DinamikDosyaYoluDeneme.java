package daye07_actionsClass_fileTestleri;

import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C05_DinamikDosyaYoluDeneme {

    @Test
    public void test01(){
        // Masaustumuzde theDelta.docx isimli bir dosya bulundugunu test edin

        String dosyaYolu=System.getProperty("user.home") + "/OneDrive/Desktop/Thedelta.docx";
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


    }


}
