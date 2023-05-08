package ss2_loop_and_array.bai_tap;

public class Lower100PrimeMultiple {
    static boolean prime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int number = 2;
        while (number < 100) {
            if (prime(number)) {
                System.out.println(number);
            }
            number++;
        }
    }
}
