import org.junit.Test;

import static org.junit.Assert.*;

public class MathTest {
    @Test
    public void triangleAreaTest() {
        int h = 5;
        int a = 10;

        double rectangleAreaResult = RectangleLib.getTriangleArea(a, h);
        System.out.println(rectangleAreaResult);

        assertEquals(25.0, rectangleAreaResult, 0.1);
    }

    @Test
    public void circleAreaTest() {
        int r = 3;
        double circleAreaResult = RectangleLib.getCircleArea(r);
        System.out.println(circleAreaResult);

        assertEquals(28.27, circleAreaResult, 0.01);
    }

    @Test
    public void checkPrimeTest() {
        assertTrue(Main.isPrime(13));
    }
}
