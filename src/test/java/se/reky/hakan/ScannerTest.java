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

    @BeforeEach
    public void setUp(){
        String input = "Hello";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        scanner = new Scanner(System.in);
    }

    @Test
    public void testReadLine(){
        String result = scanner.nextLine();
        assertEquals("Hello", result);
    }
    @AfterEach
    public void tearDown(){
        scanner.close();
    }

}
