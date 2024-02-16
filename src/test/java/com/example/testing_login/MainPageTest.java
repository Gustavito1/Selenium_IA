package com.example.testing_login;

import com.beust.ah.A;
import com.example.testing_login.activos.Login.TestIA;
import com.example.testing_login.activos.activo_fijo.Activo_Fijos_Page;
import com.example.testing_login.activos.activo_fijo.Activos_Fijos_acceso;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class MainPageTest {
    private final int WAIT_FOR_ELEMENT_TIMEOUT = 30;
    private WebDriver driver;
    private MainPage mainPage;
    private TestIA mainIA;
    private Activos_Fijos_acceso activo_fijo_acceso;
    private Activo_Fijos_Page activo_fijos_page;
    private Actions actions;


    @BeforeTest
    public void Initializebrowser(){
        //WebDriverManager.chromedriver().clearDriverCache().setup();
        //WebDriverManager.chromedriver().clearResolutionCache().setup();
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        // Fix the issue https://github.com/SeleniumHQ/selenium/issues/11750
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://localhost:8081");

        mainIA = new TestIA(driver);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test(testName = "Probar el login de IA")
    public void IAlogin() {
        mainIA = new TestIA(driver);
        mainIA.setUsername("admin");
        mainIA.setPassword("claveia");
        mainIA.clickLoginButton();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WAIT_FOR);
        WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("http://localhost:8081/menu"));

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        actions = new Actions(driver);

        activo_fijo_acceso = new Activos_Fijos_acceso(driver);
        activo_fijo_acceso.CollapseActivo_fijo.click();
        WebElement activofijowait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='/activos/activos-fijos']")));
        activofijowait.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        activo_fijos_page = new Activo_Fijos_Page(driver);
        WebElement activofijocreate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nuevo-activo-fijo")));
        activofijocreate.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        WebElement namesElement = driver.findElement(By.cssSelector("label[for=categoriaContableId]+div > span"));
        namesElement.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<WebElement> options = driver.findElements(By.cssSelector("label[for=categoriaContableId]+div > span > span > span"));

        for(WebElement option :options){
            String activeDescendant = option.getAttribute("aria-activedescendant");
            if(activeDescendant.equals("select2-categoriaContableId-ao-result-zqf2-5")){
               // System.out.printf("OPTION " + option.getText());
                option.click();
                break;
            }
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    @Test(testName = "Probar el acceso al activo-fijo")
    public void AccesoActivoFijos() {

    }

}
