package demo.hwsw;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TC2_CalculatorTest {

    @Test
    void testSum() {
        Calculator c = new Calculator();
        int result = c.sum(10,15);

        assertEquals(25, result);
    }
}
