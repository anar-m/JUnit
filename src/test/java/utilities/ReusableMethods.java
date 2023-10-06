package utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReusableMethods {


    public static void bekle(int saniye){

        try {
            Thread.sleep(saniye*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void tumSayfaFotografiCek(WebDriver driver, String resimAdi){
        // her screenshot'ın benzersiz bir isme sahip olması için
        // 1- method'u çağırıldığıı yerden resim adı istedik
        // 2- ssonuna tarih etiketi ekleyelim 2310062013

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmm");
        String tarihEtiketi = ldt.format(formatter);

        // target/screenShot/tumSayfaScreenshot.jpg
        String dinamikDosyaYolu = "target/screenShot/" + resimAdi + tarihEtiketi + ".jpg";


        TakesScreenshot tss = (TakesScreenshot) driver; // tss objesi oluşturduk

        File tumSayfaSS = new File(dinamikDosyaYolu); // kaydedeceğimiz yeri hazırladık

        File geciciDosya = tss.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(geciciDosya,tumSayfaSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void WebElementFotografiCek(WebElement webElement, String resimAdi){
        // her screenshot'ın benzersiz bir isme sahip olması için
        // 1- method'u çağırıldığıı yerden resim adı istedik
        // 2- ssonuna tarih etiketi ekleyelim 2310062013

        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmm");
        String tarihEtiketi = ldt.format(formatter);

        // target/screenShot/tumSayfaScreenshot.jpg
        String dinamikDosyaYolu = "target/screenShot/" + resimAdi + tarihEtiketi + ".jpg";


       File tumSayfaSS = new File(dinamikDosyaYolu); // kaydedeceğimiz yeri hazırladık

        File geciciDosya = webElement.getScreenshotAs(OutputType.FILE);

        try {
            FileUtils.copyFile(geciciDosya,tumSayfaSS);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
