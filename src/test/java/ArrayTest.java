
import org.junit.Test;


import static org.junit.Assert.*;

public class ArrayTest {

    @Test
    public void checkAsc() {
        boolean isAsc = true;

        int[] testingArray = Main.array;

        for(int i = 0; i < testingArray.length - 1; i++) {
            if(testingArray[i] > testingArray[i + 1]) {
                isAsc = false;
                break;
            }
        }
        assertTrue(isAsc);
    }

    @Test
    public void checkIndexValues() {
        boolean isOk = true;
        int[] testingArray = Main.array;

        for(int i = 0; i < testingArray.length; i++) {
            if(i % 2 == 0 && testingArray[i] % 2 != 0
                    || (i % 2 != 0 && testingArray[i] % 2 == 0)) {
                isOk = false;
                break;
            }
        }
        assertTrue(isOk);
    }

    @Test
    public void testSum() {
        int sum1 = 0; //четные
        int sum2 = 0; //нечетные

        for(int number : Main.array) {
            if(number % 2 == 0) {
                sum1 += number;
            } else sum2 += number;
        }

        assertTrue(sum1 >= sum2 * 2);
    }

    @Test
    public void checkSumLess() {
        int sum = 0;
        int limit = 30;

        for(int number : Main.array) {
            sum += number;
        }

        assertTrue(sum < limit);
    }
}
