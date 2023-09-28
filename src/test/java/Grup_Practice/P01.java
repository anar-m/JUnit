package Grup_Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {
     /*
        1) Bir class oluşturun: BestBuyAssertions
        2) https://www.bestbuy.com/ Adresine gidin farkli test method’lari olusturarak
        asagidaki testleri yapin
        ○ Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
        ○ titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin
        ○ logoTest => BestBuy logosunun görüntülendigini test edin
        ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
     */

    static WebDriver driver;
    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.bestbuy.com/");
    }

    @AfterClass
    public static void teardown(){
        driver.close();
    }
    @Test
    public void urlTest(){
        // Sayfa URL’inin https://www.bestbuy.com/ ‘a esit oldugunu test edin
       String actulaUrl = driver.getCurrentUrl();
       String expectedUrl = "https://www.bestbuy.com/";

        Assert.assertEquals("Url istenilen metni içermiyor",actulaUrl,expectedUrl);

    }

    @Test
    public void textTest(){
         // titleTest => Sayfa başlığının “Rest” içermediğini(contains) test edin

        String expectedtitleIcerik = "Rest";
        String actualTitleSayfaIcerik = driver.getTitle();

        Assert.assertFalse("Başlık Rest içermektedir.", expectedtitleIcerik.contains(actualTitleSayfaIcerik));
    }

    @Test
    public void logoTest(){
        // logoTest => BestBuy logosunun görüntülendigini test edin
        WebElement logo = driver.findElement(By.xpath("(//*[@class=\"logo\"])[1]"));


        Assert.assertTrue("logo görünmüyor", logo.isDisplayed());

    }
    @Test
    public void francaisTesti(){
        //      ○ FrancaisLinkTest => Fransizca Linkin görüntülendiğini test edin
        WebElement francaisLinkElementi = driver.findElement(By.xpath("//button[normalize-space()='Français']"));
        Assert.assertTrue(francaisLinkElementi.isDisplayed());
    }

}
