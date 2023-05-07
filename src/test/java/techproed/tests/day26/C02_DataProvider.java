package techproed.tests.day26;

import org.testng.annotations.Test;
import techproed.utilities.DataProvidersUtils;

public class C02_DataProvider {
    @Test(dataProvider = "sehirVerileri", dataProviderClass = DataProvidersUtils.class)
    public void test1(String ad, String bolge, String plaka){
        System.out.println(ad + bolge + plaka);
    }


    @Test(dataProvider = "kullanicilar", dataProviderClass = DataProvidersUtils.class)
    public void test2(String username, String password){
        System.out.println(username+" "+password);
    }
}

