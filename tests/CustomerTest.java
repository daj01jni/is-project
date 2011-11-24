import org.junit.*;
import static org.junit.Assert.*;

public class CustomerTest {

    private static Customer c;
    private static String name = "mr Cat";
    private static String address = "address";
    private static String email = "email";

    @BeforeClass
    public static void runBeforeClass()
    {
        c = new Customer(name, address, email);
    }

    @Test
    public void testName ()
    {
        assertTrue(c.getName() == "mr Cat");
    }

    @Test
    public void testChangeName ()
    {
        c.setName("mr Woof");
        assertTrue(c.getName() == "mr Woof");
    }

    @Test 
    public void testAddress ()
    {
        assertEquals(address, c.getAddress());
    }

    @Test
    public void testEmail ()
    {
      assertEquals(email, c.getEmail());
    }
}
