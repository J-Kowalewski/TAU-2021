import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    public void setUp(){
        calc = new Calculator();
        System.out.println("Before");
    }

    @AfterEach
    public void tearDown(){
        calc = null;
        System.out.println("After");
    }

    @Test
    public void testPower1() throws Exception {
        long result = calc.power(3,2);
        assertEquals(9,result);
        System.out.println("Test1");
    }

    @Test
    public void testPower2() throws Exception {
        long result = calc.power(4,3);
        assertEquals(64,result);
        System.out.println("Test2");
    }

    @Test
    public void testDelta1() throws Exception {
        long result = calc.delta(1,1,-6);
        assertEquals(25,result);
    }

    @Test
    public void testDelta2() throws Exception {
        long result = calc.delta(1,2,1);
        assertEquals(0,result);
    }

    @Test
    public void testDelta3() throws Exception {
        long result = calc.delta(1,4,3);
        assertEquals(4,result);
    }

    @Test
    public void testDelta4() throws Exception {
        long result = calc.delta(1,3,-4);
        assertEquals(25,result);
    }

    @Test
    public void testDelta5() throws Exception {
        long result = calc.delta(1,6,8);
        assertEquals(4,result);
    }

    @Test
    public void testDelta6() throws Exception {
        long result = calc.delta(7,2,-4);
        assertEquals(116,result);
    }

    @Test
    public void testDelta7() throws Exception {
        long result = calc.delta(9,5,0);
        assertEquals(25,result);
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct handling of zero")
    public void testMultiplyWithZero() {
        assertEquals(0, calc.multiply(0,5), "Multiple with zero should be zero");
        assertEquals(0, calc.multiply(5,0), "Multiple with zero should be zero");
    }

    @RepeatedTest(2)
    @DisplayName("Delta should be 0")
    public void testDeltaZero() throws Exception {
        assertEquals(0, calc.delta(1,2,1), "Delta should be zero");
    }

    @RepeatedTest(3)
    @DisplayName("a raised to power of 0 should be 1")
    public void testPowerShouldBeOne() throws Exception {
        assertEquals(1, calc.power(2,0), "a raised to power of 0 should be 1");

    }
}