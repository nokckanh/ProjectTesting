package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Deposit {
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
    public void TC0012(){
        WebElement deposit = driver.findElement(By.xpath("//a[contains(text(),'Deposit')]"));
        deposit.click();
        WebElement accountno  = driver.findElement(By.name("accountno"));
        accountno.sendKeys("92964");
        WebElement amount = driver.findElement(By.name("ammount"));
        accountno.sendKeys("100");
        WebElement description = driver.findElement(By.name("desc"));
        description.sendKeys("deposit1");
        WebElement submit = driver.findElement(By.name("AccSubmit"));
        submit.click();
    }

    @Test
    public void TC0013(){
        WebElement deposit = driver.findElement(By.xpath("//a[contains(text(),'Deposit')]"));
        deposit.click();
        WebElement accountno  = driver.findElement(By.name("accountno"));
        accountno.sendKeys("2222222");
        WebElement amount = driver.findElement(By.name("ammount"));
        accountno.sendKeys("100");
        WebElement description = driver.findElement(By.name("desc"));
        description.sendKeys("deposit1");
        WebElement submit = driver.findElement(By.name("AccSubmit"));
        submit.click();
    }

    @Test
    public void TC0014(){
        WebElement deposit = driver.findElement(By.xpath("//a[contains(text(),'Deposit')]"));
        deposit.click();
        WebElement accountno  = driver.findElement(By.name("accountno"));
        accountno.sendKeys("");
        WebElement amount = driver.findElement(By.name("ammount"));
        accountno.sendKeys("");
        WebElement description = driver.findElement(By.name("desc"));
        description.sendKeys("");
        WebElement submit = driver.findElement(By.name("AccSubmit"));
        submit.click();
    }
}