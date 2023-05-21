package ss11_stack_and_queue.bai_tap;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        String[] arr = str.split("");
        boolean isPalindrome = true;
        Queue<String> queue = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i].toLowerCase());
            stack.push(arr[i].toLowerCase());
        }
        while (!queue.isEmpty() || !stack.isEmpty()) {
            if (!stack.pop().equals(queue.poll())) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Là Chuỗi Palindrome");
        } else {
            System.out.println("Không phải chuỗi palindrome");
        }
    }
}
