package utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import java.util.concurrent.TimeUnit;
public class Driver {

    // Driver classindan obje uretilmesini istemedigimiz icin Driver classi
    // SINGLETON yapiyouz.Bunun icin default constructor yerine parametresiz bir
    // constructor olusturup access modifieri private seciyoruz.BUna singleton yapi denir.
    private Driver(){ // Bu default constructor


    }

    private static WebDriver driver;
    // driver'i baska class'lardan sadece Driver class ismi ile cagirabilmek icin STATIC yaptik
    // henuz bu driver ile ilgili ayarlar yapmadigim icin baska class'lar bunu yanlislikla kullanmasin diye
    // erisimi private yaptik (sadece bu class'in kullanimina acik yaptik)

    public static WebDriver getDriver(){ // Bu methodu da class ismi ile cagirmak icin statik yaptim

        if (driver==null){
            // if'i bu method her calistiginda yeni bir driver olusturmamasi icin kullaniyorruz
            // if driver'i kontrol edecek eger bir deger atamasi yapildiysa yeni bir driver olusturmayacak
            // tekrar tekrar sayfa acmiyor, sen call ettin, geliyor drivera bakiyor bossa atama yapiyor
            // dolu ise bu if e hic girmeyip ayni driverdan devam ediyor, böylece ayni sayfada acmis oluyor

            switch (ConfigReader.getProperty("browser")) {
                // case'i driver'i istedigimiz browser'da calistirmak icin kullaniyoruz
                // configuration.properties dosyasinda browser olarak ne yazdiksa tum testlerimiz o browser'da calisacak
                // browser secimi yapilmadiysa default olarak chrome devreye girecek
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        }


        return driver;

    }

    public static void closeDriver(){

        if (driver!=null){
            driver.quit();
        }
        // burada yeniden null degeri atamamizin sebebi. bir sonraki getDriver method'u cagirisimizda
        // yeni deger atayabilmek istememizdir. Yukarida if`de bakiyor ya null mi degil mi diye.
        driver=null;

    }
}