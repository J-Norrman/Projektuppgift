package se.reky.hakan.util;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import se.reky.hakan.GameException;

import static org.junit.jupiter.api.Assertions.*;

class GameUtilTest {
    private GameUtil gameUtil;

    @BeforeEach
    void setUp() {
        gameUtil = new GameUtil();
    }
    @Test
    void toLowerCaseButFirstLetterCapitalized() {
        //Assert that method throws desired exception with a null input
        assertThrows(GameException.class, () -> {
            gameUtil.toLowerCaseButFirstLetterCapitalized(null);
        });
    }
}