package algorithm;

public class Exercise9 {
    public static void main(String[] args) {
        int l = 5;
        int r = 25;
        int count = 0;
        for (Integer i = l; i <= r; i++) {
            String intStr = i.toString();
            if (intStr.charAt(0) == intStr.charAt(intStr.length() - 1))
                count++;
        }
        System.out.println(count);
    }
}
