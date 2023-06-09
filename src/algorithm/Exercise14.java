package algorithm;

import java.util.HashSet;

public class Exercise14 {
    public static void main(String[] args) {
        String s = "cabca";
        HashSet<Character> hashSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            hashSet.add(s.charAt(i));
        }
        System.out.println(hashSet.size());
    }
}
