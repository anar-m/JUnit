package day11_fileTestleri_Waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class C01_fileDownload extends TestBase {

    @Test
    public void indirmeTesti(){

        // C:\Users\musta\OneDrive\Masaüstü\logo.jpg
        //2. https://the-internet.herokuapp.com/download adresine gidelim.
        driver.get("https://the-internet.herokuapp.com/download");

        //3. logo.jpg dosyasını indirelim
        bekle(1);
        driver.findElement(By.xpath("//a[text()='logo.jpg']")).click();
        bekle(1);

        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim
        bekle(5);
        String dosyaYolu = "C:\\Users\\musta\\Downloads\\logo.jpg";


        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));
        bekle(2);
    }
}
