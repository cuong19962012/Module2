package furuma_resort.utils.employee_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteFileEmployee {
    public static void writeFile(List<String> data, String path,boolean append) {
        File file = new File(path);
        try {
            FileWriter fileWriter = new FileWriter(file,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String e : data) {
                bufferedWriter.write(e);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println("Không tìm thấy File!!");
        }
    }
}
