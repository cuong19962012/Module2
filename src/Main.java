// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 5; j > 0; j--) {
                if (j == i)
                    System.out.print(""+i+"");
                else
                    System.out.printf(" ");
            }
            for (int j = 0; j < 6; j++) {
                if (j == i)
                    System.out.print(""+j+"");
                else
                    System.out.printf(" ");
            }
            System.out.println("");
        }
        for (int i = 5; i > 0; i--) {
            for (int j = 5; j > 0; j--) {
                if (j == i)
                    System.out.print(""+i+"");
                else
                    System.out.printf(" ");
            }
            for (int j = 0; j < 6; j++) {
                if (j == i)
                    System.out.print(""+j+"");
                else
                    System.out.printf(" ");
            }
            System.out.println("");
        }

    }
}