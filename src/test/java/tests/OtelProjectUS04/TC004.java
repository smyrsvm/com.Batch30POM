package tests.OtelProjectUS04;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.QAConcortPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TC004 {

    // US04  TC04

    /*@Test
    public void test() throws InterruptedException {
        //1- "Code" butonuna tiklar
        //2- "Name" butonuna tiklar
        //3- "Address" butonuna tiklar
        //4- "Phone" butonuna tiklar
        //5- "Email" butonuna tiklar
        //6- "IDGroup" butonuna tiklar ve dropdowndan hotel tipini secer
        //7- "Save" butonuna tiklar

        //Code: 2727 / Name: Lamia Selim Emin  /   Address: Athens    / Phone: +30 698 5454556  /
        // Email: 27Athens@gmail.com / Group: Hotel Type1

        QAConcortPage qaConcortPage= new QAConcortPage();
        qaConcortPage.ConcortHotelLogin();

        qaConcortPage.OtelEklemeHotelManagementMenüsü.click();
        qaConcortPage.OtelEklemeHotelList.click();
        qaConcortPage.US4AddHotelButonu.click();


        Actions actions=new Actions(Driver.getDriver());

        actions.
                click(qaConcortPage.US4CodeTextbox)
                .sendKeys(ConfigReader.getProperty("US04Code"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("US04Name"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("US04Adress"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("US04Phone"))
                .sendKeys(Keys.TAB)
                .sendKeys(ConfigReader.getProperty("US04Email"))
                .perform();

        Select select=new Select(qaConcortPage.US4IDGroupDropdown);
        select.selectByVisibleText(ConfigReader.getProperty("US04IDGroup"));

        actions.click(qaConcortPage.US4SaveButonu);


    } */

    /*
    * //US04 Locatorlari

    @FindBy (linkText = "System Management")
    public WebElement OtelEklemeSystemManagementMenüsü;

    @FindBy (xpath = "//tbody")
    public WebElement OtelEklemeListOfUsersTablosu;

    @FindBy (xpath = "//span[text()='Hotel Management']")
    public WebElement OtelEklemeHotelManagementMenüsü;

    @FindBy(partialLinkText = "Hotel List")
    public WebElement OtelEklemeHotelList;

    @FindBy (xpath = "//tbody")
    public WebElement OtelEklemeListOfHotelsTablosu;

    @FindBy (xpath = "//span[text()='Add Hotel ']")
    public WebElement US4AddHotelButonu;

    @FindBy (xpath="//div[@class=\"caption\"]")
    public WebElement US4CreateHotelYazisi;

    @FindBy(id = "code")
    public WebElement US4CodeTextbox;

    @FindBy (id = "IDGroup")
    public WebElement US4IDGroupDropdown;

    @FindBy (id = "btnSubmit")
    public WebElement US4SaveButonu;



    *
    *
    *
    *
    *
    * */



    /*  <?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>org.example</groupId>
    <artifactId>com.Batch30POM</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>11</maven.compiler.source>
        <maven.compiler.target>11</maven.compiler.target>
    </properties>

    <dependencies>

        <!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
        <dependency>
            <groupId>io.github.bonigarcia</groupId>
            <artifactId>webdrivermanager</artifactId>
            <version>4.4.3</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>3.141.59</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/org.testng/testng -->
        <dependency>
            <groupId>org.testng</groupId>
            <artifactId>testng</artifactId>
            <version>7.1.0</version>
            <scope>test</scope>
        </dependency>
        <!-- https://mvnrepository.com/artifact/com.github.javafaker/javafaker -->
        <dependency>
            <groupId>com.github.javafaker</groupId>
            <artifactId>javafaker</artifactId>
            <version>1.0.2</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>4.1.2</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.apache.poi/poi -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>4.1.2</version>
        </dependency>
        <dependency>
            <groupId>com.aventstack</groupId>
            <artifactId>extentreports</artifactId>
            <version>4.0.9</version>
        </dependency>


    </dependencies>

</project>*/






}
