package test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class test8_sort_vpp
{
    public static void test8_sort_vpp() {
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
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-deal-of-vpp\"]/div/div[1]/div[2]/div/ul/div/li[1]")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-deal-of-vpp\"]/div/div[1]/div[2]/div/ul/div/li[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-deal-of-vpp\"]/div/div[1]/div[2]/div/ul/div/li[3]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-deal-of-vpp\"]/div/div[1]/div[2]/div/ul/div/li[4]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-deal-of-vpp\"]/div/div[1]/div[2]/div/ul/div/li[5]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-deal-of-vpp\"]/div/div[1]/div[2]/div/ul/div/li[6]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-deal-of-vpp\"]/div/div[1]/div[2]/div/ul/div/li[8]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-block-deal-of-vpp\"]/div/div[1]/div[2]/div/ul/div/li[7]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"tabmaytinh-block-deal-of-vpp\"]/div/a")).click();
            Thread.sleep(4000);
        } catch (Exception e)

        {
            e.printStackTrace();
        }
        driver.quit();
    }
}
