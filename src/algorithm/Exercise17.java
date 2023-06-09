package algorithm;

import java.util.HashMap;

public class Exercise17 {
    public static void main(String[] args) {
        String string1 = "1acd";
        String string2 = "c1ad";
        System.out.println(characterRearrangement(string1,string2));
    }

    static boolean characterRearrangement(String str1, String str2) {
        HashMap<Character, Integer> map = new HashMap<>();
        if (str1.length() != str2.length())
            return false;
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i)))
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            else
                map.put(str1.charAt(i), 1);
            if (map.containsKey(str2.charAt(i)))
                map.put(str2.charAt(i), map.get(str2.charAt(i)) + 1);
            else
                map.put(str2.charAt(i), 1);
        }
        for (Character character : map.keySet()) {
            if (map.get(character) % 2 != 0)
                return false;
        }
        return true;
    }
}
