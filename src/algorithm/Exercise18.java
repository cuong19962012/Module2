package algorithm;

import java.util.ArrayList;
import java.util.TreeSet;

public class Exercise18 {
    public static void main(String[] args) {
        int[] arr = {6, 1, 3, 8, 11};
        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (Integer i : arr) {
            treeSet.add(i);
        }
        for (int i = treeSet.first() + 1; i < treeSet.last(); i++) {
            if (!treeSet.contains(i))
                arrayList.add(i);
        }
        System.out.println(arrayList);
    }
}
