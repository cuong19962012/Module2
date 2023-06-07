package algorithm;

import java.util.HashSet;
import java.util.Set;

public class Exercise2 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "BCd";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            if (s2.contains("" + s1.charAt(i)))
                set.add(s1.charAt(i));
        }
        System.out.println(set.size());
    }
}
