package algorithm;

import java.util.Arrays;

public class Exercise20 {
    public static void main(String[] args) {
        String[] arrString = {"abc", "", "aaa", "a", "zz", "123"};
        for (int i = 0; i < arrString.length - 1; i++) {
            int min = arrString[i].length();
            int index = i;
            for (int j = i + 1; j < arrString.length; j++) {
                if (min > arrString[j].length()) {
                    min = arrString[j].length();
                    index = j;
                }
            }
            if (min != arrString[i].length()) {
                String temp = arrString[i];
                arrString[i] = arrString[index];
                arrString[index] = temp;
            }
        }
        System.out.println(Arrays.toString(arrString));
    }
}
