package ss11_stack_and_queue.bai_tap.reverse_integer_array_use_stack;

import java.util.Arrays;
import java.util.Stack;

public class StringReverse {
    public static void main(String[] args) {
        Stack<String> wStack = new Stack<>();
        String str = "Code Gym";
        String output = "";
        String[] mWord = str.split("");
        System.out.println(Arrays.toString(mWord));
        for (String e : mWord) {
            wStack.push(e);
            System.out.print(e);
        }
        for (int i = 0; i < mWord.length; i++) {
            mWord[i] = wStack.pop();
            output += mWord[i];
        }
        System.out.println("\n" + output);
    }
}
