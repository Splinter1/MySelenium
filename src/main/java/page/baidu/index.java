package page.baidu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import util.action.Actions;
import util.driver.SeleniumDrive;
import util.find.WebElementUtils;

public class index {

//    @Test(priority = 0, description = "测试")
//    public void baidu()throws Exception{
//        WebDriver driver = SeleniumDrive.open();
//        driver.get("https://www.baidu.com/");
//        Actions.sendKeys(By.id("kw"),"测试");
//
//        Thread.sleep(500);
//        SeleniumDrive.closedAll();
//    }

    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test2(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }

    @Test
    public void logDemo(){
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我自己的运行时异常");
    }


}
