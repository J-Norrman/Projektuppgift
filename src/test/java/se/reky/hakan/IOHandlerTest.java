package se.reky.hakan;

import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class IOHandlerTest {
    private IOHandler iOHandlerInput(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        return new IOHandler(scanner);
    }

    @Test
    void testHasNextInt() {
        //dataForScanner set to any number, result should return true when we enter a number into the string
        //and return false for anything that is not a number
        IOHandler ioHandler = iOHandlerInput("2");
        boolean result = ioHandler.hasNextInt();
        assertTrue(result);
    }
}