package ss3_array_and_function.bai_tap;

import java.util.Scanner;

public class CountRepeat {
    public static void main(String[] args) {
        String string = "abcdee";
        System.out.println("Input string: " + string);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a char: ");
        char charFind = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == charFind) {
                count++;
            }
        }
        System.out.println("Char repeat times is: " + count + " times");
    }
}
