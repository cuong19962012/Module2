package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileCopyText {
    static List<Integer> copyFile(String path) {
        List<Integer> list = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(Integer.parseInt(line));
            }
        } catch (IOException e) {
            System.out.println("File không tìm thấy hoặc nội dung sai ");
        }
        return list;
    }

    static void writeFile(String path,List<Integer> list) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Integer e : list) {
                bufferedWriter.write(""+e);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("File không tìm thấy hoặc nội dung sai ");
        }
    }

    public static void main(String[] args) {
        writeFile("src/ss16_io_text_file/bai_tap/copy_file_text/output.text",copyFile("src/ss16_io_text_file/bai_tap/copy_file_text/input.csv"));
    }

}
