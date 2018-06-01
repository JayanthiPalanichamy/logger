import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class LoggerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }
    @Test
    public void returnErrorLogWhenDividedByZero() {
        Client client = new Client();
        client.divide(1,0);
        assertEquals("Divide By Zero\n", outContent.toString());
    }

    @Test
    public void loggerReturnsByWritingInFile() {
        Client client = new Client();
        client.divide(1,0);
         outContent.toString();
    }
}
