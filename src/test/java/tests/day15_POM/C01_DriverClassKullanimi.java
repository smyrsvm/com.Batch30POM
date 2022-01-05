package tests.day15_POM;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DriverClassKullanimi {

    @Test
    public void test(){

        // Driver yazdiktan sonra iki tane secenek cikiyor. Biri javadan, biri utilities den bizim olusturdugumuz
        // Utilities den kendi olusturdugumuzu seciyoruz.

        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("CHUrl"));

        //Driver driver=new Driver();//esitligin sagi konstruktor, solu data turu veya class??

        // Driver clasiindan obje uretilemesin istedigimiz icin Driver classi
        //SINGLETON yapiyouz.Bunun icin default constructor yerine parametresiz bir
        //constructor olusturup access modifieri private seciyoruz.BUna singleton yapi denir.

        //Driver driver=new Driver("ben istedim ama olmadi"); Peki parametreli constructor olusturayim desem
        // Driver classinda parametreli constructor olmadigi icin kullanamayiz


        Driver.closeDriver();

    }



}
