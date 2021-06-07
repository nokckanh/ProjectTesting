package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CustomizedStatement {
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

    @Test
    public void TC021(){
        try{
            driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
            WebElement account= driver.findElement(By.name("accountno"));
            account.sendKeys("93432");
            WebElement fdate= driver.findElement(By.name("fdate"));
            fdate.sendKeys("10/05/2020");
            WebElement tdate= driver.findElement(By.name("tdate"));
            tdate.sendKeys("10/05/2024");
            WebElement amountlowerlimit = driver.findElement(By.name("amountlowerlimit"));
            amountlowerlimit.sendKeys("1000");
            WebElement numtransaction = driver.findElement(By.name("numtransaction"));
            amountlowerlimit.sendKeys("40");
            WebElement AccSubmit = driver.findElement(By.name("AccSubmit"));
            AccSubmit.click();
            AssertJUnit.assertTrue(true);
        }catch (Exception e){
            AssertJUnit.assertTrue(false);
        }

    }

    @Test
    public void TC022(){
        try{
            driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
            WebElement account= driver.findElement(By.name("accountno"));
            account.sendKeys("93432");
            WebElement fdate= driver.findElement(By.name("fdate"));
            fdate.sendKeys("10/05/2024");
            WebElement tdate= driver.findElement(By.name("tdate"));
            tdate.sendKeys("10/05/2023");
            WebElement amountlowerlimit = driver.findElement(By.name("amountlowerlimit"));
            amountlowerlimit.sendKeys("1000");
            WebElement numtransaction = driver.findElement(By.name("numtransaction"));
            amountlowerlimit.sendKeys("40");
            WebElement AccSubmit = driver.findElement(By.name("AccSubmit"));
            AccSubmit.click();
            AssertJUnit.assertTrue(false);
        }catch (Exception e){
            AssertJUnit.assertTrue(false);
        }

    }

    @Test
    public void TC023(){
        driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
        WebElement account= driver.findElement(By.name("accountno"));
        account.sendKeys("111111");
        WebElement fdate= driver.findElement(By.name("fdate"));
        fdate.sendKeys("10/05/2024");
        WebElement tdate= driver.findElement(By.name("tdate"));
        tdate.sendKeys("10/05/2023");
        WebElement amountlowerlimit = driver.findElement(By.name("amountlowerlimit"));
        amountlowerlimit.sendKeys("1000");
        WebElement numtransaction = driver.findElement(By.name("numtransaction"));
        amountlowerlimit.sendKeys("40");
        WebElement AccSubmit = driver.findElement(By.name("AccSubmit"));
        AccSubmit.click();
        AssertJUnit.assertTrue(false);
    }

    @Test
    public void TC024(){

        try{
            driver.get("http://www.demo.guru99.com/V4/manager/CustomisedStatementInput.php");
            WebElement account= driver.findElement(By.name("accountno"));
            account.sendKeys("");
            WebElement fdate= driver.findElement(By.name("fdate"));
            fdate.sendKeys("");
            WebElement tdate= driver.findElement(By.name("tdate"));
            tdate.sendKeys("");
            WebElement amountlowerlimit = driver.findElement(By.name("amountlowerlimit"));
            amountlowerlimit.sendKeys("");
            WebElement numtransaction = driver.findElement(By.name("numtransaction"));
            amountlowerlimit.sendKeys("");
            WebElement AccSubmit = driver.findElement(By.name("AccSubmit"));
            AccSubmit.click();
            WebElement mess = driver.findElement(By.id("message2"));
            if(mess!=null){
                AssertJUnit.assertTrue(false);
            }
        }catch (Exception e){
            AssertJUnit.assertTrue(false);
        }
    }
}
