package day14_writeExcel_screenShot_JsExecutor;

import org.junit.Assert;
import org.junit.Test;
import utilities.ReusableMethods;
import utilities.TestBase;

public class C03_TumSayfaSSMethoduKullanma extends TestBase {

    @Test
    public void testWise(){

        //Wisequarter ana sayfaya gidin
        driver.get("https://www.wisequarter.com");

        // Url'in wise içerdiğini test edin
        String expectedIcerik = "wise";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));


        // sonucu raporlamak için tümsayfaSS alıp kaydedin
        ReusableMethods.tumSayfaFotografiCek(driver,"wise");

    }
    @Test
    public void testAB(){

        //ahmetbulutluoz.com ana sayfaya gidin
        driver.get("https://www.ahmetbulutluoz.com");

        // Url'in bulut içerdiğini test edin
        String expectedIcerik = "bulut";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));


        // sonucu raporlamak için tümsayfaSS alıp kaydedin
        ReusableMethods.tumSayfaFotografiCek(driver,"AB");

    }
    @Test
    public void testYoutube(){

        //youtube ana sayfaya gidin
        driver.get("https://www.youtube.com");

        // Url'in wise içerdiğini test edin
        String expectedIcerik = "youtube";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));

        // sonucu raporlamak için tümsayfaSS alıp kaydedin
        ReusableMethods.tumSayfaFotografiCek(driver,"youtube");

    }
}
