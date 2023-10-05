package day13_excelOtomasyonu;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_ReadExcel {

    @Test
    public void test01() throws IOException {
        // ilgili ayarları yapıp workbook2u oluşturun
        String dosyaYolu = "src/test/java/day13_excelOtomasyonu/ulkeler.xlsx";
        FileInputStream fis = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fis);

        // 2. sayfaya gidin

        Sheet sayfa2 = workbook.getSheet("Sayfa2");

        // kullanılan en son satırın 24. satır olduğunu test edin

        int expectedSonSatirNo = 24;
        int actualSonSatirNo = sayfa2.getLastRowNum()+1;
        Assert.assertEquals(expectedSonSatirNo,actualSonSatirNo);

        // fiziki kullanılan satır sayının 8 olduğunu test edin
        int expectedFizikiSatirSayisi = 8;
        int actualFizikiSatirSayisi = sayfa2.getPhysicalNumberOfRows();

        Assert.assertEquals(expectedFizikiSatirSayisi,actualFizikiSatirSayisi);

        // olmayan satır veya sütun numarası yazdırmaya çalışsak

        // System.out.println(sayfa2.getRow(30).getCell(1));  // NullPointerException

        System.out.println(sayfa2.getRow(5).getCell(10));  // null

    }
}
