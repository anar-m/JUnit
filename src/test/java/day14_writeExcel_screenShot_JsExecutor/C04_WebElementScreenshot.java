package day14_writeExcel_screenShot_JsExecutor;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.io.File;
import java.io.IOException;

public class C04_WebElementScreenshot extends TestBase {

    @Test
    public void test01() throws IOException {

        // amazon'a gidelim
        driver.get("https://www.amazon.com");

        // Nutella için arama yapalım
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        // sonuçların Nutella içerdiğini test edelim
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));

        String expectedicerik ="Nutella";
        String actualSonucYazisi = sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(expectedicerik));

        // rapora eklenmek için sonuç yazının screenshot'ını alalım
        File sonucYazisiSS = new File("target/screenShot/sonucYazisi.jpg");
        File geciciResim = sonucYaziElementi.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim,sonucYazisiSS);
        ReusableMethods.WebElementFotografiCek(sonucYaziElementi,"NutellaArama");
    }
}
