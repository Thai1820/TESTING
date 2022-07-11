package test;
import org.testng.annotations.Test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class test15_sp_to_cart {
    public static void test15_cart() {
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

            //Về lại trang chủ
            driver.findElement(By.xpath("//*[@id=\"flashsale-slider\"]/div[2]/div/div[1]/div[1]/ul/li[5]/div/div[2]/h2/a")).click();
            Thread.sleep(1000);
            //Tăng số lượng sản phẩm
            driver.findElement(By.xpath("//*[@id=\"catalog-product-details-discount\"]/div/div/a[2]/img")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"catalog-product-details-discount\"]/div/div/a[2]/img")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"catalog-product-details-discount\"]/div/div/a[2]/img")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"catalog-product-details-discount\"]/div/div/a[2]/img")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"catalog-product-details-discount\"]/div/div/a[2]/img")).click();
            Thread.sleep(1000);

            //Bớt Sản Phẩm
            driver.findElement(By.xpath("//*[@id=\"catalog-product-details-discount\"]/div/div/a[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"catalog-product-details-discount\"]/div/div/a[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"catalog-product-details-discount\"]/div/div/a[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"catalog-product-details-discount\"]/div/div/a[1]")).click();
            Thread.sleep(1000);

            //Thêm vào giỏ hàng
            driver.findElement(By.xpath("//*[@id=\"product_addtocart_form\"]/div/div[1]/div[1]/div[2]/button[1]")).click();
            Thread.sleep(1000);


            driver.findElement(By.xpath("//*[@id=\"shopping_cart\"]")).click();
            Thread.sleep(1000);



            driver.findElement(By.xpath("/html/body/section/section/div/div[2]/div/div/div[2]/div/div[1]/div[5]/div/div/div[4]/form/div/div[1]/div/div[1]/div[1]/input")).click();
            Thread.sleep(1000);
        } catch (Exception e)

        {
            e.printStackTrace();
        }
        driver.quit();
    }
}
