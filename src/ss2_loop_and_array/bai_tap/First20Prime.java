package ss2_loop_and_array.bai_tap;

public class First20Prime {
    public static boolean prime(int number) {
        if (number < 3) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        int number = 3;
        while (count != 20) {
            if (prime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

}
