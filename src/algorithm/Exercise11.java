package algorithm;

public class Exercise11 {
    public static void main(String[] args) {
        int s = 3;
        int y = 2;
        int x = 11;
        int totalPencil = 0;
        int i = 0;
        int count = 0;
        while (totalPencil < x) {
            i++;
            totalPencil++;
            if (i == s) {
                totalPencil += y;
                i=0;
            }
            count++;
        }
        System.out.println(count);
    }
}
