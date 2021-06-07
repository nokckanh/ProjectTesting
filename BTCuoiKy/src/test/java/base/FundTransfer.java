package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FundTransfer {
    private WebDriver driver;
    @BeforeClass
    public void BrowserOpen() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.demo.guru99.com/V4/");
//        driver.manage().window().maximize();
    }
    @BeforeClass
    public void LoginTest() {

        WebElement username = driver.findElement(By.name("uid"));
        username.sendKeys("mngr330797");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("hUtahUm");
        WebElement login = driver.findElement(By.name("btnLogin"));
        login.submit();
    }
    //account = 93432
    //account = 93505
    @Test
    public void TC019(){
        try{
            driver.get("http://www.demo.guru99.com/V4/manager/FundTransInput.php");
            WebElement payer = driver.findElement(By.name("payersaccount"));
            payer.sendKeys("93432");
            WebElement payee = driver.findElement(By.name("payeeaccount"));
            payee.sendKeys("93505");
            WebElement amount = driver.findElement(By.name("ammount"));
            amount.sendKeys("20");
            WebElement description = driver.findElement(By.name("desc"));
            description.sendKeys("Transfer");
            WebElement submit = driver.findElement(By.name("AccSubmit"));
            submit.click();
            AssertJUnit.assertTrue(true);
        }catch (Exception e){
            AssertJUnit.assertTrue(false);
        }

    }

    @Test
    public void TC020(){
        try{
            driver.get("http://www.demo.guru99.com/V4/manager/FundTransInput.php");

            WebElement payer = driver.findElement(By.name("payersaccount"));
            payer.sendKeys("");
            WebElement payee = driver.findElement(By.name("payeeaccount"));
            payee.sendKeys("");
            WebElement amount = driver.findElement(By.name("ammount"));
            amount.sendKeys("");
            WebElement description = driver.findElement(By.name("desc"));
            description.sendKeys("");
            WebElement submit = driver.findElement(By.name("AccSubmit"));
            submit.click();
            WebElement mess = driver.findElement(By.id("message10"));
            if(mess!=null){
                AssertJUnit.assertTrue(false);
            }
        }catch (Exception e){
            AssertJUnit.assertTrue(false);
        }

    }
}
