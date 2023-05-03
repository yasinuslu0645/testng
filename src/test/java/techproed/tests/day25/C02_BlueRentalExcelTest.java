package techproed.tests.day25;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;
public class C02_BlueRentalExcelTest {
    @Test
    public void excelTest() {
        ExcelUtils excelUtils = new ExcelUtils("src/test/java/resources/mysmoketestdata.xlsx","customer_info");
        String email = excelUtils.getCellData(1,0);
        String password = excelUtils.getCellData(1,1);
        System.out.println(email+" || "+password);
        //Bluerantal car adresine gidelim.
        Driver.getDriver().get(ConfigReader.getProperty("blueRentACarUrl"));
        //Excel dosyamızdan aldıgımız ilk emaıl ve password ile sayfaya login olalım.
        BlueRentalPage blueRentalPage = new BlueRentalPage();
        blueRentalPage.login.click();//login buttonuna tıklar
        blueRentalPage.email.sendKeys(email, Keys.TAB,password,Keys.ENTER);
        //Login oldugumuzu dogrulyalım.
        Assert.assertTrue(blueRentalPage.verify.isDisplayed());
    }
}