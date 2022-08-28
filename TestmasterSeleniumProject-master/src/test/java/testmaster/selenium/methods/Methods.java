package testmaster.selenium.methods;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import testmaster.selenium.driver.Driver;

import java.time.Duration;

public class Methods {
    private static final Logger logger = LogManager.getLogger(Methods.class);

    WebDriver driver;
    FluentWait<WebDriver> fluentWait;
    JavascriptExecutor jsDriver;
    public Methods(){

        this.driver = Driver.driver;
        jsDriver = (JavascriptExecutor) driver;
        fluentWait = setFluentWait(30);
    }

    public FluentWait<WebDriver> setFluentWait(long timeout){

         return new FluentWait<WebDriver>(driver)
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofMillis(250))
                .ignoring(NoSuchElementException.class);
    }

    public WebElement findElement(By by){

        return driver.findElement(by);
    }

    public WebElement findElementWait(By by){

        return fluentWait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public void clickElement(By by){

        findElementWait(by).click();
    }

    public void sendKeys(By by, String text){

        findElementWait(by).sendKeys(text);
    }

    public String getText(By by){

        return findElementWait(by).getText();
    }

    public String getAttribute(By by, String attribute){

        return findElementWait(by).getAttribute(attribute);
    }

    public void hoverElement(By by){

        WebElement webElement = findElementWait(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(webElement).build().perform();
        logger.info(by.toString() + "elementine hover islemi yapıldı ");
    }

    public String getValue(By by){

        WebElement webElement = findElementWait(by);
        return jsDriver.executeScript("return arguments[0].value;", webElement).toString();
    }
    public void scrollElementCenter(By by){
        WebElement webElement = findElementWait(by);
        jsDriver.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block:});",webElement);

    }
    public void scrollElement(By by){
        WebElement webElement = findElementWait(by);
        jsDriver.executeScript("arguments[0].scrollIntoView()",webElement);

    }
    public void scrollElementIfNeeded(By by){
        WebElement webElement = findElementWait(by);
        jsDriver.executeScript("arguments[0].scrollIntoViewIfNeeded();",webElement);
    }
    public void clickElementJs(By by){
        WebElement webElement = findElementWait(by);
        jsDriver.executeScript("arguments[0].click();",webElement);
        logger.info((by.toString() + "scrollElementCenter"));
    }
    public void clear(By by){
        findElementWait(by);
        logger.info(by.toString() + " elementi texti temizledi ");
    }
    public Select getSelect(By by){
        return new Select(findElementWait(by));
    }
    public void select(By by, String value){
        getSelect(by).selectByValue(value);
    }

    public boolean isElementVisible(By by , long timeout){
        try {
            setFluentWait(timeout).until(ExpectedConditions.visibilityOfElementLocated(by));
            logger.info(by.toString() + "element visible true "  );
            return true;
        }catch (Exception e){
            logger.info(by.toString() + " false " );
                    logger.error(e.getMessage());
            return false;
        }


    }
    public void waitByMiliSeconds(long miliseconds){
        try{
            Thread.sleep(miliseconds);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (Math.floorMod(miliseconds,1000) != 0)
        logger.info(miliseconds + " milisaniye bekklendi ");

    }
    public void waitBySeconds(long Seconds){
        waitByMiliSeconds(1000);
        logger.info(Seconds + " saniye beklendi ");
    }
    public boolean isElementClickable(By by , long timeout){
        try {
            setFluentWait(timeout).until(ExpectedConditions.visibilityOfElementLocated(by));
            logger.info(by.toString() + "element visible true "  );
            return true;
        }catch (Exception e){
            logger.info(by.toString() + " false " );
            logger.error(e.getMessage());
            return false;
        }
        }
    // button[data-testid='login-button']"
}
