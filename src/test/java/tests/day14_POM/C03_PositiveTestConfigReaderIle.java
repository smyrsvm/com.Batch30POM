package tests.day14_POM;

import org.testng.annotations.Test;
import pages.ConcortHotelPage;
import utilities.ConfigReader;
import utilities.TestBase;

public class C03_PositiveTestConfigReaderIle extends TestBase {


    @Test
    public void positiveTestCongig(){

        // https://www.concorthotel.com/ adresine git
        // ConfigReader daki methodumu static yapmistim, dolayisiyla artik class ismi ve method ismi ile cagirabilirim
        driver.get(ConfigReader.getProperty("CHUrl"));

        // login butonuna bas
        // ConcortHotelPage classindaki locatorlarima ulasmak icin, o classtan obje olustururum.
        ConcortHotelPage concortHotelPage= new ConcortHotelPage(driver);
        //ConfigReader git Configuration.properties den bana validUsername i getir diyoruz.
        //	test data username: manager ,
        concortHotelPage.usernameKutusu.sendKeys(ConfigReader.getProperty("CHValidUsername"));

        //	test data password : Manager1!
        concortHotelPage.passwordKutusu.sendKeys(ConfigReader.getProperty("CHValidPassword"));
        concortHotelPage.loginButonu.click();

        //	Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et





    }






}
