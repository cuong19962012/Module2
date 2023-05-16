package ss8_clean_code_and_refactoring.thuc_hanh.variable_extract;

public class FizzBuzz {
    public static String fizzBuzzBeforVariableExtract(int number) {
        if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
        if (number % 3 == 0)
            return "Fizz";
        if (number % 5 == 0)
            return "Buzz";
        return number + "";
    }

    public static String fizzBuzzAfterVariableExtract(int number) {
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz)
            return "FizzBuzz";
        if (isFizz)
            return "Fizz";
        if (isBuzz)
            return "Buzz";
        return number + "";
    }
}
