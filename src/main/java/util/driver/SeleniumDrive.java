package util.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import util.log4j.LoggerControler;

public class SeleniumDrive {
    final static LoggerControler log = LoggerControler.getlogger(SeleniumDrive.class);
    public static WebDriver driver;
    public static WebDriver open(){
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver",path +"/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public static void closedAll(){
        driver.quit();
    }

    public static void get(String url){
        driver.get(url);
        log.info("打开网站"+url);
    }

}
