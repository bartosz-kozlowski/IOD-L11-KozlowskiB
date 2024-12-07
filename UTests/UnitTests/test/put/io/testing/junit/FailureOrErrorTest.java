package put.io.testing.junit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FailureOrErrorTest {

    @Test
    public void test1() {
        assertEquals(1, 2);
    }

    @Test
    public void test2() {
        assertEquals(1/0, 0);
    }

    @Test
    public void test3() {
        try {
            assertEquals(1, 2);
        } catch (Throwable t) {
            t.printStackTrace();
            System.out.println("Klasa: " + t.getClass().getName());
        }
    }

}