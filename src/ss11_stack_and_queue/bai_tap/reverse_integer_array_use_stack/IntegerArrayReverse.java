package ss11_stack_and_queue.bai_tap.reverse_integer_array_use_stack;

import java.util.Stack;

public class IntegerArrayReverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = {1, 2, 3, 4, 5};
        for (int v : arr) {
            stack.push(v);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
            System.out.print(arr[i] + " ");
        }
    }
}
