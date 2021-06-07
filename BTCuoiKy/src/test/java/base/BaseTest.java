package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//customerid = 30246
//customerid = 54175
//account = 93432
public class BaseTest {
    private WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void BrowserOpen() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
//        driver.manage().window().maximize();
    }

    @Test
    public void TC001() {
        try{
            WebElement username = driver.findElement(By.name("uid"));
            username.sendKeys("mngr330797");
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("hUtahUm");
            WebElement login = driver.findElement(By.name("btnLogin"));
            login.submit();
            AssertJUnit.assertTrue(true);
        }catch (Exception e){
            AssertJUnit.assertTrue(false);
        }

    }

    @Test
    public void TC002() {
        try {
            WebElement username = driver.findElement(By.name("uid"));
            username.sendKeys("mngr330797");
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("123123");
            WebElement login = driver.findElement(By.name("btnLogin"));
            login.submit();
            AssertJUnit.assertTrue(true);
        }catch (Exception e){
            AssertJUnit.assertTrue(false);
        }
    }

    @Test
    public void TC003() {
        try{
            WebElement username = driver.findElement(By.name("uid"));
            username.sendKeys("vanhieu123");
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("hUtahUm");
            WebElement login = driver.findElement(By.name("btnLogin"));
            login.submit();
            AssertJUnit.assertTrue(true);
        }catch (Exception e){
            AssertJUnit.assertTrue(false);
        }

    }

    @Test
    public void TC004() {
        try{
            WebElement username = driver.findElement(By.name("uid"));
            username.sendKeys("");
            WebElement password = driver.findElement(By.name("password"));
            password.sendKeys("");
            WebElement login = driver.findElement(By.name("btnLogin"));
            login.submit();
            WebElement mess = driver.findElement(By.id("message23"));
            WebElement mess2 = driver.findElement(By.id("message18"));
            if(mess!=null || mess2 !=null){
                AssertJUnit.assertTrue(false);
            }
        }catch (Exception e){
            AssertJUnit.assertTrue(false);
        }

    }




}
