package ss17_io_binary_file_and_serialization.bai_tap.copy_binary_file;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        byte[] arr = readFile("src/ss17_io_binary_file_and_serialization/bai_tap/copy_binary_file/source.dat");
        writeFile("src/ss17_io_binary_file_and_serialization/bai_tap/copy_binary_file/target.dat", arr);
        File file = new File("src/ss17_io_binary_file_and_serialization/bai_tap/copy_binary_file/target.dat");
        System.out.println("Số Byte trong tệp đích là: " + file.length());
    }

    public static void writeFile(String path, byte[] arr) {
        File fileSource = new File("src/ss17_io_binary_file_and_serialization/bai_tap/copy_binary_file/source.dat");
        try {
            OutputStream os = new FileOutputStream(path);
            for (int i = 0; i < fileSource.length(); i++) {
                byte b = arr[i];
                os.write(b);
            }
            os.close();
        } catch (FileNotFoundException e) {
            System.out.println("Tập đích không tồn tại");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] readFile(String source) {
        try {
            InputStream is = new FileInputStream(source);
            byte[] arr = new byte[20];
            is.read(arr);
            is.close();
            return arr;
        } catch (FileNotFoundException e) {
            System.out.println("Tập nguồn không tồn tại");
        } catch (IOException e) {
            System.out.println("Có lỗi gì đó");
        }
        return null;
    }

}
