package test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class test9_sort_foreign
{
    public static void test9_sort_foreign() {
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
            driver.findElement(By.xpath("//*[@id=\"categorytab-highly-recommendation\"]/div/div[1]/div[2]/div/ul/div/li[1]")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-highly-recommendation\"]/div/div[1]/div[2]/div/ul/div/li[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-highly-recommendation\"]/div/div[1]/div[2]/div/ul/div/li[3]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-highly-recommendation\"]/div/div[1]/div[2]/div/ul/div/li[4]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-highly-recommendation\"]/div/div[1]/div[2]/div/ul/div/li[5]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-highly-recommendation\"]/div/div[1]/div[2]/div/ul/div/li[6]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"tabbiograp-highly-recommendation\"]/div/a")).click();
            Thread.sleep(3000);
        } catch (Exception e)

        {
            e.printStackTrace();
        }
        driver.quit();
    }
}
