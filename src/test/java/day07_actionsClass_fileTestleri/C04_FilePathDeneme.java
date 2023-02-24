package daye07_actionsClass_fileTestleri;

import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FilePathDeneme {
    @Test
    public void test01(){
        //C:\Users\hasan\OneDrive\Desktop

        String dosyaYolu="C:\\Users\\hasan\\OneDrive\\Desktop\\TheDelta.docx";
        boolean sonuc= Files.exists(Paths.get(dosyaYolu));
        System.out.println(sonuc);
        /*
            Bilgisayarimizda bir dosyanin var oldugunu test etmek icin
            dosya yoluna ihtiyacimiz var
            Ancak herkesin bilgisayarindaki dosya yollari
            farkliliklar gosterir
            herkesin bilgisayarina gore farkli olan kismi
            java'dan bir komut ile elde edebiliriz
         */
        System.out.println(System.getProperty("user.home"));
        dosyaYolu="C:\\Users\\hasan\\OneDrive\\Desktop\\TheDelta.docx";
        dosyaYolu=System.getProperty("user.home"+ "\\Desktop\\TheDelta.docx");

        System.out.println(System.getProperty("user.dir"));


    }
}
