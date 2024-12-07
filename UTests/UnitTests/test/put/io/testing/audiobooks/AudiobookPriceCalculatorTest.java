package put.io.testing.audiobooks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AudiobookPriceCalculatorTest {
    private AudiobookPriceCalculator calculator;
    private Audiobook audiobook;
    private Customer customer;

    @BeforeEach
    public void setUp() {
        calculator = new AudiobookPriceCalculator();
        audiobook = new Audiobook("Pan Tadeusz", 10.0);
    }

    @Test
    public void testSubscriber() {
        customer = new Customer("Marek", Customer.LoyaltyLevel.STANDARD, true);
        assertEquals(calculator.calculate(customer, audiobook), 0.0);
    }

    @Test
    void testLoyaltySilver() {
        customer = new Customer("Bartosz", Customer.LoyaltyLevel.SILVER, false);
        assertEquals(calculator.calculate(customer, audiobook), 9.0);
    }

    @Test
    void testLoyaltyGold() {
        customer = new Customer("Adam", Customer.LoyaltyLevel.GOLD, false);
        assertEquals(calculator.calculate(customer, audiobook), 8.0);
    }

    @Test
    void testLoyaltyStandard() {
        customer = new Customer("Paweł", Customer.LoyaltyLevel.STANDARD, false);
        assertEquals(calculator.calculate(customer, audiobook), 10.0);
    }
}