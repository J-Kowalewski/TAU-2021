package LAB2;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class Edge_Test {
    public WebDriver driver;
    public Actions action;

    @Before
    public void setUp() {
        System.setProperty("webdriver.edge.driver", "C://Users//19afr//Documents//PJATK//SEM6//TAU//DRIVERS//edgedriver_win64//msedgedriver.exe");

        driver = new EdgeDriver();
        action = new Actions(driver);

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void edgeZalandoTest1() throws InterruptedException {
        driver.get("https://www.zalando.pl/");
        driver.findElement(By.name("q")).sendKeys("spodnie dresowe", Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"z-nvg-cognac-root\"]/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/div/button")).click();
        WebElement sale = driver.findElement(By.xpath("//*[@id=\"z-nvg-cognac-root\"]/div[1]/div[2]/div/div[2]/div/div[2]/div/div[1]/ul/div/div/div/ul/li[5]"));
        action.moveToElement(sale).perform();
        Thread.sleep(3000);
        sale.click();
    }

    @Test
    public void edgeZalandoTest2() throws InterruptedException {
        driver.get("https://www.zalando.pl/");
        WebElement account = driver.findElement(By.xpath("//*[@id=\"z-navicat-header-root\"]/header/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[3]/div/div[1]/a"));
        action.moveToElement(account).perform();
        Thread.sleep(1500);
        account.click();
        driver.findElement(By.name("login.email")).sendKeys("testemail123@gmail.com");
        driver.findElement(By.name("login.password")).sendKeys("@tEsTpAsSwOrD12321!");
        driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[2]/div/div[2]/div/form/div[2]/div/div/div/button")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("/html/body/div[8]/div[2]/div[2]/div/div[2]/div/form/div[3]/button")).click();
    }

    @Test
    public void edgeZalandoTest3() throws InterruptedException {
        driver.get("https://www.zalando.pl/");
        driver.findElement(By.xpath("//*[@id=\"z-navicat-header-root\"]/header/div[2]/div/div/div/div[1]/div/div/div/div[1]/div[1]/nav/ul/li[2]/a")).click();
        WebElement inspirations = driver.findElement(By.xpath("//*[@id=\"z-navicat-header-root\"]/header/div[2]/div/div/div/div[1]/div/div/div/div[2]/div[2]/nav/ul/li[1]/span/a"));
        action.moveToElement(inspirations).perform();
        Thread.sleep(1500);
        inspirations.click();
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/section/div[2]/div/div/div/div/a[3]")).click();
        driver.findElement(By.xpath("/html/body/div[4]/div[3]/section/div[3]/div/div/div/div[1]/div/div/a/span[1]")).click();
    }

    @Test
    public void edgeLimangoTest1() {
        driver.get("https://www.limango.pl/");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div/header/div/div[2]/div[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/div/div/div[5]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div/div/div[1]/div[1]/div/div/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div/div/div[1]/div[1]/div/div/ul/li[5]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/div[4]/div/div/div/div[1]/div/div/div/div/div[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/div[4]/div/div/div/div[1]/div/div/div/div/div[2]/div/div/div/div/div/div/div[2]/div[2]/div/input\n"))
                .sendKeys("250");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/div[4]/div/div/div/div[1]/div/div/div/div/div[2]/div/div/div/div/div/button"))
                .click();
    }

    @Test
    public void edgeLimangoTest2() throws InterruptedException {
        driver.get("https://www.limango.pl/");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div/header/div/div[2]/div[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"Warstwa_1_1557841678374\"]")).click();
        WebElement search = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div/div/div/div/div/div/form/div/div/input"));
        search.sendKeys("Kurtka Burton");
        Thread.sleep(1500);
        search.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/div[4]/div/div/div/div[3]/div/div/div/div/div[1]"))
                .click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/div[4]/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div/div/div/div/div[1]/button"))
                .click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/div[4]/div/div/div/div[3]/div/div/div/div/div[2]/div/div/div/div/div/button"))
                .click();
    }

    @Test
    public void edgeLimangoTest3(){
        driver.get("https://www.limango.pl/");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[1]/div/header/div/div[2]/div[2]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[3]/div/div/div/div[6]/a/span")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div/div[2]/div/div/div[2]/div/div[6]/div[2]/div/div[1]/article/div/a")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div[2]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[2]/div/div/div[3]/div/div/div/a/div/img[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[4]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"Warstwa_1_1557227075713\"]")).click();
    }
}
