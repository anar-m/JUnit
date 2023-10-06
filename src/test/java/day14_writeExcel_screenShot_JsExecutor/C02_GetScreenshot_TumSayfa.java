package day14_writeExcel_screenShot_JsExecutor;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C02_GetScreenshot_TumSayfa extends TestBase {

    @Test
    public void tumSayfaScreenshot() throws IOException {

        // amazon anasayfaya gidin
        driver.get("https://www.amazon.com");

        // Nutella için arama yapın
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // Sonucların Nutella içerdiğini test edin
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedicerik ="Nutella";
        String actualSonucYazisi = sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedicerik));

        // rapor için sayfanın fotoğrafını çekin

        // 1.adim TakeScreenshot objesi olusturma
        TakesScreenshot tss = (TakesScreenshot) driver;

        // 2.adim fotografi kaydedecegimiz dosyayi olusturalim, dosya yolunu yazalim
        File tumSayfaScreenshot = new File("target//screenShot//tumSayfaScreenshot.jpg");

        // 3.adim bir gecici dosya olusturup buna tss objesi ile cektigimiz fotografi kaydedelim
        File geciciResim = tss.getScreenshotAs(OutputType.FILE);

        // 4.adim gecici resmi asil dosyaya kopyalayalim
       FileUtils.copyFile(geciciResim,tumSayfaScreenshot);



        bekle(5);
    }
}
