package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddNewCustomer {
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
    public void AddNewCustomer(){
        WebElement newCustomer = driver.findElement(By.xpath("//a[contains(text(),'New Customer')]"));
        newCustomer.click();

        WebElement name = driver.findElement(By.name("name"));
        name.sendKeys("TestName");
        WebElement gender = driver.findElement(By.xpath("//tbody/tr[5]/td[2]/input[2]"));
        gender.click();
        WebElement dob = driver.findElement(By.id("dob"));
        dob.sendKeys("10/10/2000");
        WebElement address = driver.findElement(By.name("addr"));
        address.sendKeys("TestAddress");
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("TestCity");
        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("TestState");

        //unable submit
//        WebElement pin = driver.findElement(By.name("pinno"));
//        pin.sendKeys("TestPIN");
//        WebElement telephone = driver.findElement(By.name("telephoneno"));
//        telephone.sendKeys("TestTelephone");
//        WebElement email = driver.findElement(By.name("emailid"));
//        email.sendKeys("TestEmail");

        // allow
        WebElement pin = driver.findElement(By.name("pinno"));
        pin.sendKeys("123456");
        WebElement telephone = driver.findElement(By.name("telephoneno"));
        telephone.sendKeys("0123456789");
        WebElement email = driver.findElement(By.name("emailid"));
        email.sendKeys("abc111jbfsdjbBZCXxz@gmail.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("123456789");
        WebElement submit = driver.findElement(By.name("sub"));
        submit.click();
    }

}
