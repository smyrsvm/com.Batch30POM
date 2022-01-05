package tests.day18_writeExcel;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class C01_WriteExcel {

    @Test
    public void test() throws IOException {

        // Dosya acikken yazdirma yaparsan bozulma meydana geliyor.

        // 1) Yeni bir Class olusturalim WriteExcel
        // 2) Yeni bir test method olusturalim writeExcelTest()
        // 3) Adimlari takip ederek 1.satira kadar gidelim
        String path= "src/test/java/resources/ulkeler.xlsx";  // Bunu path from content roottan yaptik.
        FileInputStream fis= new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(fis);
        // Bizim calistigimiz workbook ulkeler exceli degil,
        // ulkeler excelinin FileInputStream ve Workbook Objesi sayesinde kodlarimin icine alinmis hali
        // o excelin sanki bir kopyasini aldim. yaptigim degisiklikler o exceli degil benim kopyami etkiler
        // Klonuma sadece dolu yerleri alirim

        // 4) 4.hucreye yeni bir cell olusturalim
        // 5) Olusturdugumuz hucreye “Nufus” yazdiralim
        workbook.getSheet("Sayfa1").getRow(0).createCell(4).setCellValue("Nufus");
        // set cell value yu bos yaparsan silmis olur.

        // 6) 2.satir nufus kolonuna 1500000 yazdiralim
        workbook.getSheet("Sayfa1").getRow(1).createCell(4).setCellValue(1500000);

        // 7) 10.satir nufus kolonuna 250000 yazdiralim
        workbook.getSheet("Sayfa1").getRow(9).createCell(4).setCellValue(2500000);

        // 8) 15.satir nufus kolonuna 54000 yazdiralim
        workbook.getSheet("Sayfa1").getRow(14).createCell(4).setCellValue(54000);

        //9) Dosyayi kaydedelim Varolan exceli kapatin.dosya acikken yazma yapamaz, bozulma olabilir.
        FileOutputStream fos=new FileOutputStream(path);
        workbook.write(fos);

        //10)Dosyayi kapatalim. Dosya kapatmayi sonrada yapabilirsin.
        fis.close();
        fos.close();
        workbook.close();







    }




}
