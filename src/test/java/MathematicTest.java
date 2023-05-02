import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathematicTest {

    @Test
    void checking_sum_of_a_and_b() {
        // GIVEN
        int a = 5;
        int b = 7;
        int expected = a+b;

        // WHEN
        int result = Mathematic.sum( a, b);

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void counter_checking_sum_of_a_and_b() {
        // GIVEN
        int a = 5;
        int b = 7;
        int expected = 13;

        // WHEN
        int result = Mathematic.sum( a, b);

        // THEN
        assertNotEquals(expected, result);
    }
}
