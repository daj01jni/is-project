import org.junit.*;
import static org.junit.Assert.*;

public class SimpleTest {

    @Test
    public void test_fail() {
        System.out.println("testing...");
        assertTrue(5 == 5);
    }
}
