package furuma_resort.utils.employee_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadFileEmployee {
    public static List<String> readFile(String path) {
        List<String> data = new ArrayList<>();
        File file = new File(path);
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                data.add(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy File!!!");
        } catch (IOException e) {
            System.out.println("Lỗi đọc File!!!");
        }
        return data;
    }
}
