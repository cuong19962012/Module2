import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Main <E>{

    public void main(String[] args) {
        HashMap<Integer,Integer>
    }
    public static java.util.ArrayList<Integer> insert_even_values(java.util.HashMap<Integer, Integer> hashMap) {
        //Your code here
        ArrayList<Integer> list=new ArrayList<>();
        for(Integer k:hashMap.keySet())
        {
            if(hashMap.get(k)%2==0)
                list.add(hashMap.get(k));
        }
        return list;
    }
}