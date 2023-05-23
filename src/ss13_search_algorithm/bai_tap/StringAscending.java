package ss13_search_algorithm.bai_tap;

public class StringAscending {

    public static void main(String[] args) {
        String str = "Welcome";
        String temp = "";
        String result = "";
        int flag;
        for (int i = 0; i < str.length(); i++) {
            temp = "";
            temp += str.charAt(i);
            flag =  str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (flag < str.charAt(j))
                    temp += str.charAt(j);
                flag = str.charAt(j);
            }
            if (temp.length() > result.length()) {
                result = temp;
            }
        }
        System.out.println(result);
    }
}
