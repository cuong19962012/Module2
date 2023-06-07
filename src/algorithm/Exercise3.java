package algorithm;

public class Exercise3 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 3};
        int totalBefore = 0;
        int totalAfter = 0;
        for (int i = 1; i < a.length - 1; i++) {
            totalAfter=0;
            totalBefore=0;
            for (int j = i - 1; j > -1; j--) {
                totalBefore += a[j];
            }
            for (int j = i + 1; j < a.length; j++) {
                totalAfter += a[j];
            }
        }
        if(totalBefore==totalAfter)
            System.out.println("True");
        else
            System.out.println("False");
    }
}
