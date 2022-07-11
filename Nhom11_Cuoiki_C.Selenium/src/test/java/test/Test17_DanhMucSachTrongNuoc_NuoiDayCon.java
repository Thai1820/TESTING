package test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class Test17_DanhMucSachTrongNuoc_NuoiDayCon
{
    public static void Test2_DanhMucSachTrongNuoc_NuoiDayCon() {
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
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div/div[2]/span[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div[2]/div/div[2]/div/div/div[1]/ul/li[1]/a")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"m-more-less-left_category\"]/a[2]")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//*[@id=\"children-categories\"]/li[10]/a")).click();
            Thread.sleep(2000);




        } catch (Exception e)

        {
            e.printStackTrace();
        }
        driver.quit();
    }
}
