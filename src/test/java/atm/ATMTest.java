package atm;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private ATM atm;

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        atm = new ATM();
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    void process() {
        atm.process(125);
        assertEquals("Number of 5`s: 1\n" +
                "Number of 10`s: 0\n" +
                "Number of 20`s: 6", outputStreamCaptor.toString().trim());
    }
    @Test
    public void testProcessError(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            atm.process(126);;
        });
        assertEquals("1 left!", outputStreamCaptor.toString().trim());
    }
}
