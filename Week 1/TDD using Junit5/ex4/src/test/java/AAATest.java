import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAATest {
    int a;
    int b;

    @Before
    public void setUp() {
        System.out.println("Setup Method");
        a = 10;
        b = 20;
    }

    @Test
    public void testAddition() {
        int expected = 30;
        int actual = a + b;
        assertEquals(expected, actual);
    }

    @After
    public void tearDown() {
        System.out.println("Teardown Method");
    }
}