package testmaster.selenium.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testmaster.selenium.driver.Driver;
import testmaster.selenium.methods.Methods;

public class HomePage extends Methods {
    private static final Logger logger = LogManager.getLogger(Driver.class);
    public HomePage(WebDriver driver){

    }
    public void sameName(){
        //clickElement(By.xpath("//span[@data-testid='user-widget-name'][text()='Aydın Can Sakarya']"));
        WebElement element=findElementWait(By.xpath("//span[@data-testid='user-widget-name'][text()='Aydın Can Sakarya']"));
        String message=element.getText();
        Assert.assertEquals("Aydın Can Sakarya",message);
        logger.info("Ad dogrulandi");
        waitBySeconds(2);
        //pop-up
        clickElement(By.xpath("//*[@class=\"onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon\"]"));

    }
    public void newTrackList(){

        WebElement element2 = findElement(By.xpath("//span[@class=\"Type__TypeElement-goli3j-0 hWmToD J4xXuqyaJnnwS6s2p3ZB standalone-ellipsis-one-line\"] "));
        String message = element2.getText();
        Assert.assertEquals("Çalma Listesi Oluştur",message);
        clickElement(By.xpath("//span[@class=\"Type__TypeElement-goli3j-0 hWmToD J4xXuqyaJnnwS6s2p3ZB standalone-ellipsis-one-line\"] "));
        logger.info("Çalma listesi Oluştur görüntülendi");


    }
    public void changeTracklist(){

        clickElement(By.xpath("//*[@class=\"Type__TypeElement-goli3j-0 eczMAK\"] "));
        sendKeys(By.xpath("//input[@data-testid=\"playlist-edit-details-name-input\"] "),"Spotify Listem");
        clickElement(By.xpath("//span[@class=\"ButtonInner-sc-14ud5tc-0 hfXYNQ encore-inverted-light-set\"]"));

     /*   WebElement element3 = findElement(By.xpath("//*[@class=\"Type__TypeElement-goli3j-0 eczMAK\"] "));
        String message = element3.getText();
        waitBySeconds(3);
        Assert.assertEquals("Spotify Listem",message);*/
        logger.info("Degisiklik yapildi");
    }
    public void clickSearchButton(){
        waitBySeconds(3);
        clickElement(By.xpath("(//*[@class=\"link-subtle ATUzFKub89lzvkmvhpyE\"])[2]"));
        sendKeys(By.xpath("//*[@class=\"Type__TypeElement-goli3j-0 cPwEdQ QO9loc33XC50mMRUCIvf\"]"),"Daft Punk");

    }
    public void clickSongs(){
        clickElement(By.xpath("(//a[@class=\"ZWI7JsjzJaR_G8Hy4W6J\"])[2]"));
        clickElement(By.xpath("(//*[@data-testid=\"more-button\"])[1]"));
        clickElement(By.xpath("(//*[@class=\"wC9sIed7pfp47wZbmU6m\"])[5]"));
        clickElement(By.xpath("(//*[@class=\"wC9sIed7pfp47wZbmU6m\"])[6]"));
        waitBySeconds(2);
        clickElement(By.xpath("(//*[@data-testid=\"more-button\"])[2]"));
        clickElement(By.xpath("(//*[@class=\"wC9sIed7pfp47wZbmU6m\"])[5]"));
        clickElement(By.xpath("(//*[@class=\"wC9sIed7pfp47wZbmU6m\"])[6]"));
        waitBySeconds(2);
        clickElement(By.xpath("(//*[@data-testid=\"more-button\"])[3]"));
        clickElement(By.xpath("(//*[@class=\"wC9sIed7pfp47wZbmU6m\"])[5]"));
        clickElement(By.xpath("(//*[@class=\"wC9sIed7pfp47wZbmU6m\"])[6]"));
      //  clickElement(By.xpath("(//*[@data-testid=\"more-button\"])[2]"));
      //  clickElement(By.xpath("(//*[@data-testid=\"more-button\"])[3]"));
    }
    public void clickTrackList(){
        clickElement(By.xpath("(//*[@class=\"AINMAUImkAYJd4ertQxy\"])[1]"));
        waitBySeconds(2);
        hoverElement(By.xpath("(//*[@class=\"VpYFchIiPg3tPhBGyynT\"])[2]"));//başlat butonu üstünde bekle
        clickElement(By.xpath("(//*[@class=\"VpYFchIiPg3tPhBGyynT\"])[2]"));
        waitBySeconds(1);
        clickElement(By.xpath("(//*[@class=\"NZAU7CsuZsMeMQB8zYUu\"])[3]")); //parça durdur
        waitBySeconds(1);
        //clickElement(By.xpath("(//*[@data-testid=\"more-button\"])[4]"));
      //  waitBySeconds(1);
        //clickElement(By.xpath("(//*[@class=\"Type__TypeElement-goli3j-0 cPwEdQ ellipsis-one-line PDPsYDh4ntfQE3B4duUI\"])[7]"));
      //  waitBySeconds(1);




    }
    public void deleteLists(){
        clickElement(By.xpath("(//button[@data-testid=\"more-button\"])[3]")); //3. parçaın üç noktasına tıklandı
        clickElement(By.xpath("(//*[@class=\"Type__TypeElement-goli3j-0 cPwEdQ ellipsis-one-line PDPsYDh4ntfQE3B4duUI\"])[5]")); //listeden  çıkar
        clickElement(By.xpath("(//*[@class=\"Svg-ytk21e-0 jAKAlG\"])[19]"));// sol üst üç nokta
        clickElement(By.xpath("(//*[@class=\"Type__TypeElement-goli3j-0 cPwEdQ ellipsis-one-line PDPsYDh4ntfQE3B4duUI\"])[5]"));
        clickElement(By.xpath("//*[@class=\"ButtonInner-sc-14ud5tc-0 jHsQoF encore-bright-accent-set\"]"));







    }


}
