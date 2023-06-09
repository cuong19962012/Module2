package algorithm;

import java.util.ArrayList;

public class Exercise16 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5};
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            arrayList.add(sum(i, arr));
        }
        System.out.println(arrayList);
    }

    static int sum(int index, int[] arr) {
        if (index == 0)
            return arr[0];
        return arr[index] + sum(index - 1, arr);
    }
}
