import com.example.app.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void shouldPrintHelloWorld() {
        assertEquals(1, Main.factorial(2));
    }
}
