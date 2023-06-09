package algorithm;

import java.util.*;

public class Exercise7 {
    public static void main(String[] args) {
        //List<Integer> listPrime = new ArrayList<>();
        Set<Integer> listPrime = new TreeSet<>();
        int[][] matrix = {{1, 2, 8, 43}, {9, 49, 11, 7}, {11, 23, 4, 0}, {1, 2, 6, 51}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (isPrime(matrix[i][j]) && !listPrime.contains(matrix[i][j])) {
                    listPrime.add(matrix[i][j]);
                }
            }
        }
//        for (int i = 0; i < listPrime.size(); i++) {
//            for (int j = listPrime.size() - 1; j > i; j--) {
//                if (listPrime.get(j) < listPrime.get(j - 1)) {
//                    int temp = listPrime.get(j);
//                    listPrime.set(j, listPrime.get(j - 1));
//                    listPrime.set(j - 1, temp);
//                }
//            }
//        }

        System.out.println(listPrime);
    }

    static boolean isPrime(int number) {
        if (number < 2)
            return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
