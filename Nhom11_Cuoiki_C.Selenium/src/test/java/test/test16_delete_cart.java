package test;
import org.testng.annotations.Test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class test16_delete_cart {
    public static void test16_cart() {
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
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"flashsale-slider\"]/div[2]/div/div[1]/div[1]/ul/li[5]/div/div[2]/h2/a")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div/div[1]/div[1]/div[2]/button[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"shopping_cart\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"form-cart\"]/div/div[1]/div/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/a[2]/img")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"form-cart\"]/div/div[1]/div/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/a[2]/img")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"form-cart\"]/div/div[1]/div/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/a[1]/img")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"form-cart\"]/div/div[1]/div/div[2]/div[1]/div[4]/a/i")).click();
            Thread.sleep(1000);
        } catch (Exception e)

        {
            e.printStackTrace();
        }
        driver.quit();
    }
}
