public class Main {

    public static int[] array = {2, 3, 4, 5, 10};


    public static void main(String[] args) {
        System.out.println("Started!");
    }

    public static boolean isPrime(int number) {
        if (number <= 0) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
