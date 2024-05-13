package se.reky.hakan;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
public class ScannerTest {

    private Scanner scanner;
    private final String input = "Hello";

    @BeforeEach
    public void setUp(){
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        scanner = new Scanner(System.in);
    }

    @Test
    public void testReadLine(){
        //Check if the scanner.nextLine is equals to the input
        String result = scanner.nextLine();
        assertEquals(input, result);
    }


}
