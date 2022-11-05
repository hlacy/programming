import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(5, Calculator.add(3, 2));
    }

    @Test
    void multiply() {
        assertAll(() -> assertEquals(4, Calculator.multiply(2, 2)),
                () -> assertEquals(-4, Calculator.multiply(2 , -2)),
                () -> assertEquals(17, Calculator.multiply(-2, -8.5)),
                () -> assertEquals(0, Calculator.multiply(0, -456161661)));

    }
}