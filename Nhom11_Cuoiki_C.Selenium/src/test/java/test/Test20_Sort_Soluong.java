package test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class Test20_Sort_Soluong
{
    public static void Test5_Sort_Soluong() {
        int scc = 0;
        StringBuffer verificationErrors = new StringBuffer();
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.fahasa.com/");
            String demoSite = driver.findElement(By.cssSelector("h2")).getText();
            System.out.println(demoSite);
            try {
                assertEquals("THIS IS DEMO SITE FOR ", demoSite);
            } catch (Error e) {

                verificationErrors.append(e.toString());
            }
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div/div[2]/span[2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div/div[2]/span[2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div/div[2]/div/div/div[1]/ul/li[1]/a")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/div/div/div/span[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/div/div/div/div/span[1]")).click();
            Thread.sleep(3500);
            driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/div/div/div/span[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/div/div/div/div/span[2]")).click();
            Thread.sleep(3500);
            driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/div/div/div/span[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/div/div[2]/div/div/div[2]/div[3]/div[1]/div/div[2]/div/div/div/div/div/span[3]")).click();
            Thread.sleep(5000);





        } catch (Exception e)

        {
            e.printStackTrace();
        }
        driver.quit();
    }
}