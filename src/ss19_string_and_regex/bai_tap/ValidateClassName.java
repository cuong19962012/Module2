package ss19_string_and_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Tên Lớp: ");
        String className = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[CAP]\\d{4}[GHIK]$");
        Matcher matcher = pattern.matcher(className);
        boolean check = matcher.matches();
        if (check)
            System.out.println("Tên lớp đúng");
        else
            System.out.println("Tên lớp sai");
    }
}
