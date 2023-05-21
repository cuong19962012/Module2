package ss11_stack_and_queue.bai_tap;

import java.util.*;

public class BinaryConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.println("---Converter From Decimal To Binary---");
        System.out.print("Enter a random decimal : ");
        int decimal = scanner.nextInt();
        do {
            stack.push(decimal % 2);
            decimal /= 2;
        } while (decimal != 0);
        System.out.print("Result: ");
        for (int i = 0;!stack.isEmpty(); i++) {
            System.out.print(stack.pop());
        }
    }
}
