package day11_fileTestleri_Waits;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C03_FileUploadTesti extends TestBase {

    @Test
    public void fileUploadTesti(){

        // 1.https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //2.chooseFile butonuna basalim
        //3.ext.txt dosyayi secelim.
        /*
            insan olarak dosya seçimi için
            choose file (dosya Seç) butonunan bastıktan sonra
            acilan windows dosya penceresinden
            istediğimiz dosyayı seçip yükleriz

            Selenium^da otomassyonla bu işi yapmak için
            DosyaSeç butonu locate edilip,
            bu webelement'e senKeys(yuklenecekDosyaninDosyaYolu); yapılır

         */
        WebElement uploadButtonelementi = driver.findElement(By.id("file-upload"));
        String dinamikDosyaYolu = System.getProperty("user.dir") + "/src/test/java/day11_fileTestleri_Waits/text.txt";

        uploadButtonelementi.sendKeys(dinamikDosyaYolu);

        //4.Upload butonuna basalim.
        driver.findElement(By.id("file-upload"));

        //5.“File Uploaded!” textinin goruntulendigini test edelim.
        WebElement fileUploadElementi = driver.findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadElementi.isDisplayed());
    }
}
