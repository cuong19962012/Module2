import java.io.CharArrayReader;
import java.io.IOException;
import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] a={178, 120, -1, 190, 155, -1, -1, -1, 162};
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]!=-1){
                int min=a[i];
                int j;
                for (j = i+1; j < a.length; j++) {
                    if(min>a[j]&&a[j]!=-1)
                    { min=a[j];}
                }
                if(a[i]!=min){
                    int temp=a[i];
                    a[i]=min;
                    a[j-1]=temp;}
            }
        }
        System.out.println(Arrays.toString(a));
    }
}