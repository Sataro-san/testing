import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class FirstTest {
    @Test
    public void checkSumTest() {
        assertEquals(4, MyCalc.sum(2, 2));
    }

    @Test
    public void checkBoolean() {
        int currentDay = LocalDate.now().getDayOfWeek().getValue();
        assertTrue(currentDay > 2);
    }
}
