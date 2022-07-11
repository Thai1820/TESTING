package test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class test2_sort_sgk
{
    public static void test2_sort_sgk() {
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
//            driver.findElement(By.xpath("//*[@id=\"NC_CLOSE_ICON\"]")).click();
//            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-GKTK\"]/div/div[1]/div/div/ul/div/li[1]")).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath("//*[@id=\"categorytab-GKTK\"]/div/div[1]/div/div/ul/div/li[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"tabsachtk-GKTK\"]/div/a")).click();
            Thread.sleep(4000);

        } catch (Exception e)

        {
            e.printStackTrace();
        }
        driver.quit();
    }
}
