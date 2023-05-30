package ss19_string_and_regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số điện thoại: ");
        String phoneNumber = scanner.nextLine();
        Pattern pattern = Pattern.compile("^\\(\\d{2}\\)-\\(0\\d{9}\\)$");
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean check = matcher.matches();
        if (check)
            System.out.println("Số điện thoại đúng");
        else
            System.out.println("Số điện thoại sai");
    }
}
