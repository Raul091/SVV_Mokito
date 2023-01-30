import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleCalculatorTest {
    @Test
    void testTwoPlusTwoIsFour() {
        SimpleCalculator calculate = new SimpleCalculator();
        assertEquals(4, calculate.add(2, 2), "This should equal 4");
    }
}
