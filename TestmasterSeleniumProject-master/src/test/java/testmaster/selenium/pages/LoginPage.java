package testmaster.selenium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testmaster.selenium.driver.Driver;
import testmaster.selenium.methods.Methods;

public class LoginPage extends Methods {
    private static final Logger logger = LogManager.getLogger(Driver.class);
    public LoginPage(WebDriver driver){

    }
    public void typeEmailAndPassword(){
        sendKeys(By.xpath("//input[@id=\"login-username\"]"),"aplee2398");
        sendKeys(By.xpath("//input[@id=\"login-password\"]"),"aplee2398");
        clickElement(By.xpath("//p[@class=\"Type__TypeElement-goli3j-0 dmuHFl sc-hKwDye eKDPqH\"] "));
        waitBySeconds(3);
        logger.info("Giris yapildi");
    }


    /*public void clickLogIn(By by) {

     By findLogIn =By.xpath("//*[@class=\"ButtonInner-sc-14ud5tc-0 hfXYNQ encore-inverted-light-set\"]");*/





    }

