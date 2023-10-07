package Practice;

import org.junit.Ignore;
import org.junit.Test;

public class P01 {
    /*
        @BeforeClass --------> Sadece bir kere çalışıyor
        @Before     ---------> Her testten önce bir kere çalışır
        @After      ---------> Her testin sonunda bir kere çalışır
        @AfterClass ---------> Tüm testler bitince bir kere çalışır

        @Test       --------> Test kodlarının yer aldığı kısımdır

     */

    @Test
    public void ahmet(){

        System.out.println("Ahmet");
    }

    @Test @Ignore
    public void mustafa(){
        System.out.println("Mustafa");
    }

    @Test
    public void yüksel(){
        System.out.println("Yüksel");
    }




}
