package day12_cookies_webTables;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.List;

public class C03_FarkliWebTable extends TestBase {

    @Test
    public void webTableTest(){

        // 1. “https://demoqa.com/webtables” sayfasina gidin
        driver.get("https://demoqa.com/webtables");

        // 2. Headers da bulunan basliklari yazdirin
        List<WebElement> baslikElementleriList = driver.findElements(By.xpath("//*[@*='columnheader']"));
        for (WebElement each : baslikElementleriList
             ) {
            System.out.println(each.getText() + " ");
        }
        System.out.println("");

        // 3. 3.sutunun basligini yazdirin
        System.out.println("3.sütun başlığı : " + baslikElementleriList.get(2).getText());

        // 4. Tablodaki tum datalari yazdirin
        WebElement tumBodyElementi = driver.findElement(By.xpath("//*[@*='rt-tbody']"));
        System.out.println(tumBodyElementi.getText());
        // 5. Tabloda kac tane bos olmayan cell (data) oldugunu yazdirin
        List<WebElement> tumDataListesi = driver.findElements(By.xpath("((//*[@role='rowgroup']) //*[@role = 'gridcell'])"));

        int sayac = 0;
        for (WebElement each : tumDataListesi
             ) {
            if (each.getText().isBlank()){
                sayac++;
                System.out.println(sayac + " - " + each.getText());
            }
        }
        System.out.println("Boş olmayan hücre sayısı : " + sayac);
        // 6. Tablodaki satir sayisini yazdirin

        // 7. Tablodaki sutun sayisini yazdirin

        // 8. Tablodaki 3.kolonu yazdirin

        // 9. Tabloda “First Name” i Kierra olan kisinin Salary’sini yazdirin

        //10. Page sayfasinda bir method olusturun, Test sayfasindan satir ve sutun sayisini girdigimde bana datayi yazdirsin

        //*[@role='rowgroup'])[1] //*[@role = 'gridcell'])[5]
    }

}
