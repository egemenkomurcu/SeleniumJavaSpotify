package testmaster.selenium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testmaster.selenium.driver.Driver;
import testmaster.selenium.methods.Methods;

public class GuestPage extends Methods {
    private static final Logger logger = LogManager.getLogger(Driver.class);
    public GuestPage(WebDriver driver){

    }

    public void clickSignUp(){
        clickElement(By.xpath("//button[@data-testid='login-button']"));
        WebElement element=findElementWait(By.xpath("//button[@data-testid='login-button']//span[text()='Oturum aç']"));
        String message=element.getText();
        Assert.assertEquals("Oturum aç",message);
        logger.info("GuestPage sayfasinda oldugu dogrulandi");

    }

    //   GuestPage guestPage = new GuestPage();
      //  guestPage.clickElement(By.xpath("\"//*[@class=\\\"ButtonInner-sc-14ud5tc-0 hfXYNQ encore-inverted-light-set\\\"]\""));






}
