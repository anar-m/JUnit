package practice;
import org.junit.*;

public class P02 {

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class çalıştı. Testler çalışmaya başlayabilir");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("Tüm testler başarıyla tamamlandı.");
    }

    @Before
    public void setUp(){
        System.out.println(" Yeni Bir Test Kodu Çalıştırılıyor");
    }

    @After
    public void tearDown(){
        System.out.println("Bu test tamamlandı. Sıradaki test çalıştırılacak");
    }

    @Test
    public void test01(){
        System.out.println("01 Numaralı test çalıştırıldı");
    }

    @Test
    public void test02(){
        System.out.println("02 Nolu test çalıştırıldı");
    }


}