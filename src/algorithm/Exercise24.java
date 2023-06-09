package algorithm;

import java.util.ArrayList;

public class Exercise24 {
    public static void main(String[] args) {
        Integer[] arr = {13, 4456, 723424, 234234, 534234};
        ArrayList<Long> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (Integer.valueOf(arr[i].toString().charAt(0)) % 2 != 0)
                arrayList.add((long) arr[i]);
        }
        System.out.println(arrayList);
    }
}
