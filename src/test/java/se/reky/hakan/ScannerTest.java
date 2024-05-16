package se.reky.hakan;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;
public class ScannerTest {


    public Scanner createScanner(String input){
        return new Scanner(input);
    }

    @Test
    public void testReadLine(){
        //Check if the scanner.nextLine is equals to the input
        Scanner input = createScanner("Hello");
        assertEquals("Hello", input.nextLine());
    }


}
