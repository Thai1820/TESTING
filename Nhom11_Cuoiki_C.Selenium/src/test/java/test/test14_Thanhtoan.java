package test;
import org.testng.annotations.Test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class test14_Thanhtoan {
    public static void test14_addcart() {
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
            driver.findElement(By.xpath("//*[@id=\"flashsale-slider\"]/div[2]/div/div[1]/div[1]/ul/li[1]/div/div[2]/h2/a")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div/div[1]/div[1]/div[2]/button[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"shopping_cart\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"checkbox-product-398385\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"form-cart\"]/div/div[2]/div/div/div[3]/div[2]/div/button/span/span")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"fhs_shipping_fullname\"]")).sendKeys("Quang Minh");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"fhs_shipping_email\"]")).sendKeys("dangquangminh@gmail.com");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"fhs_shipping_telephone\"]")).sendKeys("090334567890");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"select2-fhs_shipping_city_select-container\"]/span")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"fhs_shipping_city_select\"]/option[2]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"select2-fhs_shipping_district_select-container\"]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"fhs_shipping_district_select\"]/option[10]")).click();
            Thread.sleep(1000);

            driver.findElement(By.xpath("//*[@id=\"fhs_shipping_street\"]")).sendKeys("123");
            Thread.sleep(1000);

            System.out.println("Hong co tien mua :3");
        } catch (Exception e)

        {
            e.printStackTrace();
        }
        driver.quit();
    }
}
