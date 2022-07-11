package test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class test11_sort_kinhte
{
    public static void test11_sort_kinhte() {
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
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-kinh-te\"]/div/div[1]/div[2]/div/ul/div/li[1]")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-kinh-te\"]/div/div[1]/div[2]/div/ul/div/li[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-kinh-te\"]/div/div[1]/div[2]/div/ul/div/li[3]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-kinh-te\"]/div/div[1]/div[2]/div/ul/div/li[4]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-kinh-te\"]/div/div[1]/div[2]/div/ul/div/li[6]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-kinh-te\"]/div/div[1]/div[2]/div/ul/div/li[5]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"tabbh-block-kinh-te\"]/div/a")).click();
            Thread.sleep(3000);
        } catch (Exception e)

        {
            e.printStackTrace();
        }
        driver.quit();
    }
}
