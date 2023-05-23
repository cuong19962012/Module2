package ss11_stack_and_queue.bai_tap;

import java.util.Stack;

public class Bracket {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        String str = "(– b + ((b^2 – 4*a*c)^(0.5/ 2*a)) ";
        String[] arr = str.split("");
        boolean bracketCorrect = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("(")) {
                stack.push(arr[i]);
            }
            if (arr[i].equals(")")) {
                if (stack.isEmpty()) {
                    bracketCorrect = false;
                    break;
                }
//                if (stack.pop() == arr[i]) {
//                    bracketCorrect = false;
//                    break;
//                }
                stack.pop();
            }
        }
        if (stack.isEmpty() && bracketCorrect)
            System.out.println("Well");
        else
            System.out.println("Not Well");
    }
}
