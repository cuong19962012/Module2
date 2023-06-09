package algorithm;

import ss12_java_collection_framework.thuc_hanh.create_binary_search_tree.Tree;

import java.util.TreeSet;

public class Exercise13 {
    public static void main(String[] args) {
        int[] arr = {10, 3, 8, 1, 9, 4, 9};
        TreeSet<Integer> treeSet = new TreeSet<>();
        for (Integer i : arr) {
            treeSet.add(i);
        }
        treeSet.remove(treeSet.last());
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == treeSet.last()) {
                System.out.println(i);
                break;
            }

        }
    }
}
