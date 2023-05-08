package techproed.tests.practice_day01;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.FacebookPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class C04_PageClassKullanimi {
    // facebook anasayfaya gidin
    // kullanıcı email kutusuna rastgele bir isim yazın
    // kullanıcı sifre kutusuna rastgele bir password yazın
    // giris yap butonuna tıklayın
    // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin
    // sayfayı kaptın

    @Test
    public void test01() {
        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        FacebookPage facebookPage = new FacebookPage();
        Faker faker = new Faker();

        // kullanıcı email kutusuna rastgele bir isim yazın
        facebookPage.emailKutusu.sendKeys(faker.internet().emailAddress());


        // kullanıcı sifre kutusuna rastgele bir password yazın
        facebookPage.sifreKutusu.sendKeys(faker.internet().password());


        // giris yap butonuna tıklayın
        facebookPage.girisYap.click();


        // girdigin sifre yanlıs yazı elementinin, gorunur oldugunu test edin
        Assert.assertTrue(facebookPage.isntConnected.isDisplayed());


        // sayfayı kaptın

    }
}
