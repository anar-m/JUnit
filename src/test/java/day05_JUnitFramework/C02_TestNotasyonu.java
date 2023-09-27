package day05_JUnitFramework;


import org.junit.Ignore;
import org.junit.Test;

public class C02_TestNotasyonu {
    /*
    @Test notasyonu sıradan methodları
    bağımsız olarak çalıştırabilmemize imkan tanır

    böylece main method bağımlılığı ortadan kalkar ve
    istediğimiz tesiti tek başına veya class level'dan topluca çalıştırabiliriz

    ayrıca ilerde göreceğimiz şekilde
    test methodlarını belirli gruplara dahil edip
    toplu olarak da çalıştırabiliriz

    Test notasyonuna sahip methodlar
    toplu olarak çalıştırıldığında
    hangi sıra ile çalışacağına dair bir kural yoktur
    JUnit bu konuda bir yöntem geliştirmemiştir
    çalışma sırası ÖNGÖRÜLEMEZ ve KONTROL EDİLEMEZ

    Eğer isimlerini Test01, Test02, Test03 yazarsak
    o sıra da çalıştırıyor

    Eğer bir test method' u @Ignore olarak işaretlenirse
    Selenium o method'u ignore eder
    çalıştırmaz

    JUnit bize çalışan testlerden kaçının Passed
    kaçının Failed olduğunu verir
    Ancak JUnit testlerin geçip geçmediğini kodlarda
    bir sorun yaşanıp yaşanmamasına bağlar
    yani kodlar sorunsuz çalışırsa test passed,
    bir exception oluşursa test Failed olarak kaydedilir


     */
    @Test
    public void amazonTest(){
        System.out.println("amazonTest çalıştı");
    }
    @Test @Ignore
    public void youTest(){
        System.out.println("youTest çalıştı");
    }
    @Test
    public void wiseTest(){
        System.out.println("wiseTest çalıştı");
    }

    @Test
    public void test04(){
        // verilen iki sayıdan sayı1'in daha büyük olduğunu test edin
        int sayi1 = 10;
        int sayi2 = 50;

        if (sayi1 > sayi2){
            System.out.println("Karşılaştırma testi PASSED");
        }else {
            System.out.println("Karşılaştırma testi FAILED");
            throw new IllegalArgumentException();
        }

    }
}
