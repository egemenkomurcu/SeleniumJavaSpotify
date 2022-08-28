package testmaster.selenium.test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import testmaster.selenium.driver.Driver;
import testmaster.selenium.pages.GuestPage;
import testmaster.selenium.pages.HomePage;
import testmaster.selenium.pages.LoginPage;

public class SpotifyTest extends Driver {

GuestPage guestPage;
LoginPage loginPage;
HomePage homePage;
    @Test
    public void loginTest(){

      guestPage = new GuestPage(driver);
      guestPage.clickSignUp();
        loginPage = new LoginPage(driver);
        loginPage.typeEmailAndPassword();
        homePage = new HomePage(driver);
        homePage.sameName();
        homePage.newTrackList();
        homePage.changeTracklist();
        homePage.clickSearchButton();
        homePage.clickSongs();
        homePage.clickTrackList();
        homePage.deleteLists();



        /**
        https://github.com/YunusBalaman/TestmasterSeleniumProject
         */
        System.out.println("Spotify");

      //  homePage.clickSongs();
    }
}
