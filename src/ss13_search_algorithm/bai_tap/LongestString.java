package ss13_search_algorithm.bai_tap;

public class LongestString {
    public static void main(String[] args) {
        String str = "abcabcdgabxy";
        String temp = "";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            temp = "" + str.charAt(i);
            int flag = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (flag < str.charAt(j)) {
                    temp += str.charAt(j);
                    flag = str.charAt(j);
                } else
                    break;
            }
            if (result.length() < temp.length()) {
                result = temp;
            }
        }
        System.out.println(result);
    }
}
