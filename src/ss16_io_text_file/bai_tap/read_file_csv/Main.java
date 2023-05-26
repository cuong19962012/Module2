package ss16_io_text_file.bai_tap.read_file_csv;

import java.io.*;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    static TreeSet<Country> readInput(String path) {
        TreeSet<Country> set = new TreeSet<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arr = line.split(",");
                set.add(new Country(Integer.parseInt(arr[0]), arr[1], arr[2]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return set;
    }

    public static void main(String[] args) {
        TreeSet<Country> set = readInput("src/ss16_io_text_file/bai_tap/read_file_csv/input.csv");
        for (Country c : set) {
            System.out.println(c);
        }
    }
}
