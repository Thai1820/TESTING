package test;
import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class test1_login
{
    public static void test1_login() {
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
            driver.findElement(By.xpath("//*[@id=\"fhs_top_account_hover\"]/a/div/div[1]")).click();
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login_username\"]")).sendKeys("0903570744");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"login_password\"]")).sendKeys("poke2002");
            Thread.sleep(1000);
            driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div[1]/div/div[2]/div/div/div[5]/div/div/div[2]/form/div[4]/div/button[1]")).click();
            Thread.sleep(5000);
        } catch (Exception e)

        {
            e.printStackTrace();
        }
        driver.quit();
    }
}
