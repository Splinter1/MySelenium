package page.baidu;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import util.action.myAction;
import util.driver.SeleniumDrive;
import org.openqa.selenium.interactions.Actions;
import java.awt.peer.FramePeer;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;

public class index {

    @Test(priority = 0, description = "测试")
    public void baidu()throws Exception{
        WebDriver driver = SeleniumDrive.open();
        driver.manage().window().maximize();
        driver.get("http://10.88.33.201/paas/#/login");

        myAction.sendKeys(By.xpath("//*[@id=\"app\"]/div/div/div[3]/form/div[1]/div/div[1]/input"), "superAdmin");
        myAction.sendKeys(By.xpath("//*[@id=\"app\"]/div/div/div[3]/form/div[2]/div/div[1]/input"), "123456");
        myAction.click(By.xpath("//*[@id=\"app\"]/div/div/div[3]/form/div[3]/div/button"));
        Thread.sleep(1000);
        myAction.click(By.xpath("//*[@id=\"app\"]/div/div[1]/div[2]/ul/li[3]/div/span"));
        myAction.click(By.xpath("html[1]/body[1]/div[2]/ul[1]/li[13]"));

        myAction.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[8]/td[9]/div/div/div[2]"));
        myAction.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/form/div[2]/div/button"));
        myAction.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div"));

//        Thread.sleep(2000);
//        WebElement From=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[2]/div[1]"));
//        WebElement To=driver.findElement(By.xpath("//div[@accesskey='WLDW_0120200924105829107124']"));
//        Thread.sleep(1000);
//        Actions act=new Actions(driver);
//        act.dragAndDrop(To, From).perform();
////
////        int x = To.getLocation().getX();
////        int y = To.getLocation().getY();


//        act.dragAndDropBy(From,x+20,y+20).perform();
//        Thread.sleep(1000);

//        act.moveToElement(From,10,10).clickAndHold(From);
//        Thread.sleep(1000);
//        act.moveToElement(To,10,10);
//        Thread.sleep(1000);
//        act.release(To).build().perform();


//        Thread.sleep(10000);
//        SeleniumDrive.closedAll();
//        myAction.click(By.xpath("html[1]/body[1]/div[2]/ul[1]/li[6]"));
//        Thread.sleep(1000);
//        myAction.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[2]/div[1]/div[3]/table/tbody/tr[4]/td[7]/div/div/div[3]"));
//        Thread.sleep(1000);
//        myAction.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div/section/div/div[4]/button[2]/span"));
//        myAction.click(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div/section/div/div[3]/div[3]/form/div/div/div/div[1]/input"));
//        Thread.sleep(2000);
//        myAction.click(By.xpath("/html/body/div[4]/div[1]/div[1]/ul/li[111]"));

//        Select select = new Select(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div/section/div/div[3]/div[3]/form/div/div/div/div[1]/input")));
//        select.selectByVisibleText("Select select = new Select(driver.findElement(By.id(\"select_id\")));");

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
        System.out.println("40miaohou");
        Thread.sleep(40000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript(jquery_str + dnd_str + "$('#q').simulateDragDrop({ dropTarget: '#w'});");

//        Thread.sleep(1000);
//        WebElement From=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div/section/div/div[3]/div[3]/div[2]/div[2]/div[3]/div/div[1]/img"));
//        WebElement To=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div/div/section/div/div[3]/div[3]/div[2]/div[1]/div[3]/div[3]/div[4]/div[2]"));
//        Thread.sleep(1000);
//        Actions act=new Actions(driver);
//        act.dragAndDrop(From, To).perform();


    }

}
