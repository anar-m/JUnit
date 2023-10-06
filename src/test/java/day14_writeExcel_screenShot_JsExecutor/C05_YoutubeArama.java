package day14_writeExcel_screenShot_JsExecutor;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C05_YoutubeArama extends TestBase {

    @Test
    public void youtubeAramaTesti(){

        // youtube anasayfaya gidin
        driver.get("https://www.youtube.com");
        bekle(2);
        // cookies kabul edin
        // driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[16]")).click();

        // Ahmet bulutluoz için arama yapın
        WebElement aramaKutusu = driver.findElement(By.xpath("//input[@name='search_query']"));
        aramaKutusu.click();
        bekle(3);
        aramaKutusu.sendKeys("Ahmet Bulutluoz" + Keys.ENTER);

        // bulunan videolardan ilkinin isminde bulut geçtiğini test edin //*[@id="thumbnail"]/yt-image/img

        WebElement ilkVideoIsmi = driver.findElement(By.xpath("//a[@id='video-title']"));
        String expectedIcerik = "QA";
        String actualVideoIsmi = ilkVideoIsmi.getText();
        System.out.println(actualVideoIsmi);

        Assert.assertTrue(actualVideoIsmi.contains(expectedIcerik));


        // ilk videonun fotoğrafını çekin
        ReusableMethods.WebElementFotografiCek(ilkVideoIsmi,"Ahmet youtube");

        bekle(3);
    }
}
