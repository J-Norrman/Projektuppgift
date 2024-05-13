package se.reky.hakan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Player;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class PlayerInteractionTest {
    private Player player;

    private PlayerInteraction playerInteraction(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        IOHandler ioHandler = new IOHandler(scanner);
        return new SimplePlayerInteraction(ioHandler);
    }

    @BeforeEach
    void setUp() {
        player = new Player();
    }
    @Test
    void testUpdatePlayerHealth() {
        playerInteraction("").updatePlayerHealth(player,10);
        Assertions.assertEquals(10,player.getHp());
    }
    @Test
    void testPlayerSetup(){
        playerInteraction("Benny").setupPlayer(player);
        Assertions.assertEquals("Benny",player.getName());

    }

}