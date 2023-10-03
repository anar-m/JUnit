package day11_fileTestleri_Waits;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_DinamikDosyaYoluolusturma {
     /*
            Testlerimizin farkli bilgisayarlarda da calismasi gerekiyorsa
            file testleri icin gerekli olan DOSYA YOLU dinamik yapilmalidir

            Java'da dosya yolunu kodun calistigi bilgisayardan
            otomatik olarak almak icin 2 secenek vardir

            System.getProperty("user.home") ===> bilgisayarin ana dosya yolunu verir
            System.getProperty("user.dir")  ===>
         */

    @Test
    public void test01(){
        // Masaüztümüzde bulunan logo.jpg dosyasının varlığını
        // dinamik dosya yolu kullanarak test edelim.

        // "C:\Users\musta" + "\OneDrive\Masaüstü\logo.jpg"
        //    Ana dosya yolu    Herkes de aynı olan kısım

        // String dinamikDosyaYolu = System.getProperty("user.home") + "\\OneDrive\\Masaüstü\\logo.jpg";
       //  System.out.println(dinamikDosyaYolu); // C:\Users\musta\OneDrive\Masaüstü\logo.jpg
        String dinamikDosyaYolu = System.getProperty("user.home") + "\\OneDrive\\Masaüstü\\logo.jpg" ;
        System.out.println(dinamikDosyaYolu);

        Assert.assertTrue(Files.exists(Paths.get(dinamikDosyaYolu)));

        System.out.println(System.getProperty("user.dir"));
        // C:\Users\musta\IdeaProjects\Team120_JUnit_Fall2023

        // Projemizde var olan text.txt 'nin varlığını
        // dinamik dosya yolu ile test edelim.

        //C:\Users\musta\IdeaProjects\Team120_JUnit_Fall2023\src\test\java\day11_fileTestleri_Waits\text.txt

        String dinamikTextDosyayolu = System.getProperty("user.dir")
                                        + "\\src\\test\\java\\day11_fileTestleri_Waits\\text.txt";

        Assert.assertTrue(Files.exists(Paths.get(dinamikTextDosyayolu)));
    }
}
