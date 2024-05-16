package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Disabled
class PlayerControllerTest {
    WebDriver webDriver;
    String URL = "http://localhost:8080";

    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void setUp(){
        webDriver = new ChromeDriver();
    }
    @Test
    void testListPlayers() {
        webDriver.get(URL+"/players");
        List <WebElement> playerList = webDriver.findElements(By.tagName("li"));
        assertEquals(2,playerList.size());
    }

    @Test
    void testPlayerName(){
        webDriver.get(URL+"/players");
        WebElement player = webDriver.findElement(By.className("player-name"));
        assertTrue(player.isDisplayed());
    }

    @Test
    void testTitle(){
        webDriver.get(URL+"/players");
        assertEquals("Players List",webDriver.getTitle());
    }

    @Test
    void testButtonText(){
        webDriver.get(URL+"/players");
        String button = webDriver.findElement(By.tagName("button")).getText();
        assertEquals("Logga in",button);
    }

    @Test
    void testClickLink(){
        webDriver.get(URL+"/players");
        WebElement findLink = webDriver.findElement(By.tagName("a"));
        findLink.click();
        WebElement element = new WebDriverWait(webDriver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(By.className("player-name")));
        assertTrue(element.isDisplayed());

    }
    @AfterEach
    public void tearDown(){
        if (webDriver != null) {
            webDriver.quit();
        }
    }
}