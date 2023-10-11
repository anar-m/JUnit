package day11_fileTestleri_Waits;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ReusableMethods;

import java.time.Duration;

public class Practice {


    @Test
    public void DinamicContent() throws InterruptedException {

        // WebDriver ayarlarını implicitlyWait kullanmadan yapın
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // "https://the-internet.herokuapp.com/dynamic_loading" adresine gidiniz
        driver.get("https://the-internet.herokuapp.com/dynamic_loading");

        // "Example 1: Element on page that is hidden" linkine tıklayın ("//a[text()='Example 1: Element on page that is hidden'])
        WebElement exapmle1 = driver.findElement(By.xpath("//a[text()='Example 1: Element on page that is hidden']"));
        exapmle1.click();
        ReusableMethods.bekle(1);

        // start a tılayın ("//*[text()='Start']"));
        WebElement start = driver.findElement(By.xpath("//*[text()='Start']"));
        start.click();
        ReusableMethods.bekle(1);

        // çıkan yazının görüntülendiğini test edin ("//*[text()='Hello World!']"));
        WebElement cikanYaziElementi = driver.findElement(By.xpath("//*[text()='Hello World!']"));

        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cikanYaziElementi));

        Assert.assertTrue(cikanYaziElementi.isDisplayed());


        // anasayfaya geri gelin
        driver.navigate().back();


        // "Example 2: Element rendered after the fact" linkine tıklayın
        WebElement exapmle2 = driver.findElement(By.xpath("//*[text()='Example 2: Element rendered after the fact']"));
        exapmle2.click();
        ReusableMethods.bekle(1);

        // start a tılayın
        WebElement start2 = driver.findElement(By.xpath("//*[@id=\"start\"]/button"));
        start2.click();
        ReusableMethods.bekle(1);

        driver.close();


    }
}
