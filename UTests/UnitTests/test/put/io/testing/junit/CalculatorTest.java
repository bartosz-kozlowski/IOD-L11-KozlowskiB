package put.io.testing.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    //@BeforeAll
    //static void setUp() {
    //    calculator = new Calculator();
    //}

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd1() {
        assertEquals(calculator.add(5,5), 10);
    }
    @Test
    public void testAdd2() {
        assertEquals(calculator.add(1,-3), -2);
    }
    @Test
    public void testMultiply1() {
        assertEquals(calculator.multiply(5,5), 25);
    }
    @Test
    public void testMultiply2() {
        assertEquals(calculator.multiply(1,-3), -3);
    }
    @Test
    void testAddPositiveNumbers() {
        assertThrows(IllegalArgumentException.class, () -> calculator.addPositiveNumbers(-2, 5));
    }


}