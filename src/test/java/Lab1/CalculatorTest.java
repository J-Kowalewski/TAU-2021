package Lab1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    public void testPower1() {
        int result = calc.power(3,2);
        assertEquals(9,result);
        System.out.println("Test1");
    }


    @Test
    public void testPower2() {
        int result = calc.power(4,3);
        assertEquals(64,result);
        System.out.println("Test2");
    }
}
