package page.baidu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import util.driver.SeleniumDrive;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class test {
    @Test(priority = 0, description = "测试")
    public void baidu()throws Exception {
        WebDriver driver = SeleniumDrive.open();
        driver.manage().window().maximize();
        driver.get("C:\\Users\\57422\\Desktop\\drap.html");

//        Thread.sleep(1000);
//        System.out.println("开始识别元素");
//        WebElement From=driver.findElement(By.id("drag1"));
//        WebElement To=driver.findElement(By.id("div1"));
//        Thread.sleep(1000);
//        Actions act=new Actions(driver);
//        System.out.println("开始拖拽");
//        act.dragAndDrop(From , To).perform();

        //读取jQuery文件到变量
        String jquery_str="";
        File jquery_file = new File("C:\\Users\\57422\\Desktop\\jquery-3.3.1.js");
        try {
            FileInputStream in=new FileInputStream(jquery_file);
            int size=in.available();
            byte[] buffer=new byte[size];
            in.read(buffer);
            in.close();
            jquery_str=new String(buffer,"GB2312");
        }catch (IOException e) {
            e.printStackTrace();
        }

//读取drag_and_drop_helper.js文件到变量str
        String dnd_str="";
        File dnd_file = new File("C:\\Users\\57422\\Desktop\\drag_and_drop_helper.js");
        try {
            FileInputStream in=new FileInputStream(dnd_file);
            int size=in.available();
            byte[] buffer=new byte[size];
            in.read(buffer);
            in.close();
            dnd_str=new String(buffer,"GB2312");
        }catch (IOException e) {
            e.printStackTrace();
        }
//运行JS方法实现拖拽
        System.out.println("5秒后开始");
        Thread.sleep(5000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(jquery_str + dnd_str + "$('#drag1').simulateDragDrop({ dropTarget: '#div1'});");

    }
}
