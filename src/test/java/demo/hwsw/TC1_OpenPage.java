package demo.hwsw;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TC1_OpenPage extends BaseTest {
    @Test
    public void test() {
        driver.get("https://hwsw.hu");

        assertTrue(wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("/html/body/header/nav[1]/div[1]/div[1]/a")))).isDisplayed());
   }
}
