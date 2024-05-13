package se.reky.hakan;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class IOHandlerTest {
    private IOHandler iOHandlerInput(String dataForScanner) {
        Scanner scanner = new Scanner(dataForScanner);
        return new IOHandler(scanner);
    }

    @Test
    void hasNextInt() {
        //dataForScanner set to any number, result should return true when we enter a number into the string
        //and return false for anything that is not a number
        IOHandler ioHandler = iOHandlerInput("2");
        boolean result = ioHandler.hasNextInt();
        assertTrue(result);
    }
}