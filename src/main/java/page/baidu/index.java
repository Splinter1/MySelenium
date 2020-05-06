package page.baidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import util.action.Actions;
import util.driver.SeleniumDrive;
import util.find.WebElementUtils;

public class index {

    @Test(priority = 0, description = "测试")
    public void baidu()throws Exception{
        WebDriver driver = SeleniumDrive.open();
        driver.get("https://www.baidu.com/");
        Actions.sendKeys(By.id("kw"),"测试");

        Thread.sleep(500);
        SeleniumDrive.closedAll();
    }


}
