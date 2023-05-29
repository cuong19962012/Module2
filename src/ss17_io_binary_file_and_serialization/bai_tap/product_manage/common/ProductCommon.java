package ss17_io_binary_file_and_serialization.bai_tap.product_manage.common;

import ss17_io_binary_file_and_serialization.bai_tap.product_manage.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductCommon {
    private static final String PATH = "src/ss17_io_binary_file_and_serialization/bai_tap/product_manage/common/data.dat";

    public void writeFile(List<Product> list) {

        File file = new File(PATH);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(list);
            objectOutputStream.close();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public List<Product> readFile() {
        File file = new File(PATH);
        List<Product> list;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            list = (List<Product>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;

    }
}
