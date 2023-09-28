package day07_assertions_chechBox;

import org.junit.Test;
import utilities.TestBase;

public class C05_TestBaseIlkClass extends TestBase {

    @Test
    public void test01(){
        driver.get("https://www.amazon.com");
        bekle(3);
    }
}
