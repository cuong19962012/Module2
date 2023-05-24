import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main <E>{

    public static void main(String[] args) {
        System.out.println(4303%10);
    }
    public static boolean isPalindrome (String str) {
        //Your code here
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i))
            { return false;}
        }
        return true;
    }
}