package utilities;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
public class ConfigReader {

    //Bunu projede bir kere yapiyoruz.
    // sonraki projeler icin kopyala yapistir yapabilirsiniz dedi hoca.
    // Dosya Yolu? Bunu ben yazdim.

    // 1- Properties objesi olusturacagiz
    static Properties properties;

    // 2- Bu class'in amaci configuration.properties dosyasini okumak
    //    ve oraadaki key value ikililerini kullanarak istedigimiz key'e
    //    ait value'yu bize getirmek

    static {
        String dosyaYolu="configuration.properties";

        try {
            FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
            //configuration.properties dosyasini okumak icin fileInputStream...
            properties=new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // IOException FileNotFounException dan daha buyuk.Boyle olunca
        //  mesela; ikinci buyuk, ilki kucuk ve ilkini silsem birsey
        //  kacirmam, o zaman ilki silinebilir


    }

    // 3- test class'larindan configReader class'ina ulasip yukaridaki
    // islemleri yapmamizi saglayacak bir method olusturacagiz
    public static String getProperty(String key){

        //Ben bu methoda String key gonderecegim, o da bana value döndürecek.
        String value=properties.getProperty(key);
        // bIz herseyi properties objesine yuklemistik
        return value;

    }
}