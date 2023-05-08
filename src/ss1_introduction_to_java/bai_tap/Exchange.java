package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Usd Amount: ");
        double amount = scanner.nextDouble();
        double vnd = amount * rate;
        System.out.print("Vnd: " + vnd);
    }
}
