package algorithm;

public class Exercise21 {
    public static void main(String[] args) {
        int number = 12;
        int resultFactorial = factorial(number);
        int result;
        while (resultFactorial % 10 == 0) {
            resultFactorial /= 10;
        }
        System.out.println(resultFactorial%10);
    }

    static int factorial(int number) {
        if (number == 1)
            return 1;
        return number * factorial(number - 1);
    }
}
