package tests.day14_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.TestBase;

public class C01_ConcortHotelLoginPositive extends TestBase {
    @Test
    public void positiveLoginTest() throws InterruptedException {
        // 	https://www.concorthotel.com/ adresine git
        driver.get("https://www.concorthotel.com/");

        ConcortHotelPage concortHotelPage=new ConcortHotelPage(driver);
        //	login butonuna bas
        concortHotelPage.ilkLoginLinki.click();
        //	test data username: manager ,

        Thread.sleep(5000);
        concortHotelPage.usernameKutusu.sendKeys("manager");
        //	test data password : Manager1!
        Thread.sleep(5000);


        concortHotelPage.passwordKutusu.sendKeys("Manager1!");
        //Manager1!
        Thread.sleep(5000);
        concortHotelPage.loginButonu.click();
        Thread.sleep(3000);


        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(concortHotelPage.basariliGirisYaziElementi.isDisplayed());
    }
}