package test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class test13_timkiem
{
    public static void test13_timkiem() {
        int scc = 0;
        StringBuffer verificationErrors = new StringBuffer();
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            driver.get("https://www.fahasa.com/");
            driver.findElement(By.xpath("//*[@id=\"search_desktop\"]")).sendKeys("re:zero");
            Thread.sleep(4000);

            driver.findElement(By.xpath("//*[@id=\"search_mini_form_desktop\"]/div/div/span/span")).click();
            Thread.sleep(4000);
        } catch (Exception e)

        {
            e.printStackTrace();
        }
        driver.quit();
    }
}
