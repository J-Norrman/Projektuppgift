package se.reky.hakan.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ActorTest extends Actor{
    private Actor player;
    private Actor monster;

    @BeforeEach
    void setUp() {
        player = new Player("player",10,7);
        monster = new Goblin("goblin",20,3);

    }

    @Test
    void testAttack() {
        //monster hp set to 20 in the setup, player attack is 7 so hp after the attack should be 13
        player.attack(monster);
        Assertions.assertEquals(13,monster.getHp());
    }

}