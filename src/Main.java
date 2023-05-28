import java.io.CharArrayReader;
import java.io.IOException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = "12:05:45PM";
        int head = Integer.parseInt(String.valueOf(s.charAt(0)) + String.valueOf(s.charAt(1)));
        String tail = String.valueOf(s.charAt(s.length() - 2)) + String.valueOf(s.charAt(s.length() - 1));
        if (tail.equals("PM")) {
            if (head != 12) {
                head = head + 12;
                s = head + s.substring(2, s.length() - 2);
            } else {
                s = s.substring(0, s.length() - 2);
            }
        } else {
            if (head != 12) {
                s = s.substring(0, s.length() - 2);
            } else {
                s = "00" + s.substring(2, s.length() - 2);
            }
        }
        System.out.println(s);
    }
}