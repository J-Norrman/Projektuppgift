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
        IOHandler ioHandler = iOHandlerInput("4");
        boolean result = ioHandler.hasNextInt();
        assertTrue(result);
    }
}